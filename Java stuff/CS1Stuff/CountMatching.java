import java.util.Scanner;

public class CountMatching {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a text.");
        int spaces = 0;
        String str = in.nextLine();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                spaces++;
            }
        }
        System.out.println("The number of spaces is: " + spaces);
        in.close();
    }
}
