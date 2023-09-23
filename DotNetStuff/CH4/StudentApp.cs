using System;

namespace Student
{
    class StudentApp
    {
        public static void Main(string[] args)
        {
            Student Marcus = new Student();
            Console.WriteLine(Marcus.ToString());

            Student Carl = new Student("A12345");
            Console.WriteLine(Carl.ToString());


            Student Haru = new Student("A12346", "Okumura", "Haru");
            Console.WriteLine(Haru.ToString());

            Student Alexa = new Student("A1234567", "Carlisle", "Alexa");
            Console.WriteLine(Alexa.ToString());

            Student Caleb = new Student ("A123", "Carlton", "Caleb", 90, 91, 100, "IT");
            Console.WriteLine(Caleb.ToString());
            Console.WriteLine(Caleb.GetAverage());

            Console.WriteLine("Alfie Solomons");
            Student alfie = new Student();
            alfie.studentLastName = "Solomons";
            alfie.studentFirstName = "Alfie";
            alfie.Major = "IT";

            alfie.Dob = DateTime.Parse("01/01/2000");
            Console.WriteLine(alfie.Age);

        }
    }
}