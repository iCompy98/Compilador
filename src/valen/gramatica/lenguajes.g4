grammar lenguajes;

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
    CONDICION PAR_A cond PAR_C cuerpo_condicion        #condicion_if
    |
    CONDICION PAR_A cond PAR_C test     #condicion_ifelse
    ;

test: cuerpo_condicion ONO cuerpo_condicion;
cuerpo_condicion: A_LL plural C_LL;
comparacion: expr SIGNO expr;
cond:  comparacion | expr;


expr: expr prod_muldiv expr          #MulDiv
    | expr prod_sumres expr          #SumRes
    | INT                       #int
    | ID                        #id
    | PAR_A expr PAR_C          #parentesis
    ;

prod_muldiv: POR | DIV;
prod_sumres: SUMA | RESTA;

CLASS: 'programa';
INTEGER: 'int';
IMPRIME: 'imprimir';
CONDICION: 'si';
ONO: 'no';
SIGNO: '==' | '!='| '<='| '>='|'>'|'<';
A_LL: '{';
C_LL: '}';
IGUAL : '=';
POR: '*';
DIV: '/';
SUMA: '+';
RESTA: '-';
COMA: ',';
INT: [0-9]+;
ID: [a-z][a-zA-Z0-9]+;
STRING: '"' (ESC | .)*? '"';
fragment ESC: '\\' [btnr"\\];
PAR_A: '(';
PAR_C: ')';
NUEVALINEA: [\r\n];
WS: [ \t]->skip;
