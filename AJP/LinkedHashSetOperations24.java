import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetOperations24 {
    public static void main(String[] args) {
        // Creating a LinkedHashSet
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        // i. Insertion
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        System.out.println("LinkedHashSet after insertion: " + fruits);
        // ii. Deletion
        fruits.remove("Cherry"); // Removing by value
        System.out.println("LinkedHashSet after deletion: " + fruits);
        // iii. Traversing using Iterator
        System.out.println("Traversing using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Traversing using For-Each loop
        System.out.println("\nTraversing using For-Each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}