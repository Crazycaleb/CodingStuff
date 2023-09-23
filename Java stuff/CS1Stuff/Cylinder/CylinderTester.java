package Cylinder;
public class CylinderTester {
    public static void main (String [] args){
        Cylinder cylinder1 = new Cylinder();
        cylinder1.setRadius(10);
        cylinder1.setHeight(20);
        double cylinderArea = cylinder1.calculateArea();
        double cylinderVolume = cylinder1.calculateVolume();
        System.out.println("Cylinder: ");
        System.out.println("Radius: " + cylinder1.getRadius());
        System.out.println("Height: " + cylinder1.getHeight());
        System.out.println("Area: " + cylinderArea);
        System.out.println("Volume: " + cylinderVolume);
    }
}
