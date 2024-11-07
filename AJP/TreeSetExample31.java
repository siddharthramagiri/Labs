import java.util.Comparator;
import java.util.TreeSet;

// Employee class
class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

// Comparator for sorting Employees by ID
class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getId(), e2.getId());
    }
}

public class TreeSetExample31 {
    public static void main(String[] args) {
        // Creating a TreeSet to store Employee objects
        TreeSet<Employee> employeeSet = new TreeSet<>(new EmployeeComparator());
        // Adding Employee objects to the TreeSet
        employeeSet.add(new Employee("Alice", 101));
        employeeSet.add(new Employee("Bob", 102));
        employeeSet.add(new Employee("Charlie", 103));
        employeeSet.add(new Employee("David", 104));
        employeeSet.add(new Employee("Eve", 105));
        // Displaying the TreeSet (automatically sorted by ID)
        System.out.println("Employees in TreeSet:");
        for (Employee employee : employeeSet) {
            System.out.println(employee);
        }
    }
}