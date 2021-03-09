using System;
using static System.Console;
using static System.Math;
using static System.String;

class TestMotorcycle 
{

    public override double GetTopSpeed()
    {
        return 108.4;
    }
    
    
}    

class Program
{
   static void Main()
   {
	double x = 1234.7;
        int a;
        // Cast double to int.
        a = (int)x;
        System.Console.WriteLine(a);
   }
}

interface Animal 
{
  void animalSound(); 
  void run(); 
}
