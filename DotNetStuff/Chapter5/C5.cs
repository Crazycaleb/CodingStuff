using System;

namespace Chapter5
{
    class C5
    {
        static void Main(string[] args)
        {
            //BonusCalculator(CheckInputInt("Enter sales"));
            //int largestNumber = DetermineLargest(CheckInputInt("Enter a number"), CheckInputInt("Enter a second number"));
            //Console.WriteLine("The largest number is " + largestNumber);

            /*Console.WriteLine("Pay calculator:");
            double hoursWorked = CheckInputDouble("Enter hours worked");
            double rate = CheckInputDouble("Enter hourly rate.");
            double calculatedPay = PayCalculator(hoursWorked, rate);
            Console.WriteLine("Calculated Pay: " + calculatedPay);*/

            
        }

        static double PayCalculator(double hoursWorked, double rate)
        {
            //overtime is hoursWorked - 40
            double overtimeAmount = 0.0;
            if (hoursWorked > 40 && hoursWorked < 50)
            {
                overtimeAmount = (hoursWorked - 40) * (rate * 1.5);
                return overtimeAmount + rate * 40;
            }
            else if (hoursWorked >= 50)
            {
                overtimeAmount = (hoursWorked - 50) * (rate * 2.0);
                overtimeAmount += (hoursWorked - 40) * (rate * 1.5);
                return overtimeAmount + rate * 40;
            }
            return hoursWorked * rate;
        }

        static int DetermineLargest(int firstNumber, int secondNumber)
        {
            if (firstNumber > secondNumber)
            {
                return firstNumber;
            }
            else
            {
                return secondNumber;
            }
        }

        static void BonusCalculator(int sales)
        {
            if (sales >= 50_000)
            {
                Console.WriteLine("$1000 bonus");
                Console.WriteLine("Good job!");
            }
            else if (sales <= 25_000)
            {
                Console.WriteLine("You owe us some money");
            }
            else 
            {
                Console.WriteLine("No bonus for you!");
            }
        }

        public static int CheckInputInt(string message)
        {
            int retVal = 0;
            string inputString = "";
            Console.WriteLine(message);
            inputString = Console.ReadLine();
            while (!int.TryParse(inputString, out retVal) == true)
            {
                Console.WriteLine(message);
                inputString = Console.ReadLine();
            }
            return retVal;
        }

        public static double CheckInputDouble(string message)
        {
            double retVal = 0.0;
            string inputString = "";
            Console.WriteLine(message);
            inputString = Console.ReadLine();
            while (!double.TryParse(inputString, out retVal) == true)
            {
                Console.WriteLine(message);
                inputString = Console.ReadLine();
            }
            return retVal;
        }
    }
}