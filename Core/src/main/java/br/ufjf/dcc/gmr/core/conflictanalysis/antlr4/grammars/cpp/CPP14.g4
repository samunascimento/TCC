/*******************************************************************************
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Camilo Sanchez (Camiloasc1)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
grammar CPP14;
/*Basic concepts*/


translationunit
   : (directive*)? declarationseq? EOF
   ;
/*Expressions*/

directive
   : Directive;

primaryexpression
   : literal
   | This
   | '(' expression ')'
   | idexpression
   | lambdaexpression
   ;

idexpression
   : unqualifiedid
   | qualifiedid
   ;

unqualifiedid
   : Identifier
   | operatorfunctionid
   | conversionfunctionid
   | literaloperatorid
   | '~' classname
   | '~' decltypespecifier
   | templateid
   ;

qualifiedid
   : nestednamespecifier Template? unqualifiedid
   ;

nestednamespecifier
   : '::'
   | thetypename '::'
   | namespacename '::'
   | decltypespecifier '::'
   | nestednamespecifier Identifier '::'
   | nestednamespecifier Template? simpletemplateid '::'
   ;

lambdaexpression
   : lambdaintroducer lambdadeclarator? compoundstatement
   ;

lambdaintroducer
   : '[' lambdacapture? ']'
   ;

lambdacapture
   : capturedefault
   | capturelist
   | capturedefault ',' capturelist
   ;

capturedefault
   : '&'
   | '='
   ;

capturelist
   : capture '...'?
   | capturelist ',' capture '...'?
   ;

capture
   : simplecapture
   | initcapture
   ;

simplecapture
   : Identifier
   | '&' Identifier
   | This
   ;

initcapture
   : Identifier initializer
   | '&' Identifier initializer
   ;

lambdadeclarator
   : '(' parameterdeclarationclause ')' Mutable? exceptionspecification? attributespecifierseq? trailingreturntype?
   ;

postfixexpression
   : functioninvocation
   | primaryexpression
   | arrayaccess
   | postfixexpression '[' bracedinitlist ']'
   | postfixexpression '(' expressionlist? ')'
   | simpletypespecifier '(' expressionlist? ')'
   | typenamespecifier '(' expressionlist? ')'
   | simpletypespecifier bracedinitlist
   | typenamespecifier bracedinitlist
   | postfixexpression '.' pseudodestructorname
   | postfixexpression '->' pseudodestructorname
   | postfixexpression '++'
   | postfixexpression '--'
   | Dynamic_cast '<' thetypeid '>' '(' expression ')'
   | Static_cast '<' thetypeid '>' '(' expression ')'
   | Reinterpret_cast '<' thetypeid '>' '(' expression ')'
   | Const_cast '<' thetypeid '>' '(' expression ')'
   | typeidofthetypeid '(' expression ')'
   | typeidofthetypeid '(' thetypeid ')'
   ;

arrayaccess
   : primaryexpression ('[' expression ']')*
   ;

functioninvocation
   : primaryexpression '.' Template? idexpression ('(' expressionlist? ')')?
   | primaryexpression '(' expressionlist? ')'
   | primaryexpression '->' Template? idexpression ('(' expressionlist? ')')?
   ;
/*
add a middle layer to eliminate duplicated function declarations
*/


typeidofexpr
   : Typeid_
   ;

typeidofthetypeid
   : Typeid_
   ;

expressionlist
   : initializerlist
   ;

pseudodestructorname
   : pseudodestructdeclaration
   | pseudodestructcaller
   ;

pseudodestructdeclaration
   : nestednamespecifier? thetypename '::' '~' thetypename  
   | nestednamespecifier Template simpletemplateid '::' '~' thetypename
   ;

pseudodestructcaller
    : '~' decltypespecifier
    | nestednamespecifier? '~' thetypename
    ;

unaryexpression
   : postfixexpression
   | '++' castexpression
   | '--' castexpression
   | unaryoperator castexpression
   | Sizeof unaryexpression
   | Sizeof '(' thetypeid ')'
   | Sizeof '...' '(' Identifier ')'
   | Alignof '(' thetypeid ')'
   | noexceptexpression
   | newexpression
   | deleteexpression
   ;

unaryoperator
   : '|'
   | '*'
   | '&'
   | '+'
   | '!'
   | '~'
   | '-'
   | 'not'
   ;

newexpression
   : '::'? New newplacement? newtypeid newinitializer?
   | '::'? New newplacement? '(' thetypeid ')' newinitializer?
   ;

newplacement
   : '(' expressionlist ')'
   ;

newtypeid
   : typespecifierseq newdeclarator?
   ;

