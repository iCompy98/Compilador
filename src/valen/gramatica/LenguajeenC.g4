grammar LenguajeenC;

cascaron: CLASS A_LL plural C_LL;

plural: inicio+;

inicio:
    NUEVALINEA                 #espacio
    |
    ID IGUAL expr NUEVALINEA    #asignacion
    |
    IMPRIME PAR_A (expr| STRING) PAR_C NUEVALINEA            #impresionExpresion
    |
    INTEGER ID (IGUAL expr)? NUEVALINEA           #declaracion
    |
    INTEGER (ID COMA)* ID NUEVALINEA            #declaracionMultiple
    |
    model_cond NUEVALINEA                       #condiciones
    ;

    comparacion: expr SIGNO expr | parentesis_comp;
    parentesis_comp: PAR_A (cond_logic| comparacion) PAR_C;
    cond_logic:  comparacion O_LOG comparacion | expr O_LOG expr ;
    cond: NEG? (parentesis_comp |expr| cond_logic| comparacion);
    model_cond:CONDICION PAR_A cond PAR_C A_LL plural C_LL model_ono?;
    model_ono:ONO (A_LL plural C_LL| model_cond);



    expr: expr prod_muldiv expr          #MulDiv
        | expr prod_sumres expr          #SumRes
        | INT                       #int
        | ID                        #id
        | PAR_A expr PAR_C          #parentesis
        ;

    prod_muldiv: POR | DIV;
    prod_sumres: SUMA | RESTA;

    CLASS: 'void main()';
    INTEGER: 'int';
    IMPRIME: 'System.out.println';
    CONDICION: 'if';
    ONO: 'else';
    SIGNO: '==' | '!='| '<='| '>='|'>'|'<';
    O_LOG:  '&&' | '||';
    NEG : '!';
    A_LL: '{';
    C_LL: '}';
    IGUAL : '=';
    POR: '*';
    DIV: '/';
    SUMA: '+';
    RESTA: '-';
    COMA: ',';
    ID: [a-z][a-zA-Z0-9]+ | [a-z];
    INT: [0-9]+;
    STRING: '"' (ESC | .)*? '"';
    fragment ESC: '\\' [btnr"\\];
    PAR_A: '(';
    PAR_C: ')';
    NUEVALINEA: [\r\n];
    WS: [ \t]->skip;