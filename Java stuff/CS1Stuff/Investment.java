public class Investment{
    public static void main(String[] args){
        double balance = 10000;
        int year = 0;
        double target = 20000;
        final double RATE = 0.05;

        while (balance < target){
            year++;
            double interest = balance * RATE;
            balance += interest;
        }
        System.out.println("The number of years: " + year);
    }
}
