import java.util.Scanner;

public class DoWhileDemo {
    

    public static void main(String[] args){
        int value;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Please enter an integer < 100");
            value = in.nextInt();
        } 
        while (value <= 100);
        in.close();
    }
    
}
