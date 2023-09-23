package Employee;

public class Manager extends Employee 
{
    private double bonus;

    public Manager(String name, double salary, double bonus)
    {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus()
    {
        return bonus;
    }

    public double getSalary()
    {
        return (bonus + super.getSalary());
    }

    public String toString()
    {
        return "Employee: " + getName() + "     " + " Salary: " + getSalary();
    }
    
    @Override
    public boolean equals(Object otherObject) {
        if (otherObject instanceof Employee) {
            Employee other = (Employee) otherObject;
            return getName().equals(other.getName()) && getBonus() == other.getSalary() && bonus == getBonus();
        } 
        else {
            return false;
        }

    }
}
