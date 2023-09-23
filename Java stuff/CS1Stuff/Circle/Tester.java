package Circle;
public class Tester{
    public static void main (String[] args){

        Circle circle1 = new Circle();
        circle1.setRadius(15);
        System.out.println("The radius of the circle is: " + circle1.getRadius());
        System.out.println("The area of the circle is: " + circle1.getArea());
    }
}