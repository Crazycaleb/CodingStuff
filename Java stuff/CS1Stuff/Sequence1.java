/**
 * @author Caleb Carlton
 */

public class Sequence1 {

    public static void main(String[] args) {
        Sequence s1 = new Sequence();
        s1.add(1);
        s1.add(4);
        s1.add(9);
        s1.add(16);
        
        Sequence s2 = new Sequence();
        s2.add(9);
        s2.add(7);
        s2.add(4);
        s2.add(9);
        s2.add(11);
        
        System.out.println(s1.append(s2));
    }
    
    
}
