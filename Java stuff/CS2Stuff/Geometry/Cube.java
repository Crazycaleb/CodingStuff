package Geometry;

public class Cube 
{
    private double h;
    public Cube()
    {

    }
    public Cube(double h)
    {
        this.h = h;
    }

    public void setCube(double h)
    {
        this.h = h;
    }

    public double getCube()
    {
        return h;
    }
    
    public double cubeVolume(double h) {
        double volume = h * h * h;
        return volume;
    }

    public double cubeSurface(double h) {
        double surface = 6 * (h * h);
        return surface;
    }
}
