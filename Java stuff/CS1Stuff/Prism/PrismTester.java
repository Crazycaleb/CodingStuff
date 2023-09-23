package Prism;
public class PrismTester{
    
    public static void main(String args[]){
        RectangularPrism prism = new RectangularPrism();
        prism.setLength(8);
        prism.setWidth(12);
        prism.setHeight(10);
        double prismArea = prism.surfaceArea();
        double prismVolume = prism.volume();
        System.out.println("Rectangular Prism: ");
        System.out.println("Width: " + prism.getWidth());
        System.out.println("Height: " + prism.getHeight());
        System.out.println("Length: " + prism.getLength());
        System.out.println("Surface Area: " + prismArea);
        System.out.println("Volume: " + prismVolume);

    }
}
