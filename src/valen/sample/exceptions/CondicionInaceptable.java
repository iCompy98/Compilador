package valen.sample.exceptions;

import org.antlr.v4.runtime.Token;

public class CondicionInaceptable extends MyExceptions {
    public CondicionInaceptable(Token token){
        super("El resultado de la condicion no es 1 o 0:\n\tLinea "+token.getLine());
    }
}
