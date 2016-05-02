/**
* VTL 1.1 grammar
*/

grammar VTL;

/* parser rules */

command :
      function # FunctionCommand
    | hierarchy_rule #HierarchyCommand
    | statement # StatementCommand
    | pure # PureCommand;

statement : ID ASSIGN_SYMBOL function;

quitOperator : QUIT_TOKEN;

/* Scalar String Rules
concatenationScalarOperator: STRING_TOKEN SUM_TOKEN STRING_TOKEN;
*/
function
            :

              BOOL_TOKEN                                                                #boolean
            | STRING_TOKEN                                                              #string
            | INTEGER_TOKEN                                                             #int
            | NUMERIC_TOKEN                                                             #double
            | LIST_BOOL_TOKEN                                                           #listBool
            | LIST_INTEGER_TOKEN                                                        #listInt
            | LIST_NUMERIC_TOKEN                                                        #listNum
            | LIST_STRING_TOKEN                                                         #listStr
            | PATTERN_TOKEN                                                             #pattern
            | GET_TOKEN '("' DATASET_ID '")'                                            #getOperator
            | ID                                                                        #id
            /* Scalar NUMERICS Operators */
            | '('function')'                                                            #parFunc
            | DIFFERENCE_TOKEN function                                                 #minusFunc
            | function PRODUCT_TOKEN  function                                          #productScalarOperator
            | function DIVISION_TOKEN function                                          #divisionScalarOperator
            | function SUM_TOKEN function                                               #sumScalarOperator
            | function DIFFERENCE_TOKEN function                                        #differenceScalarOperator
            | ROUND_TOKEN'('function','function')'                                      #roundScalarOperator
            | ABS_TOKEN'('function')'                                                   #absScalarOperator
            | TRUNC_TOKEN'('function','function')'                                      #truncScalarOperator
            | EXP_TOKEN'('function')'                                                   #expScalarOperator
            | LN_TOKEN'('function')'                                                    #lnScalarOperator
            | LOG_TOKEN'('function','function')'                                        #logScalarOperator
            | POWER_TOKEN'('function','function')'                                      #powScalarOperator
            | NROOT_TOKEN'('function','function')'                                      #nrootScalarOperator
            | MOD_TOKEN'('function','function')'                                        #modScalarOperator
            /* Scalar BOOLEAN Operators*/
            | function MINOR_TOKEN function                                             #minorScalarOperator
            | function MAJOR_TOKEN function                                             #majorScalarOperator
            | function MAJOR_EQUAL_TOKEN function                                       #majorEqualScalarOperator
            | function MINOR_EQUAL_TOKEN function                                       #minorEqualScalarOperator
            | function EQUAL_TOKEN function                                             #equalScalarOperator
            | NOT_TOKEN function                                                        #notScalarOperator
            | function AND_TOKEN function                                               #andScalarOperator
            | function OR_TOKEN function                                                #orScalarOperator
            | function XOR_TOKEN function                                               #xorScalarOperator
            /*Scalar CONDITIONAL Operators*/
            | IF_TOKEN function THEN_TOKEN function
              (ELSEIF_TOKEN function THEN_TOKEN function)* ELSE_TOKEN function          #ifelseScalarOperator
            | NVL_TOKEN'('function','function')'                                        #nvlScalarOperator
            /*Scalar VALIDATION Operators*/
            | function IN_TOKEN function                                                #inScalarOperator
            | function BETWEEN_TOKEN function AND_TOKEN function                        #betweenScalarOperator
            | ISNULL_TOKEN function')'                                                  #isNullScalarOperator
            // è l'IN scalarOperator| MATCH_VALUES_TOKEN function ',' function')'                               #matchValuesScalarOperator
            | MATCH_CHARACTERS_TOKEN function ',' PATTERN_TOKEN')'                      #matchCharacterScalarOperator
            /*Scalar STRING Rules*/
            | LENGTH_TOKEN function PAR_CLOSED_TOKEN                                    #lengthScalarOperator
            | TRIM_TOKEN function')'                                                    #trimScalarOperator
            | UPPER_TOKEN  function')'                                                  #uppertScalarOperator
            | LOWER_TOKEN  function')'                                                  #lowerScalarOperator
            | SUBSTR_TOKEN  function','function(','function)?')'                        #substrScalarOperator
            | INDEXOF_TOKEN  function','function')'                                     #indexofScalarOperator
            | CONCAT_TOKEN function',' function')'                                      #concatScalarOperator
            /*Aggregative Opeators*/
            | AGGR_SUM_TOKEN ID')' 'group by' function (',' function)*            #aggrSum
            ;

hierarchy_rule:
            CREATE_HIER_TOKEN  ID '(' (ID '=' ID ('+' ID)*';')+ ('when' ID '=' (ID|NUMERIC_TOKEN|INTEGER_TOKEN) ' then ' (ID|NUMERIC_TOKEN|INTEGER_TOKEN) ';')+')'  #createHierarchyRule
            ;

pure : quitOperator;

