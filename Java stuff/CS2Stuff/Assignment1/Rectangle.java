package Assignment1;

public class Rectangle extends GeometricObject
{
    private double width;
    private double height;

    public Rectangle(){

    }

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.height = height;
    }


    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea()
    {
        return height * width;
    }

    public double getPerimeter()
    {
        return 2 * (width + height);
    }

    public String toString() {
        return "Area: " + getArea() + "      " + "Perimeter: " + getPerimeter() + "     " + "Color: " + getColor() + "   " + "Filled: " + isFilled();
    }

}
