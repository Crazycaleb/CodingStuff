import java.util.Scanner;

public class FreightTester {
    

    public static void main(String[] args){
        Freight freight = new Freight();
        Scanner in = new Scanner(System.in);

        //Declare freight object and scanner object
        
        System.out.println("Enter the weight of the package: ");
        int input = in.nextInt();

        //Prompt an input for weight and assign it to input variable

        if (input < 0){
            System.out.println("Please enter a positive weight.");
        }

        //Checks for negative numbers

         else{
                if (input <= 2){
                System.out.printf("The weight of the package: %10.2f%n", input);
                System.out.printf("The rate per pound: %10.2f%n", freight.getRate());
                double shipping = (freight.getRate() * input);
                System.out.printf("The shipping charges: %10.2f%n", shipping);
                }

                else if (input < 2 && input >= 6){
                System.out.printf("The weight of the package: %10.2f%n", input);
                System.out.printf("The rate per pound: %10.2f%n", freight.getRate());
                double shipping = (freight.getRate() * input);
                System.out.printf("The shipping charges: %10.2f%n", shipping);
                }
                else if (input < 6 && input >= 10){
                System.out.printf("The weight of the package: %10.2f%n", input);
                System.out.printf("The rate per pound: %10.2f%n", freight.getRate());
                double shipping = (freight.getRate() * input);
                System.out.printf("The shipping charges: %10.2f%n", shipping);
                }

                else{
                System.out.printf("The weight of the package: %10.2f%n", input);
                System.out.printf("The rate per pound: %10.2f%n", freight.getRate());
                double shipping = (freight.getRate() * input);
                System.out.printf("The shipping charges: %10.2f%n", shipping);
                }

                //Each range prints out weight, rate, and charges, each with 2 decimal places and a new line.
            }
in.close();

//close the scanner
        }
    
    }
    
