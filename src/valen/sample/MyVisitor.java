package valen.sample;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import valen.parser.lenguajesBaseVisitor;
import valen.parser.lenguajesParser;
import valen.sample.exceptions.CondicionInaceptable;
import valen.sample.exceptions.DivisionIndebida;
import valen.sample.exceptions.ErrorImprimirVacio;
import valen.sample.exceptions.VariableNoDeclarada;

import java.util.HashMap;
import java.util.Map;

public class MyVisitor extends lenguajesBaseVisitor<Integer>  {
    Map<String, Integer> memoria=new HashMap<>();
    public String getCadena() {
        return cadena;
    }
    String cadena="";

    @Override public Integer visitCascaron(lenguajesParser.CascaronContext ctx) {
        //System.out.println("1er visita");
        return visitChildren(ctx);
    }

    @Override public Integer visitInt(lenguajesParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override public Integer visitId(lenguajesParser.IdContext ctx) {
        int value;
        if(memoria.containsKey(ctx.ID().getText()))
        {
                value = memoria.get(ctx.ID().getText());
        }
        else {
            throw new VariableNoDeclarada(ctx.ID().getText(), ctx.ID().getSymbol());
        }
        return value;
    }

    @Override public Integer visitSumRes(lenguajesParser.SumResContext ctx) {

        int izq = visit(ctx.expr(0));
        int der = visit(ctx.expr(1));
        int resultado;
        //System.out.println(visit(ctx.SUMA())+visit(ctx.RESTA()));
        String op;
        try {
            op = ctx.prod_sumres().SUMA().getText();
        }catch (Exception ex){
            op="-";
        }


        if (op.equals("-")){
            resultado = izq - der;
        }else{
            resultado = izq + der;
        }

        //System.out.println("Suma "+resultado);
        return resultado;
    }

    @Override public Integer visitMulDiv(lenguajesParser.MulDivContext ctx) {
        int izq = visit(ctx.expr(0));
        int der = visit(ctx.expr(1));
        int resultado;
        String op;
        try {
            op = ctx.prod_muldiv().DIV().getText();
        }catch (Exception ex){
            op="*";
        }
        //System.out.println(""+izq + der+ op );


        if (op.equals("*")){
            //Se realiza la multiplicacion
            resultado = izq * der;
        }else{
            //Se realiza la Division
            if( der != 0)
                // Dividendo es desigual a 0, se realiza la operacion
                resultado = izq / der;
            else{
                // Lanzar error DivisionIndebida
                throw new DivisionIndebida(ctx.getText(),
                        ctx.prod_muldiv().DIV().getSymbol());
            }
        }
        return resultado;
    }

    @Override public Integer visitImpresionExpresion(lenguajesParser.ImpresionExpresionContext ctx) {
        if(ctx.expr() == null ){
            //System.out.println(ctx.expr());
            cadena += ctx.STRING().getText().substring(1,ctx.STRING().getText().length()-1);
        }else{
            String x= String.valueOf(visit(ctx.expr()));
            if(x.equals("null")){
                //throw new ErrorImprimirVacio();
                throw new ErrorImprimirVacio(ctx.expr().start);
            }else{
                cadena += x+"\n";
            }
        }
        return null;
    }

    @Override public Integer visitAsignacion(lenguajesParser.AsignacionContext ctx) {
        //System.out.println(visit(ctx.expr()));
        String variable = ctx.ID().getText();
        if(memoria.containsKey(variable)) {
            memoria.put(ctx.ID().getText(), visit(ctx.expr()));
        }else{
            throw new VariableNoDeclarada(variable, ctx.ID().getSymbol());
        }
        return null;
    }

    @Override public Integer visitDeclaracion(lenguajesParser.DeclaracionContext ctx) {
        //System.out.println(ctx.INTEGER().getText() + " "+ ctx.ID().getText()+ " "+ ctx.IGUAL());
        if(ctx.IGUAL() == null){
            //System.out.println("Entre cuando no existe valor");
            memoria.put(ctx.ID().getText(),0);
        }else{
            //System.out.println("Entre cuando si existe valor");
            memoria.put(ctx.ID().getText(), visit(ctx.expr()));
        }
        return null;
    }

    @Override public Integer visitParentesis(lenguajesParser.ParentesisContext ctx)    {
        //System.out.println("Parentesis "+visit(ctx.expr()));
        return visit(ctx.expr());
    }

    @Override public Integer visitDeclaracionMultiple(lenguajesParser.DeclaracionMultipleContext ctx) {
        //System.out.println("Hola, visitamos a DeclaracionMultiple");
        for(TerminalNode x:ctx.ID()){
            System.out.println(x.getText());
            memoria.put(x.getText(),0);

        }
        //System.out.println(ctx.ID().getText());
        return null;
    }

    @Override public Integer visitCondicion_if(lenguajesParser.Condicion_ifContext ctx) {

        //cadena += ""+visit(ctx.cond());
        if(visit(ctx.cond()) == 1){
            //cadena +="Visitar el interior\n";
            return visitChildren(ctx);
        }else {
            if (visit(ctx.cond()) == 0) {
                //cadena +="No visitar el interior\n";
                return null;
            } else {
                throw new CondicionInaceptable(ctx.CONDICION().getSymbol());
            }
        }
    }

    @Override public Integer visitCondicion_ifelse(lenguajesParser.Condicion_ifelseContext ctx) {
        if(visit(ctx.cond()) == 1){
            //cadena +="Visitar el interior\n";
            return visitChildren(ctx.test().cuerpo_condicion(0));
        }else {
            if (visit(ctx.cond()) == 0) {
                //cadena +="No visitar el interior\n";
                return visitChildren(ctx.test().cuerpo_condicion(1));
            } else {
                throw new CondicionInaceptable(ctx.CONDICION().getSymbol());
            }
        }
    }

    @Override public Integer visitComparacion(lenguajesParser.ComparacionContext ctx) {
        int izq = visit(ctx.expr(0));
        int der = visit(ctx.expr(1));
        int resul=0;

        if (ctx.SIGNO().getText().equals("==")){
            if(izq == der){
                resul= 1;
            }else{
                resul= 0;
            }
        }

        if (ctx.SIGNO().getText().equals("!=")){
            if(izq != der){
                resul= 1;
            }else{
                resul= 0;
            }
        }

        if (ctx.SIGNO().getText().equals("<=")){
            if(izq <= der){
                resul= 1;
            }else{
                resul= 0;
            }
        }

        if (ctx.SIGNO().getText().equals(">=")){
            if(izq >= der){
                resul= 1;
            }else{
                resul= 0;
            }
        }
        return resul;
    }

}
