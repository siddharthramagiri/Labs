import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

class Student implements Comparable<Student> {
    private String sName;
    private String sRollNo;

    Student(String Name, String RollNo) {
        sName = Name;
        sRollNo = RollNo;
    }

    void displayData() {
        System.out.println("Name: " + sName + " RollNo: " + sRollNo);
    }

    public int compareTo(Student s) {
        return sName.compareTo(s.sName);
    }
}

class ArrayListUserDefinedSortUsingComparable34 {
    public static void main(String args[]) {
        ArrayList<Student> o1 = new ArrayList<Student>();
        o1.add(new Student("Name:" + 10, "RollNo: " + 10));
        o1.add(new Student("Name:" + 20, "RollNo: " + 20));
        o1.add(new Student("Name:" + 1, "RollNo: " + 1));
        o1.add(new Student("Name:" + 10, "RollNo: " + 15));
        Iterator<Student> it1 = o1.iterator();
        System.out.println("Array list values before sort");
        while (it1.hasNext())
            it1.next().displayData();
        Collections.sort(o1);
        System.out.println();
        System.out.println("Array list values after sort");
        it1 = o1.iterator();
        while (it1.hasNext())
            it1.next().displayData();
    }
}