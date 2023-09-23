package Taxes;

public class Item implements Taxable
{
    private String code;
    private double price;

    public Item (String code, double price)
    {
        this.code = code;
        this.price = price;
    }


    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getTaxable()
    {
        return price;
    }
    
}
