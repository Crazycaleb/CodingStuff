package Bank;
import java.util.ArrayList;
import java.util.Scanner;

public class BankTester {
    

    public static void main(String[] args) 
    {
        ArrayList<Bank> Accounts = new ArrayList<>();

        Scanner in = new Scanner(System.in);


        for (int i = 1; i <= 3; i++)
        {
            System.out.println("Enter an account number: ");
            String AccNumber = in.next();
            System.out.println("Enter the balance: ");
            double balance = in.nextDouble();
            Accounts.add(new Bank(AccNumber, balance));

        }
        for (Bank ba:Accounts)
        {
            System.out.println("Account Number: " + ba.getAccNumber());
            System.out.println("Balance: " + ba.getBalance());        
            
        }
        System.out.println("Total balance: " + totalBalance(Accounts));
        in.close();
    }
    public static double totalBalance(ArrayList<Bank> accs)
    {
        double total = 0;
        for (Bank ba : accs)
        {
            total += ba.getBalance();
        }
        return total;

    }
    
}
