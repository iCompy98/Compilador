package valen.sample.exceptions;

import org.antlr.v4.runtime.Token;

public class DivisionIndebida extends MyExceptions {
        public DivisionIndebida(String text, Token token){
            super("No se puede realizar esta division: "
                    +text+"\n\tLinea "+token.getLine());
        }
}
