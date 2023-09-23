import java.util.Scanner;

public class RunningTotal {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int total = 0;
        int count = 0;
        System.out.println("Please enter a number: ");
        while(in.hasNextInt()){
            int number = in.nextInt();
            total += number;
            count++;
        }
        System.out.println("Total is " + total);
        double average = 0;
        if(count > 0){
            average = total / count;
        }
        System.out.println("Average is " + average);
        in.close();
    }
}
