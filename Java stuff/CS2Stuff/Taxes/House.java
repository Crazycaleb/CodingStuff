package Taxes;

public class House implements Taxable {
    private String id;
    private double value;

    public House(String id, double value)
    {
        this.id = id;
        this.value = value;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    public double getTaxable()
    {
        return value;
    }

}
