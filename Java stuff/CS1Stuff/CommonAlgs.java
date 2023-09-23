import java.util.Scanner;

public class CommonAlgs {
    

    public static void main (String[] args){
        boolean done = false;
        Scanner in = new Scanner(System.in);
        while(!done){
            String input = in.next();
            if (input.equalsIgnoreCase("Q")){
                done = true;
            }
            else{
                System.out.println(input);
            }
        }
        in.close();
    }
    
}
