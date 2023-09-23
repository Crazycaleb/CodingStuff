package Bank;


public class Bank 
{

    //private variables vvv

    private String AccNumber;
    private double balance;


    //Default constructor vvv
    public Bank()
    {

    }

    //Sets up parameters vvv

    public Bank(String AccNumber, double balance)
    {
        this.AccNumber = AccNumber;
        this.balance = balance;
    }

    ////////////////////////////////////////////////////////////////////////

    //Setters for each variable vvvv

    public void setAccNumber()
    {
        this.AccNumber = AccNumber;
    }

    public void setBalance()
    {
        this.balance = balance;
    }

    ////////////////////////////////////////////////////////////////////////

    //Getters for each variable (returns the variable) vvvv

    public String getAccNumber()
    {
        return AccNumber;
    }

    public double getBalance()
    {
        return balance;
    }
}