package Counter;
public class CounterTester{
  public static void main (String[] args){
    Counter C1 = new Counter();
    System.out.println(C1.display());
    C1.increment();
    C1.increment();
    System.out.println(C1.display());
    C1.reset();
    System.out.println(C1.display());
    /******************************/
    Counter C2 = new Counter(10);
    System.out.println("C2: " + C2.display());
    }
}