newdeclarator
   : ptroperator newdeclarator?
   | noptrnewdeclarator
   ;

noptrnewdeclarator
   : '[' expression ']' attributespecifierseq?
   | noptrnewdeclarator '[' constantexpression ']' attributespecifierseq?
   ;

newinitializer
   : '(' expressionlist? ')'
   | bracedinitlist
   ;

deleteexpression
   : '::'? Delete castexpression
   | '::'? Delete '[' ']' castexpression
   ;

noexceptexpression
   : Noexcept '(' expression ')'
   ;

castexpression
   : unaryexpression
   | realcastexpression castexpression
   ;

realcastexpression
   : '(' thetypeid ')'
   ;

pmexpression
   : castexpression
   | pmexpression '.*' castexpression
   | pmexpression '->*' castexpression
   ;

multiplicativeexpression
   : pmexpression
   | multiplicativeexpression '*' pmexpression
   | multiplicativeexpression '/' pmexpression
   | multiplicativeexpression '%' pmexpression
   ;

additiveexpression
   : multiplicativeexpression
   | additiveexpression '+' multiplicativeexpression
   | additiveexpression '-' multiplicativeexpression
   ;

shiftexpression
   : additiveexpression
   | shiftexpression shiftoperator additiveexpression
   ;

shiftoperator
  : RightShift
  | LeftShift
  ;

relationalexpression
   : shiftexpression
   | relationalexpression '<' shiftexpression
   | relationalexpression '>' shiftexpression
   | relationalexpression '<=' shiftexpression
   | relationalexpression '>=' shiftexpression
   ;

equalityexpression
   : relationalexpression
   | equalityexpression '==' relationalexpression
   | equalityexpression '!=' relationalexpression
   ;

andexpression
   : equalityexpression
   | andexpression '&' equalityexpression
   ;

exclusiveorexpression
   : andexpression
   | exclusiveorexpression '^' andexpression
   ;

inclusiveorexpression
   : exclusiveorexpression
   | inclusiveorexpression '|' exclusiveorexpression
   ;

logicalandexpression
   : inclusiveorexpression
   | logicalandexpression '&&' inclusiveorexpression
   | logicalandexpression 'and' inclusiveorexpression
   ;

logicalorexpression
   : logicalandexpression
   | logicalorexpression '||' logicalandexpression
   | logicalorexpression 'or' logicalandexpression
   ;

conditionalexpression
   : logicalorexpression
   | logicalorexpression '?' expression ':' assignmentexpression
   ;

assignmentexpression
   : conditionalexpression
   | realassignmentexpression
   | throwexpression
   ;

realassignmentexpression
   : logicalorexpression assignmentoperator initializerclause
   ;

assignmentoperator
   : '='
   | '*='
   | '/='
   | '%='
   | '+='
   | '-='
   | RightShiftAssign
   | LeftShiftAssign
   | '&='
   | '^='
   | '|='
   ;

expression
   : assignmentexpression
   | expression ',' assignmentexpression
   ;

constantexpression
   : conditionalexpression
   ;
/*Statements*/


statement
   : labeledstatement
   | attributespecifierseq? expressionstatement
   | attributespecifierseq? compoundstatement
   | attributespecifierseq? selectionstatement
   | attributespecifierseq? iterationstatement
   | attributespecifierseq? jumpstatement
   | declarationstatement
   | attributespecifierseq? tryblock
   ;

labeledstatement
   : attributespecifierseq? Identifier ':' statement
   | attributespecifierseq? caseexpression statement
   | attributespecifierseq? Default ':' statement
   ;

caseexpression
   : Case constantexpression ':'
   ;

expressionstatement
   : expression? ';'
   ;

compoundstatement
   : '{' statementseq? '}'
   ;

statementseq
   : statement
   | statementseq statement
   ;

selectionstatement
   : ifstatement
   | switchexpression statement
   ;

ifstatement
   : ifexpression statement
   | ifexpression statement Else statement
   ;

ifexpression
   : If '(' condition ')'
   ;

switchexpression
   : Switch '(' condition ')'
   ;

condition
   : expression
   | attributespecifierseq? declspecifierseq declarator '=' initializerclause
   | attributespecifierseq? declspecifierseq declarator bracedinitlist
   ;

iterationstatement
   : whileexpression statement
   | dostatement
   | enhancedforexpression statement
   | basicforexpression statement
   ;

dostatement
   : Do statement whileexpression ';'
   ;

whileexpression
   : While '(' condition ')'
   ;

basicforexpression
   : For '(' forinitstatement condition? ';' expression? ')'
   ;

enhancedforexpression
   : For '(' forrangedeclaration ':' forrangeinitializer ')' 
   ;

