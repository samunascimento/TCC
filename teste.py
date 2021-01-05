import numpy as np  #Import

def funTeste(a): #functiondefinition
    a=a**2
    
    if a%2==0 : #ifcall
        yield #yield
    else:
        a=0
    return a #returnstatement

class Testeclasse: #class
    i = 12345
    def f(self):
        return 'hello world'

if __name__ == '__main__': #maindeclaration
    a= 40
    b=funTeste(a) #functioncall

    while(True):    #whilecall
        print("test")
        break; #break
        
    for x in range(1,2): #for
        continue; #continue

    del a
    array =['teste','de','arrays'] #array

    try: #try
        print(x)
    except:
        print("Something went wrong")
    finally:
        print("The 'try except' is finished")
        
