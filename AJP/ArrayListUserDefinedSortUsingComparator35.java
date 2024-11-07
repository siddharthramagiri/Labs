import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparator<Student> {
    private String sName;
    private String sRollNo;

    Student() {
    }

    Student(String Name, String RollNo) {
        sName = Name;
        sRollNo = RollNo;
    }

    void displayData() {
        System.out.println("Name: " + sName + " RollNo: " + sRollNo);
    }

    public String getName() {
        return sName;
    }

    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

public class ArrayListUserDefinedSortUsingComparator35 {
    public static void main(String[] args) {
        ArrayList<Student> o1 = new ArrayList<Student>();
        o1.add(new Student("John", "10"));
        o1.add(new Student("Alice", "20"));
        o1.add(new Student("Bob", "1"));
        o1.add(new Student("David", "15"));
        Iterator<Student> it1 = o1.iterator();
        System.out.println("Array list values before sort");
        while (it1.hasNext()) {
            it1.next().displayData();
        }
        Collections.sort(o1, new Student());
        System.out.println("\nArray list values after sort");
        it1 = o1.iterator();
        while (it1.hasNext()) {
            it1.next().displayData();
        }
    }
}