forinitstatement
   : expressionstatement
   | simpledeclaration
   ;

forrangedeclaration
   : attributespecifierseq? declspecifierseq declarator
   ;

forrangeinitializer
   : expression
   | bracedinitlist
   ;

jumpstatement
   : breakstatement
   | continuestatement
   | returnstatement
   | Goto Identifier ';'
   ;

breakstatement
   : Break ';'
   ;

continuestatement
   : Continue ';'
   ;

returnstatement
   : Return expression? ';'
   | Return bracedinitlist ';'
   ;


declarationstatement
   : blockdeclaration
   ;
/*Declarations*/


declarationseq
   : declaration
   | declarationseq declaration
   ;

declaration
   : blockdeclaration
   | functiondefinition
   | templatedeclaration
   | explicitinstantiation
   | explicitspecialization
   | linkagespecification
   | namespacedefinition
   | emptydeclaration
   | attributedeclaration
   ;

blockdeclaration
   : simpledeclaration
   | asmdefinition
   | namespacealiasdefinition
   | usingdeclaration
   | usingdirective
   | static_assertdeclaration
   | aliasdeclaration
   | opaqueenumdeclaration
   ;

aliasdeclaration
   : Using Identifier attributespecifierseq? '=' thetypeid ';'
   ;

simpledeclaration
   : pointerdeclaration
   | variabledeclaration
   | declspecifierseq? initdeclaratorlist? ';'
   | attributespecifierseq declspecifierseq? initdeclaratorlist ';'
   ;

pointerdeclaration
   : declspecifierseq ptrdeclarator
   ;

variabledeclaration
   : declspecifierseq initdeclaratorlist ';'
   ;


static_assertdeclaration
   : Static_assert '(' constantexpression ',' Stringliteral ')' ';'
   ;

emptydeclaration
   : ';'
   ;

attributedeclaration
   : attributespecifierseq ';'
   ;

declspecifier
   : storageclassspecifier
   | typespecifier
   | functionspecifier
   | Friend
   | Typedef
   | Constexpr
   ;

declspecifierseq
   : declspecifier attributespecifierseq?
   | declspecifier declspecifierseq
   ;

storageclassspecifier
   : Register
   | Static
   | Thread_local
   | Extern
   | Mutable
   ;

functionspecifier
   : Inline
   | Virtual
   | Explicit
   ;

typedefname
   : Identifier
   ;

typespecifier
   : trailingtypespecifier
   | classspecifier
   | enumspecifier
   ;

trailingtypespecifier
   : simpletypespecifier
   | elaboratedtypespecifier
   | typenamespecifier
   | cvqualifier
   ;

typespecifierseq
   : typespecifier attributespecifierseq?
   | typespecifier typespecifierseq
   ;

trailingtypespecifierseq
   : trailingtypespecifier attributespecifierseq?
   | trailingtypespecifier trailingtypespecifierseq
   ;

simpletypespecifier
   : nestednamespecifier? thetypename
   | nestednamespecifier Template simpletemplateid
   | Char
   | Char16
   | Char32
   | Wchar
   | Bool
   | Short
   | Int
   | Long
   | Signed
   | Unsigned
   | Float
   | Double
   | Void
   | Auto
   | decltypespecifier
   ;

thetypename
   : classname
   | enumname
   | typedefname
   | simpletemplateid
   ;

decltypespecifier
   : Decltype '(' expression ')'
   | Decltype '(' Auto ')'
   ;

elaboratedtypespecifier
   : classkey attributespecifierseq? nestednamespecifier? Identifier
   | classkey simpletemplateid
   | classkey nestednamespecifier Template? simpletemplateid
   | Enum nestednamespecifier? Identifier
   ;

enumname
   : Identifier
   ;

enumspecifier
   : enumhead '{' enumeratorlist? '}'
   | enumhead '{' enumeratorlist ',' '}'
   ;

enumhead
   : enumkey attributespecifierseq? Identifier? enumbase?
   | enumkey attributespecifierseq? nestednamespecifier Identifier enumbase?
   ;

opaqueenumdeclaration
   : enumkey attributespecifierseq? Identifier enumbase? ';'
   ;

enumkey
   : Enum
   | Enum Class
   | Enum Struct
   ;

enumbase
   : ':' typespecifierseq
   ;

enumeratorlist
   : enumeratordefinition
   | enumeratorlist ',' enumeratordefinition
   ;

enumeratordefinition
   : enumerator
   | enumerator '=' constantexpression
   ;

enumerator
   : Identifier
   ;

namespacename
   : originalnamespacename
   | namespacealias
   ;

originalnamespacename
   : Identifier
   ;


namespacedefinition
   : namespacesignature '{' namespacebody '}'
   ;

