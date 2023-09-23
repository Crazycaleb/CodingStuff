/*using System;
using System.Globalization;

namespace Lecture6
{
    class Program
    {
        static void Main(string[] args)
        {
            //Console.WriteLine(ValidateIntInputDo());
            //SquaredLoop(21);
            //Console.WriteLine(SentinelLoop());
            //ForLoop(10);
            //ForLoop(100, 90);
            MultiplicationTable();

        }
        private static int ValidateIntInputDo()
        {
            int integerValue;
            string inStringValue;
            do
            {
                Console.WriteLine("Enter an integer value");
                inStringValue = Console.ReadLine();
            } 
            while (!int.TryParse(inStringValue, out integerValue));
            return integerValue;
        }
        public static void SquaredLoop(int n)
        {
            int counter = 0;
            while (counter <= n)
            {
                Console.WriteLine("Counter: " + counter + " " + Math.Pow(counter, 2.0));
                counter++;
            }
        }

        public static int SentinelLoop()
        {
            string inValue;
            int sum = 0, intValue;
            Console.WriteLine("Enter values. To stop, enter Q");
            inValue = Console.ReadLine();
            while (inValue.ToUpper() != "Q")
            {
                while (!(int.TryParse(inValue, out intValue)) && inValue.ToUpper() != ("Q"))
                {
                    Console.WriteLine("Bad Input, Re-enter Data");
                    inValue = Console.ReadLine();
                }
                sum += intValue;
                Console.WriteLine("Enter next value, Q to stop");
                inValue = Console.ReadLine();
                
            }
            return sum;
            
        }
        public static void ForLoop(int endValue)
        {
            for (int i = 0; i <= endValue; i++)
            {   
                Console.WriteLine(i);
            }
        }

        public static void ForLoop(int startValue, int endValue)
        {
            if (startValue < endValue)
            {
                for (int counter = startValue; counter <= endValue; counter++)
                {
                    Console.WriteLine(counter);
                }
            }
            else 
            {
                for (int counter = startValue; counter >= endValue; counter--)
                {
                    Console.WriteLine(counter);
                }
            }
        }

        public static void MultiplicationTable()
        {
            for (int row = 0; row <=10; row++)
            {
                for (int col = 0; col <= 10; col++)
                {
                    Console.Write((row * col) + " ");
                }
                Console.WriteLine();
            }
        }
    }
}
*/