grammar LenguajeenMi;

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
    |
    model_while NUEVALINEA          #cicloWhile
    ;


model_while: WHILE PAR_A cond PAR_C A_LL plural C_LL ;


condicional: expr | PAR_A cond PAR_C;
cond: NEG? condicional ((SIGNO condicional)* | (O_LOG condicional)*);
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

CLASS: 'programa';
INTEGER: 'int';
IMPRIME: 'imprimir';
CONDICION: 'si';
ONO: 'no';
WHILE: 'mientras' ;
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
INT: [0-9]+;
ID: [a-z][a-zA-Z0-9]+ | [a-z];
STRING: '"' (ESC | .)*? '"';
fragment ESC: '\\' [btnr"\\];
PAR_A: '(';
PAR_C: ')';
NUEVALINEA: [\r\n];
WS: [ \t]->skip;