using System;

namespace DotNetStuff
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            Console.WriteLine("My name is Caleb Carlton");

            int ans = 5, v1 = 2, v2 = 10, v3 = 18;
            ans += v1 + 10 * (v2-- / 5) + v3 / v2;

            Console.WriteLine(ans);

            Console.WriteLine("\n");


            Console.WriteLine("{0}", "CCCCCCCCCCCCCCCCCCCC");
            Console.WriteLine("{0}         {1}  {1}", "CC", "##");
            Console.WriteLine("{0}      {1}", "CC", "############");
            Console.WriteLine("{0}         {1}  {1}", "CC", "##");
            Console.WriteLine("{0}      {1}", "CC", "############");
            Console.WriteLine("{0}         {1}  {1}", "CC", "##");
            Console.WriteLine("{0}", "CCCCCCCCCCCCCCCCCCCC");

            Console.WriteLine("\n");


            Console.WriteLine("Name: Caleb Carlton");
            Console.WriteLine("Graduation Year: 2024");
            Console.WriteLine("School: Chattanooga State Community College");

            Console.WriteLine("\n");

            Console.WriteLine("*********************************************");            
            Console.WriteLine("** Programming Assignment # 1              **");            
            Console.WriteLine("** Developer: Caleb Carlton                **");
            Console.WriteLine("** Date Submitted: 08 / 16 / 2023          **");
            Console.WriteLine("** Purpose: Provide internal documentation **");
            Console.WriteLine("*********************************************");


            Console.WriteLine("\n");

            Console.WriteLine("************************************************");           
            Console.WriteLine("** Name: Caleb Carlton                        **");           
            Console.WriteLine("** Hometown: West Haven, CT                   **");           
            Console.WriteLine("** Major: Cybersecurity, Programming          **");           
            Console.WriteLine("** Hobby: Gaming, Computer programming, Chess **");            
            Console.WriteLine("** Favorite Activity: Playing Video Games     **");
            Console.WriteLine("************************************************");  

            
            Console.WriteLine("Max values:");
            Console.WriteLine("int {0:N0}", int.MaxValue);
            Console.WriteLine("uint {0:N0}", uint.MaxValue);
            Console.WriteLine("long {0:N0}", long.MaxValue);
            Console.WriteLine("ulong {0:N0}", ulong.MaxValue);
            Console.WriteLine("short {0:N0}", short.MaxValue);
            Console.WriteLine("ushort {0:N0}", ushort.MaxValue);
            Console.WriteLine("double {0:N2}", double.MaxValue);
            Console.WriteLine("float {0:N2}", float.MaxValue);
            Console.WriteLine("decimal {0:N2}", decimal.MaxValue);

            const double TAXRATE = 3.1415;

            decimal firstAmountOwed = 3000.05M;
            decimal secondAmountOwed = 9.9M;

            float firstNumber = 3.1415F;
            float secondNumber = 6.125F;
            float thirdNumber = firstNumber * secondNumber;
            Console.WriteLine(thirdNumber);

            string firstName = "Caleb";
            string secondName = "Carlton";
            Console.WriteLine(firstName + " " + secondName);
            string fullName = firstName + " " + secondName;
            Console.WriteLine(fullName);


            Console.WriteLine(thirdNumber++ + " " + ++thirdNumber);
            Console.ReadKey();
        }
    }
}