import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorOperations25 {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> fruits = new Vector<>();
        // i. Insertion
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        System.out.println("Vector after insertion: " + fruits);
        // ii. Deletion
        fruits.remove("Cherry"); // Removing by value
        fruits.remove(2); // Removing by index (removes "Date" which is nowat index2)
        System.out.println("Vector after deletion: " + fruits);
        // iii. Traversing using Iterator
        System.out.println("Traversing using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nTraversing using Enumeration:");
        Enumeration<String> enumeration = fruits.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}