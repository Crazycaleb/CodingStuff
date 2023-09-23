using System;

namespace DotNetStuff
{
    class homework3
    {
        static void Main(string[] args)
        {
            Question01();
            Question02();
            Question03();
            Question04();
            Question05();




            
        }     

        private static void Question05()
        {
            string employeeName = AskFor("name",  "Enter the employee name");
            double sales = CheckInputDouble("Enter the sales");
            calculatePayStub(employeeName, sales);
        }

        static void calculatePayStub(string employeeName, double sales)
        {
            const double COMMISSION = .07;
            const double FED_TAX_RATE = .18;
            const double RETIREMENT_CONT = .15;
            const double SOCIAL_SECURITY = .09;

            double commissionFinal = sales * COMMISSION;
            double federalSum = commissionFinal * FED_TAX_RATE;
            double retirementSum = commissionFinal * RETIREMENT_CONT;
            double socialSecuritySum = commissionFinal * SOCIAL_SECURITY;
            double netPay = commissionFinal - federalSum - retirementSum - socialSecuritySum;

            Console.WriteLine("\n{0}'s Paystub\n\nCommission    | {1,10:C}\nFederal Tax     | {2,10:C}\n401k    | {3,10:C}\nSocial Security | {4,10:C}\n------------------\nNet Pay     | {5,10:C}", employeeName, commissionFinal, federalSum, retirementSum, socialSecuritySum, netPay);
        }

        private static void Question04()
        {
            double charge = CheckInputDouble("Enter the charge");
            const double TAXRATE = .09;
            double total = charge + (charge * TAXRATE);
            double fifteenPercent = total + (total * .15);
            double twentyPercent = total + (total * .20);
            Console.WriteLine("{0:N2} {1:N2}  {2:N2}  {3:N2}", charge, total + charge, fifteenPercent, twentyPercent);
        }     

        private static void Question03()
        {
            double initialSeconds = CheckInputDouble("Enter the Amount of Seconds: ");
            convertTime(initialSeconds);

        }

        static void convertTime(double initialSeconds)
        {
            double seconds = (initialSeconds % 60f);
            double minutes = ((initialSeconds / 3600) % 60);
            double hours = ((initialSeconds / 3600));
            Console.WriteLine("{0:N2}:{1:N2}:{2:N2}", hours, minutes, seconds);
        }
        private static void Question02()
            {
                Console.WriteLine("Rectangle:");
                string inputValue = "";
                double height = CheckInputDouble("Enter the Height: ");
                double width = CheckInputDouble("Enter the Width: ");
                double area = width * height;
                double perimeter = 2 * height + 2 * width;
                double diagonal = Math.Sqrt(Math.Pow(width, 2) + Math.Pow(height, 2));
                double angle = Math.Atan2(height, width) * (180 / Math.PI);
                Console.WriteLine("Height\t\t{0}\nWidth\t\t{1}\nArea\t\t{2}\nPerimeter\t\t{3}"  + 
                "\nDiagonal\t{4}\nOne Angle\t{5}\nOther Angle\t{6}", height, width, area, perimeter, diagonal, angle, (180 - 90 - angle));
            }

            
        private static void Question01()
            {
                string inputString = "";
                inputString = AskFor("name", "Enter name: ");
                Console.WriteLine("Your name is: " + inputString);
                inputString = AskFor("saying", "Enter your favorite saying: ");
                Console.Write("Your favorite saying is " + inputString);            
                Console.Write("/////////////////////////////");
            }

        private static double CheckInputDouble(string message)
        {
            string inputString = "";
            Console.WriteLine(message);
            inputString = Console.ReadLine();
            double inputVal;

            while (!double.TryParse(inputString, out inputVal) == true) 
            {
                Console.WriteLine(message);
                inputString = Console.ReadLine();
            }
            return inputVal;
        }

        private static string AskFor(string v1, string v2)
        {
            string retVal = "";
            Console.WriteLine(v2);
            retVal += Console.ReadLine();
            if (v1 == "saying")
            {
                retVal = "<<<<<" + retVal + ">>>>>";
            }
            else if (v1 == "name")
            {
                retVal = "<<<<<" + retVal + ">>>>>";
            }
            return retVal;
        }


    }
}