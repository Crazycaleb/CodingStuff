package Fan;
public class FanTester {
    public static void main(String[] args){
        Fan fan = new Fan();

        // Create object fan
        fan.setFanOn(true);
        fan.setSpeed('H');
        fan.setLightOn(true);

        // Set variables to specific values

        System.out.println("Room");
        System.out.println("The fan is on: " + fan.isFanOn());
        System.out.println("The speed is: " + fan.getSpeed());
        System.out.println("The light is on: " + fan.isLightOn());

        // Display fan status, speed, and light status


    }
}
