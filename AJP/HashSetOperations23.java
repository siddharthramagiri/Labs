import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperations23 {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> fruits = new HashSet<>();
        // i. Insertion
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        System.out.println("HashSet after insertion: " + fruits);
        // ii. Deletion
        fruits.remove("Cherry"); // Removing by value
        System.out.println("HashSet after deletion: " + fruits);
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