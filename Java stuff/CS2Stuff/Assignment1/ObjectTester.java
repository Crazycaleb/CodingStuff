package Assignment1;

public class ObjectTester {
    
    public static void main(String[] args)
    {
        GeometricObject obj = new GeometricObject("white", false);
        System.out.println(obj.toString());
        Rectangle rect1 = new Rectangle(3, 4);
        Rectangle rect2 = new Rectangle(5, 13, "blue", true);
        System.out.println(rect1.toString());
        System.out.println(rect2.toString());
        Circle circ1 = new Circle(4);
        Circle circ2 = new Circle(9, "red", true);
        System.out.println(circ1.toString());
        System.out.println(circ2.toString());

    }
}
