import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList33 {
    public static void main(String[] args) {
        // Creating an ArrayList to store Integer values
        ArrayList<Integer> numbers = new ArrayList<>();
        // Adding values to the ArrayList
        numbers.add(45);
        numbers.add(12);
        numbers.add(23);
        numbers.add(78);
        numbers.add(5);
        numbers.add(34);
        System.out.println("ArrayList before sorting: " + numbers);
        // Sorting the ArrayList in ascending order
        Collections.sort(numbers);
        // Displaying the sorted ArrayList
        System.out.println("ArrayList after sorting: " + numbers);
    }
}