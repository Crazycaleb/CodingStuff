package Taxes;

public class Utility 
{
    public static double totalTax(Taxable[] elements)
    {
        double total = 0;
        double percent = 0.09;
      for (Taxable obj : elements)
      {
         total = total + obj.getTaxable();
      }
      if (elements.length > 0) { return total * percent; }
      else { return 0; }    

    }

    public static Taxable largest(Taxable obj1, Taxable obj2)
    {
      if (obj1.getTaxable() > obj2.getTaxable())
      {
        return obj1;
      }
      else {
        return obj2;
      } 
    }
}
