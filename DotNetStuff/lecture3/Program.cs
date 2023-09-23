using System;

namespace DotNetStuff
{
    class lecture3
    {
        static void Main(string[] args)
        {
            int width = 3;
            int height = 4;
            int returnValue = Area2(width, height);
            double hypot = Pythag(width, height);
            Console.WriteLine("Area 2 = " + returnValue);
            Console.WriteLine(returnValue * returnValue);
            Console.WriteLine("Pythag = " + hypot);

            int squareArea = Area2(height);

            lecture3 program = new lecture3();
            program.sampleMethod();

        }

        void sampleMethod()
        {
            Console.WriteLine("This is a sample method");
        }

        static double Pythag(int width, int height)
        {
            return (Math.Sqrt(width * width + height * height));
        }

        static void Area(int width, int height)
        {
            Console.WriteLine("Area: " + (width * height));
        }

        static int Area2(int width, int height)
        {
            return width * height;
        }
        static int Area2(int height)
        {
            return height * height;
        }
    }
}