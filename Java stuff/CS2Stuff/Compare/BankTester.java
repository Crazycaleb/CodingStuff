
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HMMohamed
 */
public class BankTester {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = new BankAccount(5000);
        accounts[1] = new BankAccount(2000);
        accounts[2] = new BankAccount(1000);
        System.out.println(accounts[0].compareTo(accounts[2]));
        Arrays.sort(accounts);
        for(BankAccount account : accounts)
        {
             System.out.println(account.getBalance());
        }
        Country country = new Country("Any Country", 552356);
//        System.out.println(accounts[0].compareTo(country));
    }
}
