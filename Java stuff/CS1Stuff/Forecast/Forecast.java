package Forecast;
/*
 * Author: Caleb Carlton
 */

public class Forecast {
    private int temp;
    private String sky;
    /* 
     * Default constructor for class
     */


    public Forecast(){

    }

    public Forecast(int temp, String sky){
        this.temp = temp;
        this.sky = sky;
    }
    
    /** 
     * @param temp
     */
    /*
     * Constructor with 2 parameters 
     */

    public void setTemp(int temp){
        this.temp = temp;
    }

    
    /** 
     * @param sky
     */
    public void setSky(String sky){
        this.sky = sky;
    }

    /*
     * Setters for both parameters (temp and sky)
     */

    public double calculateCelsius(){
        return ((temp - 32) * 5 / 9);
    }

    /*
     * Return for Celsius
     */

    public int getTemp(){
        return temp;
    }

    public String getSky(){
        return sky;
    }

    /*
     * Getters for the parameters (temp and sky)
     */
}
