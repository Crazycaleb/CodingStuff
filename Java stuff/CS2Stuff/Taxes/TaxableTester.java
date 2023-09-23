package Taxes;

public class TaxableTester {

    public static void main(String[] args)
    {
        Taxable[] house = new Taxable[3];
        house[0] = new House("119", 800000);
        house[1] = new House("120", 325000);
        house[2] = new House("121", 150000);

        double houseTax = Utility.totalTax(house);
        System.out.println("House tax total: " + houseTax);

        Taxable[] items = new Taxable[3];
        items[0] = new Item("0001", 2.50);
        items[1] = new Item("0002", 7.5);
        items[2] = new Item("0003", 25.0);

        double itemTax = Utility.totalTax(items);
        System.out.println("Item tax total: " + itemTax);

        Taxable theLargest = Utility.largest(house[0], house[1]);
        House large = (House) theLargest;
        System.out.println(large.getId());



    }
    
}
