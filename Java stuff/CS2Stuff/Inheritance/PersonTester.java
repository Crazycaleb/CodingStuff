package Inheritance;
public class PersonTester {
    
    public static void main(String[] args)
    {
        Person p1 = new Dad();
        p1.setName("Mark");
        p1.setAge(55);
        System.out.println(p1.getName() + "     " + p1.getAge());
        Dad d1 = new Dad();
        d1.setName("James");
        d1.setAge(43);
        d1.setNumberOfKids(2);
        System.out.println(d1.getName() + "     " + d1.getAge() + "     " + d1.getNumberOfKids());
        System.out.println(p1);
        System.out.println(d1);
        Son s1 = new Son();
        s1.setName("Marcus");
        s1.setAge(17);
        s1.setSport("Cross Country");
        System.out.println(s1.toString());

        //---------------------------------------------

        Person p2 = new Dad("Carl", 42, 1);
        Dad d2 = new Dad("Reed", 38, 2);

        System.out.println(p2);
        System.out.println(d2);  

    }
}