namespacesignature
   : namednamespacedefinition
   | unnamednamespacedefinition
   ;

namednamespacedefinition
   : originalnamespacedefinition
   | extensionnamespacedefinition
   ;

originalnamespacedefinition
   : Inline? Namespace Identifier 
   ;

extensionnamespacedefinition
   : Inline? Namespace originalnamespacename 
   ;

unnamednamespacedefinition
   : Inline? Namespace 
   ;

namespacebody
   : declarationseq?
   ;

namespacealias
   : Identifier
   ;

namespacealiasdefinition
   : Namespace Identifier '=' qualifiednamespacespecifier ';'
   ;

qualifiednamespacespecifier
   : nestednamespecifier? namespacename
   ;

usingdeclaration
   : Using Typename_? nestednamespecifier unqualifiedid ';'
   | Using '::' unqualifiedid ';'
   ;

usingdirective
   : attributespecifierseq? Using Namespace nestednamespecifier? namespacename ';'
   ;

asmdefinition
   : Asm '(' Stringliteral ')' ';'
   ;

linkagespecification
   : Extern Stringliteral '{' declarationseq? '}'
   | Extern Stringliteral declaration
   ;

attributespecifierseq
   : attributespecifier
   | attributespecifierseq attributespecifier
   ;

attributespecifier
   : '[' '[' attributelist ']' ']'
   | alignmentspecifier
   ;

alignmentspecifier
   : Alignas '(' thetypeid '...'? ')'
   | Alignas '(' constantexpression '...'? ')'
   ;

attributelist
   : attribute?
   | attributelist ',' attribute?
   | attribute '...'
   | attributelist ',' attribute '...'
   ;

attribute
   : attributetoken attributeargumentclause?
   ;

attributetoken
   : Identifier
   | attributescopedtoken
   ;

attributescopedtoken
   : attributenamespace '::' Identifier
   ;

attributenamespace
   : Identifier
   ;

attributeargumentclause
   : '(' balancedtokenseq ')'
   ;

balancedtokenseq
   : balancedtoken?
   | balancedtokenseq balancedtoken
   ;

balancedtoken
   : '(' balancedtokenseq ')'
   | '[' balancedtokenseq ']'
   | '{' balancedtokenseq '}'
   | ~('('|')'|'{'|'}'|'['|']')+
   ;
/*Declarators*/


initdeclaratorlist
   : initdeclarator
   | initdeclaratorlist ',' initdeclarator
   ;

initdeclarator
   : declarator initializer?
   ;

declarator
   : ptrdeclarator
   | noptrdeclarator parametersandqualifiers trailingreturntype
   ;

ptrdeclarator
   : noptrdeclarator
   | ptroperator ptrdeclarator
   ;

noptrdeclarator
   : declaratorid attributespecifierseq?
   | noptrdeclarator parametersandqualifiers
   | arraydeclaration attributespecifierseq?
   | '(' ptrdeclarator ')'
   ;

arraydeclaration
   : declaratorid ('[' constantexpression? ']')*
   ;
    

parametersandqualifiers
   : '(' parameterdeclarationclause ')' cvqualifierseq? refqualifier? exceptionspecification? attributespecifierseq?
   ;

trailingreturntype
   : '->' trailingtypespecifierseq abstractdeclarator?
   ;

ptroperator
   : '*' attributespecifierseq? cvqualifierseq?
   | '&' attributespecifierseq?
   | '&&' attributespecifierseq?
   | nestednamespecifier '*' attributespecifierseq? cvqualifierseq?
   ;

cvqualifierseq
   : cvqualifier cvqualifierseq?
   ;

cvqualifier
   : Const
   | Volatile
   ;

refqualifier
   : '&'
   | '&&'
   ;

declaratorid
   : '...'? idexpression
   ;

thetypeid
   : typespecifierseq abstractdeclarator?
   ;

abstractdeclarator
   : ptrabstractdeclarator
   | noptrabstractdeclarator? parametersandqualifiers trailingreturntype
   | abstractpackdeclarator
   ;

ptrabstractdeclarator
   : noptrabstractdeclarator
   | ptroperator ptrabstractdeclarator?
   ;

noptrabstractdeclarator
   : noptrabstractdeclarator parametersandqualifiers
   | parametersandqualifiers
   | noptrabstractdeclarator '[' constantexpression? ']' attributespecifierseq?
   | '[' constantexpression? ']' attributespecifierseq?
   | '(' ptrabstractdeclarator ')'
   ;

abstractpackdeclarator
   : noptrabstractpackdeclarator
   | ptroperator abstractpackdeclarator
   ;

