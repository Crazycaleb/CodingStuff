package Forecast;
public class ForecastTester {
    
    
    /** 
     * @param args
     */
    public static void main (String [] args){
        Forecast forecast1 = new Forecast();
        Forecast forecast2 = new Forecast();
        Forecast forecast3 = new Forecast();
        Forecast forecast4 = new Forecast();
        /* create new objects forecast1-4 */
        forecast1.setTemp(70);
        /* Default temp is 70 */
        forecast1.setSky("Sunny");
        /* Default sky condition is sunny */
        forecast2.setSky("Snowy");
        forecast3.setSky("Cloudy");
        forecast4.setSky("Rainy");
        /* Other possible sky conditions */
        System.out.print("Hello ");
        System.out.println("The temperature in Fahrenheit is " + forecast1.getTemp());
        System.out.println("The sky is " + forecast1.getSky());
        System.out.println("The temperature in Celsius is " + forecast1.calculateCelsius());
        /* Print temperatures in Farenheit and Celsius, and the sky condition */

    }
}
