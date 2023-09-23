package Employee;

import java.util.ArrayList;

public class EmployeeTester 
{
    public static void main(String[] args)
    {

        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Carl", 10000));
        // Change to Marcus to see it return false (or whatever other name you want lol)
        list.add(new Employee("Carl", 10000));
        list.add(new Manager("Ann", 50000, 5000));

        System.out.println("Total sum: " + Sum(list));
        System.out.println(list.get(0).equals(list.get(1)));

    }

    public static double Sum(ArrayList<Employee> list)
    {
        double sum = 0;
        for (Employee j: list)
        {
            sum += j.getSalary();  
        }
        return sum;
    }
}
