package Geometry;

import java.util.Scanner;

    public class Geometry
    {
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            

            System.out.println("Please enter a height: ");
            double h = in.nextDouble();
            double Vol = Formula.cubeVolume(h);
            double Sur = Formula.cubeSurface(h);
            System.out.println("The cube volume is: " + Vol);
            System.out.println("The cube surface is: " + Sur);
            in.close();
        }




    }
