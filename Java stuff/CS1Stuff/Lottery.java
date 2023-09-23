import java.util.Random;
import java.util.Scanner;

// Import scanner and random for input and rng.

//Author: Caleb Carlton

public class Lottery {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int upperbound = 100;
        //Set non-inclusive max value for rng (0-99)

        int int_random = rand.nextInt(upperbound);
        //Generate random number

        System.out.println("The random number is: " + int_random);
        System.out.println("Please enter a number: ");
        int input = in.nextInt();
        
        //Input the number to compare to the random number

        if (input < 0 || input >= 100){
            System.out.println("Please enter another number.");
            //Make sure the input stays inside the range. No negative numbers or 3 digit numbers
        } else {

        int Digit1 = input % 10;
        int Digit2 = input / 10;

        int randdigit1 = int_random % 10;
        int randdigit2 = int_random / 10;

        //Creating separate digits for the input and random number



        if (input == int_random){
            System.out.println("Congratulations! You won $10,000!");
        }
        //Both digits match exactly



        else if (Digit1 == randdigit1){
            if (Digit2 != randdigit2){
                System.out.println("Congratulations! You won $1,000");
            }
            // One digit matches
        }



        else if (Digit2 == randdigit2) {
            if (Digit1 != randdigit1) {
                System.out.println("Congratulations! You won $1,000");
            }
            // One digit matches
        }





        else if (Digit1 == randdigit2){
            if (Digit2 == randdigit1){
                System.out.println("Congratulations! You won $3,000");
            }

            //Both digits match, but not in correct order
            
            else {
                System.out.println("Congratulations! You won $1,000");
            }
            //One digit matches



            
        }
        else if (Digit2 == randdigit1) {
            if (Digit1 == randdigit2){
                System.out.println("Congratulations! You won $3,000");
            }

            // Both digits match, but not in correct order
            else {
                System.out.println("Congratulations! You won $1,000");
            }
            // One digit matches




        }
        else if (Digit1 != randdigit1) {
            if (Digit1 != randdigit2){
                if (Digit2 != randdigit1){
                    if (Digit2 != randdigit2){
                        System.out.println("Sorry, you lost the lottery.");
                    }
                    //No digits match
                }
            }
                
    
        }
    }
    in.close();
    }


}