noptrabstractpackdeclarator
   : noptrabstractpackdeclarator parametersandqualifiers
   | noptrabstractpackdeclarator '[' constantexpression? ']' attributespecifierseq?
   | '...'
   ;

parameterdeclarationclause
   : parameterdeclarationlist? '...'?
   | parameterdeclarationlist ',' '...'
   ;

parameterdeclarationlist
   : parameterdeclaration
   | parameterdeclarationlist ',' parameterdeclaration
   ;

parameterdeclaration
   : attributespecifierseq? declspecifierseq declarator
   | attributespecifierseq? declspecifierseq declarator '=' initializerclause
   | attributespecifierseq? declspecifierseq abstractdeclarator?
   | attributespecifierseq? declspecifierseq abstractdeclarator? '=' initializerclause
   ;

functiondefinition
   : functionhead functionbody
   ;

functionhead
   : attributespecifierseq? declspecifierseq? declarator virtspecifierseq?
   ;

functionbody
   : ctorinitializer? compoundstatement
   | functiontryblock
   | '=' Default ';'
   | '=' Delete ';'
   ;

initializer
   : braceorequalinitializer
   | '(' expressionlist ')'
   ;

braceorequalinitializer
   : '=' initializerclause
   | bracedinitlist
   ;

initializerclause
   : assignmentexpression
   | bracedinitlist
   ;

initializerlist
   : initializerclause '...'?
   | initializerlist ',' initializerclause '...'?
   ;

bracedinitlist
   : '{' initializerlist ','? '}'
   | '{' '}'
   ;
/*Classes*/


classname
   : Identifier
   | simpletemplateid
   ;

classspecifier
   : classhead '{' memberspecification? '}'
   ;

classhead
   : classkey attributespecifierseq? classheadname classvirtspecifier? baseclause?
   | classkey attributespecifierseq? baseclause?
   ;

classheadname
   : nestednamespecifier? classname
   ;

classvirtspecifier
   : Final
   ;

classkey
   : Class
   | Struct
   | Union
   ;

memberspecification
   : memberdeclaration memberspecification?
   | accessspecifier ':' memberspecification?
   ;

memberdeclaration
   : attributespecifierseq? declspecifierseq? memberdeclaratorlist? ';'
   | functiondefinition
   | usingdeclaration
   | static_assertdeclaration
   | templatedeclaration
   | aliasdeclaration
   | emptydeclaration
   ;

memberdeclaratorlist
   : memberdeclarator
   | memberdeclaratorlist ',' memberdeclarator
   ;

memberdeclarator
   : declarator virtspecifierseq? purespecifier?
   | declarator braceorequalinitializer?
   | Identifier? attributespecifierseq? ':' constantexpression
   ;

virtspecifierseq
   : virtspecifier
   | virtspecifierseq virtspecifier
   ;

virtspecifier
   : Override
   | Final
   ;
/*
purespecifier:
   '=' '0'//Conflicts with the lexer
 ;
 */


purespecifier
   : Assign val = Octalliteral
   {if($val.text.compareTo("0")!=0) throw new InputMismatchException(this);}
   ;
/*Derived classes*/


baseclause
   : ':' basespecifierlist
   ;

basespecifierlist
   : basespecifier '...'?
   | basespecifierlist ',' basespecifier '...'?
   ;

basespecifier
   : attributespecifierseq? basetypespecifier
   | attributespecifierseq? Virtual accessspecifier? basetypespecifier
   | attributespecifierseq? accessspecifier Virtual? basetypespecifier
   ;

classordecltype
   : nestednamespecifier? classname
   | decltypespecifier
   ;

basetypespecifier
   : classordecltype
   ;

accessspecifier
   : Private
   | Protected
   | Public
   ;
/*Special member functions*/


conversionfunctionid
   : Operator conversiontypeid
   ;

conversiontypeid
   : typespecifierseq conversiondeclarator?
   ;

conversiondeclarator
   : ptroperator conversiondeclarator?
   ;

ctorinitializer
   : ':' meminitializerlist
   ;

meminitializerlist
   : meminitializer '...'?
   | meminitializer '...'? ',' meminitializerlist
   ;

meminitializer
   : meminitializerid '(' expressionlist? ')'
   | meminitializerid bracedinitlist
   ;

meminitializerid
   : classordecltype
   | Identifier
   ;
/*Overloading*/


operatorfunctionid
   : Operator theoperator
   ;

literaloperatorid
   : Operator Stringliteral Identifier
   | Operator Userdefinedstringliteral
   ;
/*Templates*/


templatedeclaration
   : Template '<' templateparameterlist '>' declaration
   ;

templateparameterlist
   : templateparameter
   | templateparameterlist ',' templateparameter
   ;

