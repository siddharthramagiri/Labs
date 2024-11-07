import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

// Employee class
class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

public class EmployeeVector26 {
    public static void main(String[] args) {
        // Creating a Vector to store Employee objects
        Vector<Employee> employees = new Vector<>();
        // Insertion of Employee objects
        employees.add(new Employee("Alice", 101));
        employees.add(new Employee("Bob", 102));
        employees.add(new Employee("Charlie", 103));
        employees.add(new Employee("David", 104));
        employees.add(new Employee("Eve", 105));
        System.out.println("Vector after insertion: " + employees);
        // Using Iterator to list all Employee objects
        System.out.println("\nTraversing using Iterator:");
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Using Enumeration to list all Employee objects
        System.out.println("\nTraversing using Enumeration:");
        Enumeration<Employee> enumeration = employees.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}