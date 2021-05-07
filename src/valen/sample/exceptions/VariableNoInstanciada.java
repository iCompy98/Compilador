package valen.sample.exceptions;

import org.antlr.v4.runtime.Token;

public class VariableNoInstanciada extends MyExceptions {
    public VariableNoInstanciada(String text, Token token){
        super("La variable "+text+" no esta instanciada\n\tLinea: "+token.getLine());
        //System.out.println("No se puede realizar esta division: "+text);
    }
}
