package valen.sample.exceptions;


import org.antlr.v4.runtime.Token;

public class ErrorImprimirVacio extends MyExceptions {
    public ErrorImprimirVacio(Token token){
        super("La funcion imprimir no tiene ningun parametro\n\tLinea: "+token.getLine());
    }
}

