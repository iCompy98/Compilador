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
            cadena += ctx.STRING().getText().substring(1,ctx.STRING().getText().length()-1)+"\n";
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
        if (ctx.SIGNO().getText().equals(">")){
            if(izq > der){
                resul= 1;
            }else{
                resul= 0;
            }
        }
        if (ctx.SIGNO().getText().equals("<")){
            if(izq < der){
                resul= 1;
            }else{
                resul= 0;
            }
        }
        return resul;

    }

    @Override public Integer visitModel_cond(lenguajesParser.Model_condContext ctx) {
        if(ctx.model_ono() == null){
            if(visit(ctx.cond()) == 1){
                return visitChildren(ctx);
            }else{
                return null;
            }
        }else{
            if(ctx.model_ono().model_cond() == null){
                if(visit(ctx.cond()) == 1){
                    return visitChildren(ctx.plural());
                }else{
                    return visitChildren(ctx.model_ono());
                }
            }else{
                return visitChildren(ctx.model_ono());
            }
        }
    }

    @Override public Integer visitModel_ono(lenguajesParser.Model_onoContext ctx) {
        System.out.println("JJeeeeeloooouuuu");
        return visitChildren(ctx);
    }

}
