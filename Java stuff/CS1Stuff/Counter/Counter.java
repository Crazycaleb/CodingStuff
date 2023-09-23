package Counter;
/**
 * author: Caleb Carlton
 */

public class Counter{
    private int number;
/**
 * default constructor for class
 */

    public Counter(){
    }
/**
 * The constructor with one parameter.
 * @param number parameter for the entered value.
 */

    public Counter(int number){
        this.number = number;
    }

/** 
 * This method emulates the click button by adding one to the instance.
 */

    public void increment(){
        number = number + 1;
    }

    /**
     * This method emulates multiple clicks by adding the amount to the instance variable.
     * @param digit The entered amount to be added.
     */
   
    public void increment(int digit)
    {
        number = number + digit;
    }

/*
 * Set the variable to 0.
 */

    public void reset(){
        number = 0;
    } 

    /**
     * Sets the instance variable to the entered number.
     * @param number
     */

    public void setNumber(int number){
        this.number = number;
    }

    /**
     * Displays the current number.
     * @return returns the value.
     */
    
    public int display(){
        return number;
    }
}