/**
* VTL 1.1 grammar
*/

grammar VTL;

/* parser rules */

command :
      function # FunctionCommand
    | statement # StatementCommand
    | pure # PureCommand;

statement : ID ASSIGN_SYMBOL function;

quitOperator : QUIT_TOKEN;
getOperator : GET_TOKEN '("' DATASET_ID '")';

function :
            | getOperator
            | ID;

pure : quitOperator;

/* tokens */

ASSIGN_SYMBOL: ':=';
QUIT_TOKEN: 'QUIT';
GET_TOKEN : 'GET';

ID : [A-Za-z] [a-zA-Z0-9]*;
DATASET_ID : ID | ID FIELD_SEP DATASET_ID;
FIELD_SEP : '/';