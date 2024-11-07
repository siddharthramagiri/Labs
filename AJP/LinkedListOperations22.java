import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListOperations22 {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> fruits = new LinkedList<>();
        // i. Insertion
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        System.out.println("LinkedList after insertion: " + fruits);
        // ii. Deletion
        fruits.remove("Cherry"); // Removing by value
        fruits.remove(2); // Removing by index (removes "Date" which is nowat
                          // index2)System.out.println("LinkedList after deletion: " + fruits);
        // iii. Traversing using different methods
        // Traditional for loop
        System.out.println("Traversing using traditional for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
        // For-each loop
        System.out.println("\nTraversing using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        // Using Iterator
        System.out.println("\nTraversing using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Using ListIterator
        System.out.println("\nTraversing using ListIterator:");
        ListIterator<String> listIterator = fruits.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        // Using Descending Iterator
        System.out.println("\nTraversing using Descending Iterator:");
        Iterator<String> descendingIterator = fruits.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }
        // iv. Display the elements in reverse order
        System.out.println("\nElements in reverse order:");
        for (int i = fruits.size() - 1; i >= 0; i--) {
            System.out.println(fruits.get(i));
        }
    }
}