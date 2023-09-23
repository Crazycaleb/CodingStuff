package Cylinder;
public class Cylinder {

    private double radius;
    private double height;

    /*
     * default constructor + private variables for Cylinder object 
     */

    public Cylinder(){

    }
    
    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }


    public void setRadius(double radius){
        this.radius = radius;
    }



    public void setHeight(double height){
        this.height = height;
    }

    /*
     * Setters for Radius and Height
     */

    public double calculateArea(){
       return ((2 * Math.PI * (radius * radius)) + (2 * Math.PI * height));
    }

    public double calculateVolume(){
       return Math.PI * (radius * radius) * height;
    }

    /*
     * Formulas for Area and Volume of the Cylinder
     */

    public double getRadius(){
        return radius;
    }

    public double getHeight(){
        return height;
    }

    /*
     * Getters for Radius and Height (returns these values)
     */
}