templateparameter
   : typeparameter
   | parameterdeclaration
   ;

typeparameter
   : Class '...'? Identifier?
   | Class Identifier? '=' thetypeid
   | Typename_ '...'? Identifier?
   | Typename_ Identifier? '=' thetypeid
   | Template '<' templateparameterlist '>' Class '...'? Identifier?
   | Template '<' templateparameterlist '>' Class Identifier? '=' idexpression
   ;

simpletemplateid
   : templatename '<' templateargumentlist? '>'
   ;

templateid
   : simpletemplateid
   | operatorfunctionid '<' templateargumentlist? '>'
   | literaloperatorid '<' templateargumentlist? '>'
   ;

templatename
   : Identifier
   ;

templateargumentlist
   : templateargument '...'?
   | templateargumentlist ',' templateargument '...'?
   ;

templateargument
   : thetypeid
   | constantexpression
   | idexpression
   ;

typenamespecifier
   : Typename_ nestednamespecifier Identifier
   | Typename_ nestednamespecifier Template? simpletemplateid
   ;

explicitinstantiation
   : Extern? Template declaration
   ;

explicitspecialization
   : Template '<' '>' declaration
   ;
/*Exception handling*/



tryblock
   : tryblockexpression handlerseq
   ;

functiontryblock
   : functiontryblockexpression handlerseq
   ;

tryblockexpression
   : Try compoundstatement 
   ;

functiontryblockexpression
   : Try ctorinitializer? compoundstatement 
   ;

handlerseq
   : handler handlerseq?
   ;

handler 
   : catchexpression compoundstatement
   ;

catchexpression
   : Catch '(' exceptiondeclaration ')'
   ;

exceptiondeclaration
   : attributespecifierseq? typespecifierseq declarator
   | attributespecifierseq? typespecifierseq abstractdeclarator?
   | '...'
   ;

throwexpression
   : Throw assignmentexpression?
   ;

exceptionspecification
   : dynamicexceptionspecification
   | noexceptspecification
   ;

dynamicexceptionspecification
   : Throw '(' typeidlist? ')'
   ;

typeidlist
   : thetypeid '...'?
   | typeidlist ',' thetypeid '...'?
   ;

noexceptspecification
   : Noexcept '(' constantexpression ')'
   | Noexcept
   ;
/*Preprocessing directives*/


MultiLineMacro
   : '#' (~ [\n]*? '\\' '\r'? '\n')+ ~ [\n]+ 
   ;

Directive
   : '#' '<' Identifier '>' 
   | '#' ~ [\n]* 
   ;

/*Lexer*/

/*Keywords*/


Alignas
   : 'alignas'
   ;

Alignof
   : 'alignof'
   ;

Asm
   : 'asm'
   ;

Auto
   : 'auto'
   ;

Bool
   : 'bool'
   ;

Break
   : 'break'
   ;

Case
   : 'case'
   ;

Catch
   : 'catch'
   ;

Char
   : 'char'
   ;

Char16
   : 'char16_t'
   ;

Char32
   : 'char32_t'
   ;

Class
   : 'class'
   ;

Const
   : 'const'
   ;

Constexpr
   : 'constexpr'
   ;

Const_cast
   : 'const_cast'
   ;

Continue
   : 'continue'
   ;

Decltype
   : 'decltype'
   ;

Default
   : 'default'
   ;

Delete
   : 'delete'
   ;

Do
   : 'do'
   ;

Double
   : 'double'
   ;

Dynamic_cast
   : 'dynamic_cast'
   ;

Else
   : 'else'
   ;

Enum
   : 'enum'
   ;

Explicit
   : 'explicit'
   ;

Export
   : 'export'
   ;

Extern
   : 'extern'
   ;

False
   : 'false'
   ;

Final
   : 'final'
   ;

Float
   : 'float'
   ;

For
   : 'for'
   ;

Friend
   : 'friend'
   ;

Goto
   : 'goto'
   ;

If
   : 'if'
   ;

Inline
   : 'inline'
   ;

Int
   : 'int'
   ;

Long
   : 'long'
   ;

Mutable
   : 'mutable'
   ;

Namespace
   : 'namespace'
   ;

New
   : 'new'
   ;

Noexcept
   : 'noexcept'
   ;

Nullptr
   : 'nullptr'
   ;

Operator
   : 'operator'
   ;

Override
   : 'override'
   ;

Private
   : 'private'
   ;

Protected
   : 'protected'
   ;

Public
   : 'public'
   ;

Register
   : 'register'
   ;

Reinterpret_cast
   : 'reinterpret_cast'
   ;

Return
   : 'return'
   ;

