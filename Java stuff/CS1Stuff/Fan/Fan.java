package Fan;
// Author: Caleb Carlton

public class Fan {
    public static final char HIGH = 'H';
    public static final char MEDIUM = 'M';
    public static final char LOW = 'L';

    // setting constant variables

    private char speed;
    private boolean fanOn;
    private boolean lightOn;

    // private variables

    public Fan(){

    }

    // default constructor
    
    public Fan(char speed, boolean fanOn, boolean lightOn){
        this.speed = speed;
        this.fanOn = fanOn;
        this.lightOn = lightOn;
    }

    // Initiate private variables

    public void setSpeed(char speed){
        this.speed = speed;

    }

    public void setFanOn(boolean fanOn){
        this.fanOn = fanOn;

    }

    public void setLightOn(boolean lightOn) {
        this.lightOn = lightOn;
    }

    // Declare set parameters

    public char getSpeed(){
        return speed;
    }

    public boolean isFanOn(){
        return fanOn;
    }

    public boolean isLightOn(){
        return lightOn;
    }

    // define return values
}
