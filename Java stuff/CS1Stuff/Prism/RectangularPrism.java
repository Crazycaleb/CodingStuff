package Prism;
public class RectangularPrism{
    private double length;
    private double width;
    private double height;

    public RectangularPrism(){

    }

    public RectangularPrism(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double surfaceArea(){
        return (2 * ((width * length) + (height * width) + (height * length)));
    }

    public double volume(){
     return (width * length * height);
    }

}