Short
   : 'short'
   ;

Signed
   : 'signed'
   ;

Sizeof
   : 'sizeof'
   ;

Static
   : 'static'
   ;

Static_assert
   : 'static_assert'
   ;

Static_cast
   : 'static_cast'
   ;

Struct
   : 'struct'
   ;

Switch
   : 'switch'
   ;

Template
   : 'template'
   ;

This
   : 'this'
   ;

Thread_local
   : 'thread_local'
   ;

Throw
   : 'throw'
   ;

True
   : 'true'
   ;

Try
   : 'try'
   ;

Typedef
   : 'typedef'
   ;

Typeid_
   : 'typeid'
   ;

Typename_
   : 'typename'
   ;

Union
   : 'union'
   ;

Unsigned
   : 'unsigned'
   ;

Using
   : 'using'
   ;

Virtual
   : 'virtual'
   ;

Void
   : 'void'
   ;

Volatile
   : 'volatile'
   ;

Wchar
   : 'wchar_t'
   ;

While
   : 'while'
   ;
/*Operators*/


LeftParen
   : '('
   ;

RightParen
   : ')'
   ;

LeftBracket
   : '['
   ;

RightBracket
   : ']'
   ;

LeftBrace
   : '{'
   ;

RightBrace
   : '}'
   ;

Plus
   : '+'
   ;

Minus
   : '-'
   ;

Star
   : '*'
   ;

Div
   : '/'
   ;

Mod
   : '%'
   ;

Caret
   : '^'
   ;

And
   : '&'
   ;

Or
   : '|'
   ;

Tilde
   : '~'
   ;

Not
   : '!'
   | 'not'
   ;

Assign
   : '='
   ;

Less
   : '<'
   ;

Greater
   : '>'
   ;

PlusAssign
   : '+='
   ;

MinusAssign
   : '-='
   ;

StarAssign
   : '*='
   ;

DivAssign
   : '/='
   ;

ModAssign
   : '%='
   ;

XorAssign
   : '^='
   ;

AndAssign
   : '&='
   ;

OrAssign
   : '|='
   ;

LeftShift
   : '<<'
   ;

RightShift
   :
   '>>'
   ;

LeftShiftAssign
   : '<<='
   ;

RightShiftAssign
   :
   '>>='
   ;

Equal
   : '=='
   ;

NotEqual
   : '!='
   ;

LessEqual
   : '<='
   ;

GreaterEqual
   : '>='
   ;

AndAnd
   : '&&'
   | 'and'
   ;

OrOr
   : '||'
   | 'or'
   ;

PlusPlus
   : '++'
   ;

MinusMinus
   : '--'
   ;

Comma
   : ','
   ;

ArrowStar
   : '->*'
   ;

Arrow
   : '->'
   ;

Question
   : '?'
   ;

Colon
   : ':'
   ;

Doublecolon
   : '::'
   ;

Semi
   : ';'
   ;

Dot
   : '.'
   ;

DotStar
   : '.*'
   ;

Ellipsis
   : '...'
   ;

theoperator
   : New
   | Delete
   | New '[' ']'
   | Delete '[' ']'
   | '+'
   | '-'
   | '*'
   | '/'
   | '%'
   | '^'
   | '&'
   | '|'
   | '~'
   | '!'
   | 'not'
   | '='
   | '<'
   | '>'
   | '+='
   | '-='
   | '*='
   | '/='
   | '%='
   | '^='
   | '&='
   | '|='
   | LeftShift
   | RightShift
   | RightShiftAssign
   | LeftShiftAssign
   | '=='
   | '!='
   | '<='
   | '>='
   | '&&'
   | 'and'
   | '||'
   | 'or'
   | '++'
   | '--'
   | ','
   | '->*'
   | '->'
   | '(' ')'
   | '[' ']'
   ;
/*Lexer*/


fragment Hexquad
   : HEXADECIMALDIGIT HEXADECIMALDIGIT HEXADECIMALDIGIT HEXADECIMALDIGIT
   ;

fragment Universalcharactername
   : '\\u' Hexquad
   | '\\U' Hexquad Hexquad
   ;

Identifier
   :
/*
   Identifiernondigit
   | Identifier Identifiernondigit
   | Identifier DIGIT
   */
   Identifiernondigit (Identifiernondigit | DIGIT)*
   ;

fragment Identifiernondigit
   : NONDIGIT
   | Universalcharactername
   ;

fragment NONDIGIT
   : [a-zA-Z_]
   ;

fragment DIGIT
   : [0-9]
   ;

literal
   : Integerliteral
   | Characterliteral
   | Floatingliteral
   | Stringliteral
   | booleanliteral
   | pointerliteral
   | userdefinedliteral
   ;

