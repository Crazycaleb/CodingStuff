import java.util.Scanner;

public class ScannerDemo {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = in.nextInt();
        System.out.println("You entered " + number);
        System.out.println("Please enter a name: ");
        String name = in.next();
        System.out.println("Name is: " + name);
        in.close();
    }
}
