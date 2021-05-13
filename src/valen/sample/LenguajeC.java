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
        codigo += "programa{\n"+visit(ctx.plural())+"\n}";
        return visit(ctx.plural());
    }

    @Override public String visitPlural(LenguajeenCParser.PluralContext ctx) {
        int i=0;
        String x="";
        while(ctx.inicio(i) != null){
            if (visit(ctx.inicio(i)) != null){
                x += "\t"+visit(ctx.inicio(i));
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
        x+=")";
        return x;
    }

    @Override public String visitInt(LenguajeenCParser.IntContext ctx) {
        return ctx.INT().getText();
    }

    @Override public String visitDeclaracion(LenguajeenCParser.DeclaracionContext ctx) {
        return  "int "+ctx.ID()+"\n";
    }

    @Override public String visitAsignacion(LenguajeenCParser.AsignacionContext ctx) {
        return ctx.ID().getText()+" = "+visit(ctx.expr())+";\n";
    }

    @Override public String visitId(LenguajeenCParser.IdContext ctx) {
        return ctx.ID().getText();
    }

    @Override public String visitDeclaracionMultiple(LenguajeenCParser.DeclaracionMultipleContext ctx) {
        String x = "int ";
        int f=ctx.ID().toArray().length;
        for (int i=0; i<=f; i++) {
                x += ctx.ID(i).getText();
                if(i!=f){
                    x+=", ";
                }
        }
        x+= ";\n";
        return x; 
    }

    @Override public String visitCondiciones(LenguajeenCParser.CondicionesContext ctx) {
        return visit(ctx.model_cond());
    }

    @Override public String visitModel_cond(LenguajeenCParser.Model_condContext ctx) {
        String x="si("+ctx.cond().getText()+"){\n\t"+visit(ctx.plural())+"\n\t}";
        if(ctx.model_ono() != null){
            x+=visit(ctx.model_ono());
            //System.out.println("Si hay else");
        }
        return x;
    }

    @Override public String visitModel_ono(LenguajeenCParser.Model_onoContext ctx) {
        if (ctx.plural() != null) {
            return "no{"+visit(ctx.plural())+"}\n";
        }else{
            return "no "+visit(ctx.model_cond());
        }
    }


}
