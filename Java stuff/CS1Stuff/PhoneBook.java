import java.util.Scanner;

public class PhoneBook {
    
    public static void main(String[] args){

        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("1. Add Contact");
        System.out.println("2. Update Contact");
        System.out.println("3. Delete Contact");
        System.out.println("4. Exit");


        do {
        System.out.println("Please enter a number 1-4");
        number = in.nextInt();   
        switch (number){
            case 1: System.out.println("Added Contact.");
            break;
            case 2: System.out.println("Updated Contact.");
            break;
            case 3: System.out.println("Deleted Contact.");
            break;
            case 4: System.out.println("Exit");
            break;
            
            default: System.out.println("Invalid Choice");
            break;
            
                
        }
    } while (number != 4);
    in.close();
    }
    
}
