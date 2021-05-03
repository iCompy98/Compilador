package valen.sample.exceptions;

import org.antlr.v4.runtime.Token;

public class VariableNoDeclarada extends MyExceptions {
    public VariableNoDeclarada(String text, Token token){
        super("La variable "+text+" no esta declarada\n\tLinea: "+token.getLine());
        //System.out.println("No se puede realizar esta division: "+text);
    }
}
