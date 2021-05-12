package valen.sample;

import org.antlr.v4.runtime.tree.TerminalNode;
import valen.parser.lenguajeC.LenguajeenCBaseVisitor;
import valen.parser.lenguajeC.LenguajeenCParser;

public class LenguajeC extends LenguajeenCBaseVisitor<String> {
    public String getCodigo() {
        return codigo;
    }

    String codigo = "";
    @Override public String visitCascaron(LenguajeenCParser.CascaronContext ctx) {
        //System.out.println("-----Visite Cascaron ------");
        codigo += "programa{/n"+visit(ctx.plural())+"/n}";
        return visit(ctx.plural());
    }

    @Override public String visitPlural(LenguajeenCParser.PluralContext ctx) {
        int i=0;
        String x="";
        while(ctx.inicio(i) != null){
            if (visit(ctx.inicio(i)) != null){
                x += visit(ctx.inicio(i));
            }
            i++;
        }
        return x;
    }

    @Override public String visitImpresionExpresion(LenguajeenCParser.ImpresionExpresionContext ctx) {
        String x="imprimir(";
        if(ctx.expr() != null) {
            x +=visit(ctx.expr()) ;
        }else{
            x += ctx.STRING().getText();
        }
        x+=");";
        return x;
    }

    @Override public String visitInt(LenguajeenCParser.IntContext ctx) {
        //System.out.println(ctx.INT());
        String x =ctx.INT().getText();
        //System.out.println("x ="+x);
        //codigo += x;
        return x;
    }

    @Override public String visitDeclaracion(LenguajeenCParser.DeclaracionContext ctx) {
        return  "int "+ctx.ID()+";/n";
    }

    @Override public String visitAsignacion(LenguajeenCParser.AsignacionContext ctx) {
        return ctx.ID().getText()+" = "+visit(ctx.expr())+"/n";
    }

    @Override public String visitId(LenguajeenCParser.IdContext ctx) {
        return ctx.ID().getText();
    }

    @Override public String visitDeclaracionMultiple(LenguajeenCParser.DeclaracionMultipleContext ctx) {
        String x = "int "+ctx.ID(0);
        boolean flag = true;
        for (TerminalNode ID: ctx.ID()) {
            if(flag){
                flag = false;
            }else {
                x += "," + ID.getText();
            }
        }
        x+= "/n";
        return x; 
    }

    @Override public String visitCondiciones(LenguajeenCParser.CondicionesContext ctx) {
        return visit(ctx.model_cond());
    }
    @Override public String visitModel_cond(LenguajeenCParser.Model_condContext ctx) {
        return "si("+ctx.cond().getText()+")/n";
    }


}
