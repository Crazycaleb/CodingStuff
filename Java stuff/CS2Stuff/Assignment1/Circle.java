package Assignment1;

public class Circle extends GeometricObject{
    private double radius;

    public Circle()
    {

    }
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * (Math.pow(radius, 2.0));
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    public double getDiameter()
    {
        return 2 * radius;
    }

    public String toString() {
        return "Area: " + getArea() + "      " + "Perimeter: " + getPerimeter() + "     " + "Diameter: " + getDiameter() + "   " + "Color: " + getColor() + "   " + "Filled: " + isFilled();
    }

       public boolean equals(Object otherObject){
       if (otherObject instanceof Circle){
            Circle other = (Circle) otherObject;
            return getRadius() == (other.getRadius()) && isFilled() == other.isFilled() && getColor() == other.getColor();
       }
       else
       {
            return false;
       }
    }

}
