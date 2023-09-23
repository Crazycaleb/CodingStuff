using System;

namespace DotNetStuff
{

    class homework2 
    {
        static void Main(string[] args)
        {

            Console.WriteLine("Question #1");
            Console.WriteLine("\n");
            double miles = 10;
            double kilometer = miles * 1.60934;
            double smoots = miles * 945.6;

            Console.WriteLine("Total miles are: " + miles);
            Console.WriteLine("The kilometers and smoots are: " + kilometer + " and " + smoots + " respectively");
            Console.WriteLine("\n");

            Console.WriteLine("Question #2");
            Console.WriteLine("\n");
            double Celsius = 32.0;
            double Fahr = 0.0;

            Fahr = (Celsius * (9.0 / 5.0) + 32);

            Console.WriteLine("A celsius of " + Celsius + " is equal to " + Fahr + " in Farenheit.");
            Console.WriteLine("\n");

            Console.WriteLine("Question #3");
            Console.WriteLine("\n");

            string product = "Ruggy Shoes";
            double wholesalePrice = 52.00;
            string product2 = "Teno Jacket";
            double wholesalePrice2 = 71.00;
            double markup = .15;
            double retailPrice = 0.00;
            double retailPrice2 = 0.00;

            retailPrice = wholesalePrice + (wholesalePrice * markup);

            Console.WriteLine(product + " Wholesale: {0:C2}" +  " Markup: {1:N2}" + " Retail Price: {2:C2}",
            wholesalePrice, markup, retailPrice);

            retailPrice2 = wholesalePrice2 + (wholesalePrice2 * markup);

            Console.WriteLine(product2 + " Wholesale: {0:C2}" + " Markup: {1:N2}" + " Retail Price: {2:C2}",
            wholesalePrice2, markup, retailPrice2);

            Console.WriteLine("Question #4");
            Console.WriteLine("\n");

            double sales = 161432;
            double commission = .07;
            double taxrate = .18;
            double retirement =  .10;
            double social = .06;

            double commish, fedTax, retire, socSec, takeHome;
            commish = sales * commission;
            fedTax = commish * taxrate;
            socSec = commish * social;
            retire = (commish - fedTax - socSec) * retirement;
            takeHome = commish - fedTax - retire - socSec;

            Console.WriteLine("Nesbith Lang");
            Console.WriteLine("Sales:\t {0:C2}", sales);
            Console.WriteLine("Gross Pay:\t {0:C2}", commish);
            Console.WriteLine("Fed Tax:\t {0:C2}", fedTax);
            Console.WriteLine("Retirement:\t {0:C2}", retire);
            Console.WriteLine("Social Sec:\t {0:C2}", socSec);
            Console.WriteLine("Take home:\t {0:C2}", takeHome);
            Console.WriteLine("\n");

            Console.WriteLine("Question #5");
            Console.WriteLine("\n");

            double homeworkWt = .1;
            double projectsWt = .35;
            double quizzesWt = .1;
            double examsWt = .3;
            double finalExamWt = .15;

            double homework = .97;
            double projects = .82;
            double quizzes = .60;
            double exams = .75;
            double finalExam = .80;

            double home = homework * homeworkWt;
            double proj = projects * projectsWt;
            double quiz = quizzes * quizzesWt;
            double ex = exams * examsWt;
            double fin = finalExam * finalExamWt;

            Console.WriteLine("Homework: {0:N2} Weight: {1:N2} Total: {2:N4}", homework, homeworkWt, home);
            Console.WriteLine("Projects: {0:N2} Weight: {1:N2} Total: {2:N4}", projects, projectsWt, proj);
            Console.WriteLine("Quizzes: {0:N2} Weight: {1:N2} Total: {2:N4}",quizzes, quizzesWt, quiz);
            Console.WriteLine("Exams: {0:N2} Weight: {1:N2} Total: {2:N4}", exams, examsWt, ex);
            Console.WriteLine("Final Exam: {0:N2} Weight: {1:N2} Total: {2:N4}", finalExam, finalExamWt, fin);

            double totalWeight = home + proj + quiz + ex + fin;
            double weightsTotal = homeworkWt + projectsWt + quizzesWt + examsWt + finalExamWt;

            Console.WriteLine("\n\nFinal Grade: {0:N4} * {1:N4} = {2:N4}", totalWeight, weightsTotal, totalWeight * weightsTotal);










        }
    }

}