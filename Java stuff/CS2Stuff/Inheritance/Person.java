package Inheritance;

public abstract class Person 
{
    private String name;
    private int age;


    public Person() {
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Person name(String name) {
        setName(name);
        return this;
    }

    public Person age(int age) {
        setAge(age);
        return this;
    }

    public String toString()
    {
        return "Person " + name + "     " + age;
    }

    public abstract String greeting();
    

}
