package If;
import java.util.Scanner;

public class IfStatement {

    public static void main (String[] args){
        int floor, actualFloor;
        System.out.println("Enter the floor:");
        Scanner in = new Scanner(System.in);
        floor = in.nextInt();
        if(floor > 13){
            actualFloor = floor - 1;
        }
        else 
        {
            actualFloor = floor;
        }

        System.out.println("Actual floor is: " + actualFloor);

        in.close();
    }
}