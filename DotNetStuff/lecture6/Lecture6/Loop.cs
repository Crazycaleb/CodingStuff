using System;

namespace LoopLecture
{


    class Loop
    {
        static void Main(string[] args)
        {
            Random rnd = new Random();
            int theNumber = rnd.Next(1000);
            //Console.WriteLine(GetFactors(theNumber));
            //Console.WriteLine("Is " + theNumber + " prime? " + IsPrime(theNumber));
            //Fibonacci(45);
            //FizzBuzz(theNumber);
            Console.WriteLine(GetJugglers(59));
        }

        public static string GetJugglers(int v)
        {
            double factr = 0.0;
            int largest = 0;
            int steps = 0;
            string returnString = v.ToString() + " ";
            int counter = v;
            while (counter > 1)
            {
                if (counter % 2 == 0)
                {
                    factr = 0.5;
                }
                else 
                {
                    factr = 1.5;
                }
                counter = (int) Math.Floor(Math.Pow(counter, factr));
                if (counter > largest)
                {
                    largest = counter;
                }
                steps++;
                returnString += counter.ToString() + " ";
                
            }
            returnString += " Highwater mark: " + largest.ToString() + " Steps: " + steps.ToString();
            return returnString;
        }

        public static void FizzBuzz(int v)
        {
            if ((v % 5 == 0) && (v % 3 == 0))
            {   
                Console.WriteLine(v + " FizzBuzz!");
            }
            else if (v % 5 == 0)
            {
                Console.WriteLine(v + " Buzz!");
            }
            else if (v % 3 == 0)
            {
                Console.WriteLine(v + " Fizz!");
            }
            else 
            {
                Console.WriteLine(v + " Womp Womp");
            }
        }

        public static void Fibonacci(int v)
        {
            int a = 0, b = 1, c = 0;
            int sum = 0;
            Console.WriteLine("{0}\n {1} ", a, b);
            for (int i = 2; i < v; i++)
            {
                c = a + b;
                if ((c % 2 == 0) && (c < 4000000))
                {
                    sum += c;
                }
                Console.WriteLine("{0}" , c);
                a = b;
                b = c;
            }
            Console.WriteLine("The sum of all even numbers in the Fibonacci Sequence is " + sum);
        }

        public static bool IsPrime(int v)
        {
            for (int counter = 2; counter < v; counter++)
            {
                if (v % counter == 0)
                {
                    return false;
                }
            
            }
            return true;
        }

        public static string GetFactors(int v)
        {
            string returnString = "";
            for (int i = 1; i <= v; i++)
            {
                if (v % i == 0)
                {
                    returnString += i.ToString() + " ";
                }
            }
            return returnString;
        }
    }
}