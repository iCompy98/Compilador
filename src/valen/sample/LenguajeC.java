package valen.sample;

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
        //System.out.println(visitChildren(ctx));
        //codigo += visitChildren(ctx);
        /*System.out.println("-----Visite Plural ------");
        System.out.println(ctx.inicio(0).getText());
        System.out.println(ctx.inicio(1).getText());
        System.out.println(ctx.inicio(2).getText());*/
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
            //System.out.println(ctx.STRING().getText());
            x += ctx.STRING().getText();
        }
        x+=");";
        //System.out.println(x);
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

}
