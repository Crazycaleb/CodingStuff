package Inheritance;
public class Son extends Dad 
{
    private String sport;


    public Son() {
    }

    public Son(String name, int age, int numberOfKids, String sport) 
    {
        super(name, age, numberOfKids);
        this.sport = sport;
    }


    public String getSport() {
        return this.sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
    
    public String toString() {
        return "Person " + getName() + "     " + getAge() + "       " + sport;
    }

}

