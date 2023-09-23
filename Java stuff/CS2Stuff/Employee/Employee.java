package Employee;

public class Employee {
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String name, double baseSalary) 
    {
        this.name = name;
        this.salary = baseSalary;
    }

    public void setName(String newName) 
    {
        this.name = newName;
    }

    public void setBaseSalary(double newSalary) 
    {
        this.salary = newSalary;
    }

    public String getName() 
    {
        return this.name;
    }

    public double getSalary() 
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return "Employee: " + getName() + "     " + " Salary: " + getSalary();
    }

   @Override
   public boolean equals(Object otherObject){
       if (otherObject instanceof Employee){
            Employee other = (Employee) otherObject;
            return name.equals(other.name) && salary == other.getSalary();
       }
       else
       {
            return false;
       }

   }
    
}