Integerliteral
   : Decimalliteral Integersuffix?
   | Octalliteral Integersuffix?
   | Hexadecimalliteral Integersuffix?
   | Binaryliteral Integersuffix?
   ;

Decimalliteral
   : NONZERODIGIT ('\''? DIGIT)*
   ;

Octalliteral
   : '0' ('\''? OCTALDIGIT)*
   ;

Hexadecimalliteral
   : ('0x' | '0X') HEXADECIMALDIGIT ('\''? HEXADECIMALDIGIT)*
   ;

Binaryliteral
   : ('0b' | '0B') BINARYDIGIT ('\''? BINARYDIGIT)*
   ;

fragment NONZERODIGIT
   : [1-9]
   ;

fragment OCTALDIGIT
   : [0-7]
   ;

fragment HEXADECIMALDIGIT
   : [0-9a-fA-F]
   ;

fragment BINARYDIGIT
   : [01]
   ;

Integersuffix
   : Unsignedsuffix Longsuffix?
   | Unsignedsuffix Longlongsuffix?
   | Longsuffix Unsignedsuffix?
   | Longlongsuffix Unsignedsuffix?
   ;

fragment Unsignedsuffix
   : [uU]
   ;

fragment Longsuffix
   : [lL]
   ;

fragment Longlongsuffix
   : 'll'
   | 'LL'
   ;

Characterliteral
   : '\'' Cchar+ '\''
   | 'u' '\'' Cchar+ '\''
   | 'U' '\'' Cchar+ '\''
   | 'L' '\'' Cchar+ '\''
   ;

fragment Cchar
   : ~ ['\\\r\n]
   | Escapesequence
   | Universalcharactername
   ;

fragment Escapesequence
   : Simpleescapesequence
   | Octalescapesequence
   | Hexadecimalescapesequence
   ;

fragment Simpleescapesequence
   : '\\\''
   | '\\"'
   | '\\?'
   | '\\\\'
   | '\\a'
   | '\\b'
   | '\\f'
   | '\\n'
   | '\\r'
   | '\\t'
   | '\\v'
   ;

fragment Octalescapesequence
   : '\\' OCTALDIGIT
   | '\\' OCTALDIGIT OCTALDIGIT
   | '\\' OCTALDIGIT OCTALDIGIT OCTALDIGIT
   ;

fragment Hexadecimalescapesequence
   : '\\x' HEXADECIMALDIGIT+
   ;

Floatingliteral
   : Fractionalconstant Exponentpart? Floatingsuffix?
   | Digitsequence Exponentpart Floatingsuffix?
   ;

fragment Fractionalconstant
   : Digitsequence? '.' Digitsequence
   | Digitsequence '.'
   ;

fragment Exponentpart
   : 'e' SIGN? Digitsequence
   | 'E' SIGN? Digitsequence
   ;

fragment SIGN
   : [+-]
   ;

fragment Digitsequence
   : DIGIT ('\''? DIGIT)*
   ;

fragment Floatingsuffix
   : [flFL]
   ;

Stringliteral
   : Encodingprefix? '"' Schar* '"'
   | Encodingprefix? 'R' Rawstring
   ;

fragment Encodingprefix
   : 'u8'
   | 'u'
   | 'U'
   | 'L'
   ;

fragment Schar
   : ~ ["\\\r\n]
   | Escapesequence
   | Universalcharactername
   ;

fragment Rawstring
   : '"' .*? '(' .*? ')' .*? '"'
   ;

booleanliteral
   : False
   | True
   ;

pointerliteral
   : Nullptr
   ;

userdefinedliteral
   : Userdefinedintegerliteral
   | Userdefinedfloatingliteral
   | Userdefinedstringliteral
   | Userdefinedcharacterliteral
   ;

Userdefinedintegerliteral
   : Decimalliteral Udsuffix
   | Octalliteral Udsuffix
   | Hexadecimalliteral Udsuffix
   | Binaryliteral Udsuffix
   ;

Userdefinedfloatingliteral
   : Fractionalconstant Exponentpart? Udsuffix
   | Digitsequence Exponentpart Udsuffix
   ;

Userdefinedstringliteral
   : Stringliteral Udsuffix
   ;

Userdefinedcharacterliteral
   : Characterliteral Udsuffix
   ;

fragment Udsuffix
   : Identifier
   ;

Whitespace
   : [ \t]+ -> skip
   ;

Newline
   : ('\r' '\n'? | '\n') -> skip
   ;

BlockComment
   : '/*' .*? '*/' -> channel(2)
   ;

LineComment
   : '//' ~ [\r\n]* -> channel(2)
   ;
