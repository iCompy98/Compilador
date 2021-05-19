package valen.sample;

import org.antlr.v4.runtime.tree.TerminalNode;
import valen.parser.lenguajeC.LenguajeenCParser;
import valen.parser.lenguajeenMi.LenguajeenMiBaseVisitor;
import valen.parser.lenguajeenMi.LenguajeenMiParser;

public class LenguajeMio extends LenguajeenMiBaseVisitor<String> {

    int tabulaciones=0;
    @Override public String visitCascaron(LenguajeenMiParser.CascaronContext ctx) {
        return "#include <stdio.h>\n\nvoid main(){\n"+visit(ctx.plural())+"}";
    }

    @Override public String visitPlural(LenguajeenMiParser.PluralContext ctx) {
        int i=0;
        String x="";
        tabulaciones++;
        while(ctx.inicio(i) != null){
            if (visit(ctx.inicio(i)) != null){
                x += tabs(tabulaciones)+visit(ctx.inicio(i));
            }
            i++;
        }
        tabulaciones--;
        return x;
    }

    @Override public String visitImpresionExpresion(LenguajeenMiParser.ImpresionExpresionContext ctx) {
        String x="printf(";
        if(ctx.expr() != null) {
            x +=ctx.expr().getText();
        }else{
            x += ctx.STRING().getText();
        }
        x+=");\n";
        return x;
    }

    @Override public String visitDeclaracion(LenguajeenMiParser.DeclaracionContext ctx) {
        String x="int "+ctx.ID();
        if (ctx.IGUAL() != null) {
            x += ctx.IGUAL().getText()+" "+ctx.expr().getText();
        }
        x+=";\n";
        return x;
    }

    @Override public String visitAsignacion(LenguajeenMiParser.AsignacionContext ctx) {
        return ctx.ID().getText()+" = "+ctx.expr().getText()+";\n";
    }

    @Override public String visitDeclaracionMultiple(LenguajeenMiParser.DeclaracionMultipleContext ctx) {
        String x = "int ";
        int f=ctx.ID().size();
        for (TerminalNode i: ctx.ID()){
            x += i.getText()+", ";
        }
        x=x.substring(0,x.length()-2);
        x+= ";\n";

        return x;
    }

    @Override public String visitCondiciones(LenguajeenMiParser.CondicionesContext ctx) {
        return visit(ctx.model_cond())+"\n";
    }

    @Override public String visitModel_cond(LenguajeenMiParser.Model_condContext ctx) {
        String x="if("+ctx.cond().getText()+"){\n"+visit(ctx.plural())+tabs(tabulaciones)+"}";
        if(ctx.model_ono() != null){
            x+=visit(ctx.model_ono());
            //System.out.println("Si hay else");
        }
        return x;
    }

    @Override public String visitModel_ono(LenguajeenMiParser.Model_onoContext ctx) {
        if (ctx.plural() != null) {
            return "else{\n"+visit(ctx.plural())+tabs(tabulaciones)+"}";
        }else{
            return "else "+visit(ctx.model_cond());
        }
    }

    @Override public String visitCicloWhile(LenguajeenMiParser.CicloWhileContext ctx) {
        return visit(ctx.model_while());
    }

    @Override public String visitModel_while(LenguajeenMiParser.Model_whileContext ctx) {
        return "while("+ctx.cond().getText()+"){\n"+visit(ctx.plural())+tabs(tabulaciones)+"}\n";
    }

    public String tabs (int unidades){
        String x="";
        while(unidades > 0){
            x+="\t";
            unidades--;
        }
        //System.out.println(x);
        return x;
    }
}
