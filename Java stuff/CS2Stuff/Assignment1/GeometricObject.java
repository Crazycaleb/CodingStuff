package Assignment1;

public class GeometricObject 
{
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject()
    {

    }

    public GeometricObject(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String toString()
    {
        return "Color: " + getColor() + "   " + "Filled: " + isFilled() + "   " + "Date Created: " + getDateCreated(); 
    }
}
