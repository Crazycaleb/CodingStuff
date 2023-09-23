package Inheritance;
public class Dad extends Person
{
    private int numberOfKids;
    // private String name; DO NOT DO THIS
    // private int age;

    public Dad() {
    }


    public Dad(String name, int age, int numberOfKids) 
    {
        super(name, age);
        this.numberOfKids = numberOfKids;
    }


    public int getNumberOfKids() 
    {
        return this.numberOfKids;
    }

    public void setNumberOfKids(int numberOfKids)
    {
        this.numberOfKids = numberOfKids;
    }
    
    public String toString() {
        return "Person " + getName() + "     " + getAge() + "       " + numberOfKids;
    }

    public String greeting()
    {
        return "Hello";
    }

}

