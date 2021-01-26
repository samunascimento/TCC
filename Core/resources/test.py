import numpy as np  #Import(V)
from enum import Enum  

def funTeste(a): #functiondefinition
    a=a**2

    if a%2==0 : #ifcall(V)
        yield #yield (V)
    else:
        a=0
    return a #returnstatement(V)

class Testeclasse: #class
    i = 12345 #variable
    def f(self):
        return 'hello world'
        
class Animal(Enum):	#enum ---- Verificar
    ant = 1
    bee = 2
    cat = 3
    dog = 4        

if __name__ == '__main__': #maindeclaration
    a= 40 #assignment
    b=funTeste(a) #functioncall

    while(True):    #whilecall (V)
        print("test")
        break #break (V)
    
    x = float(1) #cast    

    for x in range(1,2): #for (V)
        continue #continue (V)

    del a #delete (V)
    array =['teste','de','arrays'] #array   

    try: #try(V)
        print(x)
    except: #catch(V)
        print("Something went wrong")
    finally:#Finally(V)
        print("The 'try except' is finished")
    
    
    try:
    	open('database.sqlite')
    except IOError:
    	raise RuntimeError from None    #Throw(V)



     """  #comments
     ANNOTATION 
     ANNOTATION_TYPE_MEMBER_DECLARATION
     ARRAY_ACCESS // No teste //não existe
     ARRAY_INITIALIZER  // No teste // pegando
     ASSERT_STATEMENT
     ASSIGNMENT    // No teste 
     BREAK_STATEMENT  // No teste // pegando
     CAST_EXPRESSION // No teste
     CATCH_CLAUSE  // No teste // pegando
     CLASS_DECLARATION  // No teste 
     CLASS_SIGNATURE  // No teste 
     COMMENT // No teste 
     CONTINUE_STATEMENT  // No teste // pegando
     DELETE_STATEMENT // No teste // pegando
     ENUM_DECLARATION // No teste
     ENUM_SIGNATURE // No teste
     ENUM_VALUE // No teste
     FIELD 
     FOR_STATEMENT  // No teste // pegando
     FINALLY  // No teste // pegando
     IF_STATEMENT  // No teste // pegando
     IMPORT_DECLARATION  // No teste // pegando
     INTERFACE_DECLARATION 
     INTERFACE_SIGNATURE 
     METHOD_DECLARATION // No teste 
     METHOD_INTERFACE 
     METHOD_INVOCATION  // No teste 
     METHOD_SIGNATURE // No teste 
     NAMESPACE
     PACKAGE_DECLARATION 
     POINTER 
     RETURN_STATEMENT  // No teste // pegando
     STATIC_INITIALIZER 
     SYNCHRONIZED_STATEMENT 
     THROW_STATEMENT // No teste // pegando
     TRY_STATEMENT  // No teste // pegando
     VARIABLE  // No teste
     WHILE_STATEMENT // No teste // pegando
     YELD_STATEMENT  // No teste // pegando

        """