/* tokens */
SINGLE_APIX_TOKEN:                                                                      '\'';
ASSIGN_SYMBOL:                                                                          ':=';
QUIT_TOKEN:                                                                             'QUIT';
GET_TOKEN :                                                                             'GET';
INTEGER_TOKEN:                                                                          [0-9]+;
NUMERIC_TOKEN:                                                                          [0-9]+'.'[0-9]+ ;
BOOL_TOKEN:                                                                             'true' | 'false' | 'TRUE' | 'FALSE';
STRING_TOKEN:                                                                           '"'[A-Za-z0-9_\ ]+'"';
LIST_BOOL_TOKEN:                                                                        '[]' | '['BOOL_TOKEN(', 'BOOL_TOKEN)*']';
LIST_INTEGER_TOKEN:                                                                     '[]' | '['INTEGER_TOKEN(', 'INTEGER_TOKEN)*']';
LIST_NUMERIC_TOKEN:                                                                     '[]' | '['NUMERIC_TOKEN(', 'NUMERIC_TOKEN)*']';
LIST_STRING_TOKEN:                                                                      '[]' | '['STRING_TOKEN(', 'STRING_TOKEN)*']';
PATTERN_TOKEN:                                                                          SINGLE_APIX_TOKEN (.)*? SINGLE_APIX_TOKEN;

/* Numeric Operators Tokens */
SUM_TOKEN:                                                                              '+';
DIFFERENCE_TOKEN:                                                                       '-';
PRODUCT_TOKEN:                                                                          '*';
DIVISION_TOKEN:                                                                         '/';
PAR_OPEN_TOKEN:                                                                         '(';
PAR_CLOSED_TOKEN:                                                                       ')';
ROUND_TOKEN:                                                                            'round';
ABS_TOKEN:                                                                              'abs';
TRUNC_TOKEN:                                                                            'trunc';
EXP_TOKEN:                                                                              'exp';
LN_TOKEN:                                                                               'ln';
LOG_TOKEN:                                                                              'log';
POWER_TOKEN:                                                                            'pow';
NROOT_TOKEN:                                                                            'nroot';
MOD_TOKEN:                                                                              'mod';

/* Boolean Operators Tokens */
MAJOR_TOKEN:                                                                            '>';
MINOR_TOKEN:                                                                            '<';
EQUAL_TOKEN:                                                                            '==';
MAJOR_EQUAL_TOKEN:                                                                      '>=';
MINOR_EQUAL_TOKEN:                                                                      '<=';
AND_TOKEN:                                                                              ' and ';
OR_TOKEN:                                                                               ' or ';
XOR_TOKEN:                                                                              ' xor ';
NOT_TOKEN:                                                                              'not ';

/* Validation Operators Tokens */
IN_TOKEN:                                                                               ' in ';
BETWEEN_TOKEN:                                                                          ' between ';
ISNULL_TOKEN:                                                                           'isnull(';
MATCH_CHARACTERS_TOKEN:                                                                 'match_characters(';
MATCH_VALUES_TOKEN:                                                                     'match_values(';

/* String Operators Tokens */
LENGTH_TOKEN:                                                                           'length(';
TRIM_TOKEN:                                                                             'trim(';
UPPER_TOKEN:                                                                            'upper(';
LOWER_TOKEN:                                                                            'lower(';
SUBSTR_TOKEN:                                                                           'substr(';
INDEXOF_TOKEN:                                                                          'indexof(';
CONCAT_TOKEN:                                                                           'concat(';

/* Conditional Operators Tokens */
IF_TOKEN:                                                                               'if ';
THEN_TOKEN:                                                                             ' then ';
ELSE_TOKEN:                                                                             ' else ';
ELSEIF_TOKEN:                                                                           ' elseif ';
NVL_TOKEN:                                                                              'nvl';

/* Aggragate Operators Tokens */
AGGR_SUM_TOKEN:                                                                         'sum(';
AGGR_AVG_TOKEN:                                                                         'avg(';
AGGR_MEDIAN_TOKEN:                                                                      'median(';
AGGR_COUNT_TOKEN:                                                                       'count(';
AGGR_COUNT_DISTINCT_TOKEN:                                                              'count_distinct(';
AGGR_MIN_TOKEN:                                                                         'min(';
AGGR_MAX_TOKEN:                                                                         'max(';

ID :                                                                                    [A-Za-z_] [a-zA-Z0-9_-]*;
DATASET_ID : ID | ID FIELD_SEP DATASET_ID | URL | MONGO_PATH | LINUX_PATH | WINDOWS_PATH;
FIELD_SEP :                                                                             '/';
URL:                                                                                    'http://www.'[0-9A-Za-z_-%\/\._-]+;
MONGO_PATH:                                                                             [\/][A-Za-z0-9_-]+[\/]([A-Za-z0-9_-]+ [\/])*;
LINUX_PATH:                                                                             ([\/])?[A-Za-z0-9_-]*([\/][A-Za-z0-9_-]+ )* [A-Za-z0-9_-]+ '.json';
WINDOWS_PATH:                                                                           [A-Z]':'[\\]([A-Za-z0-9_-]+[\\])*[A-Za-z0-9_-]+ '.json';

/*For hierarchy*/
CREATE_HIER_TOKEN:                                                                      'create hierarchy_rule ';
ASSOCIATION_TOKEN:                                                                      '';

/*Ignore whitespaces*/
WS  :   ( ' '+
        | '\t'+
        | '\r'+
        | '\n'+
        ) -> skip
    ;