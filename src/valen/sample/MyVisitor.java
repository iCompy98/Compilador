package valen.sample;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import valen.parser.lenguajesBaseVisitor;
import valen.parser.lenguajesParser;
import valen.sample.exceptions.*;

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
            if(memoria.get(ctx.ID().getText()) == null){
                //System.out.println("No se a instanciado");
                throw new VariableNoInstanciada(ctx.ID().getText(), ctx.ID().getSymbol());
            }else{
                value = memoria.get(ctx.ID().getText());
            }
        }
        else  {
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
            memoria.put(ctx.ID().getText(),null);
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
        try{
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
        }catch (Exception e){
            System.out.println("HOla");
            return visit(ctx.parentesis_comp());
        }


    }

    @Override public Integer visitModel_cond(lenguajesParser.Model_condContext ctx) {
        //cadena += "Miren, estoy en la condicion\n";
        //System.out.println(ctx.model_ono());

        //Aqui esta el problemaaaaaaa!!!!
        if(visit(ctx.cond()) == 1){
            //cadena += "If normal\n";
            //cadena += visit(ctx.cond())+ "\n";
            return visit(ctx.plural());
        }else{
            //cadena += "If-else\n";
            //System.out.println(ctx.model_ono().model_cond());
            /*if(ctx.model_ono().model_cond() == null){
                //cadena += "If else\n";
                if(visit(ctx.cond()) == 1){
                    return visitChildren(ctx.plural());
                }else{
                    return visitChildren(ctx.model_ono());
                }
            }else{
                //cadena += "If else if\n";

                return visitChildren(ctx.model_ono());
            }
*/
            if (ctx.model_ono() != null){
                return visit(ctx.model_ono());
            }else{
                return null;
            }

        }
    }

    @Override public Integer visitModel_ono(lenguajesParser.Model_onoContext ctx) {
        //System.out.println(visit(ctx.plural()));
        if(ctx.model_cond() == null){
            System.out.println("If else");
            return visit(ctx.plural());
        }else{
            System.out.println("If else if");
            return visit(ctx.model_cond());
        }

    }

    @Override public Integer visitCond_logic(lenguajesParser.Cond_logicContext ctx) {
        //System.out.println("Condicion logica");
        int a,b;
        try{
            a = visit(ctx.comparacion(0));
            b = visit(ctx.comparacion(1));
        }catch (Exception e){
            a = visit(ctx.expr(0));
            b = visit(ctx.expr(1));
        }
        if (ctx.O_LOG().getText().equals("&&")) {
            //System.out.println("Logic AND");
            if (a == 1 && b == 1) {
                return 1;
            } else {
                return 0;
            }
        } else if (ctx.O_LOG().getText().equals("||")) {
            //System.out.println("Logic OR");
            if (a == 1 || b == 1) {
                return 1;
            } else {
                return 0;
            }
        }
        return visitChildren(ctx);
    }

    @Override public Integer visitParentesis_comp(lenguajesParser.Parentesis_compContext ctx) {
        if(ctx.comparacion() != null){
            return visit(ctx.comparacion());
        }else{
            return visit(ctx.cond_logic());
        }
    }

    @Override public Integer visitCond(lenguajesParser.CondContext ctx) {
        if (ctx.NEG() == null){
            //System.out.println("No hay negacion");
            if(ctx.cond_logic() != null) {
                return visit(ctx.cond_logic());
            }else if(ctx.comparacion() != null){
                return visit(ctx.comparacion());
            }else if(ctx.expr() != null){
                return visit(ctx.expr());
            }else{
                return visit(ctx.parentesis_comp());
            }
        }else{
            //System.out.println("Si hay negacion");
            int x = visitChildren(ctx);
            if(x == 0){
                return 1;
            }else{
                return 0;
            }
        }

    }

}
