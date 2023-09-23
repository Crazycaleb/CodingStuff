package Geometry;

public class Formula 
{
    public static double cubeVolume(double h)
    {
        double volume = h * h * h;
        return volume;
    }

    public static double cubeSurface(double h)
    {
        double surface = 6 * (h * h);
        return surface;
    }
}
