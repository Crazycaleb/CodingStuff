public class Freight {
    
    private double rate;
    private double input;

    private static final double RATE1 = 1.10;
    private static final double RATE2 = 2.20;
    private static final double RATE3 = 3.70;
    private static final double RATE4 = 3.80;

    //private variables

    public Freight(){

    }

    //Default constructor

    public Freight(double rate, double input){
        if (input <= 2) {
            this.rate = RATE1;
        } else if (input <= 6) {
            this.rate = RATE2;
        } else if (input <= 10) {
            this.rate = RATE3;
        } else {
            this.rate = RATE4;
        }
        this.input = input;
    }

    //Set up parameters

    public void setRate(double rate){
        this.rate = rate;
    }

    public void setInput(double input){
        this.input = input;
    }
    
    //Define setters for each parameter

    public double getRate(){
        return rate;
    }

    public double getInput(){
        return input;
    }

    //Define getters for each parameter (return values)
}
