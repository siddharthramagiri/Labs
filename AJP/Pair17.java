public class Pair17<T, U> {
    // Instance variables of generic types T and U
    private T first;
    private U second;

    // Constructor to initialize the pair
    public Pair17(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Method to get the first element
    public T getFirst() {
        return first;
    }

    // Method to get the second element
    public U getSecond() {
        return second;
    }

    // Method to set the first element
    public void setFirst(T first) {
        this.first = first;
    }

    // Method to set the second element
    public void setSecond(U second) {
        this.second = second;
    }

    // Generic Method to display the pair values
    public void displayPair() {
        System.out.println("First: " + first + ", Second: " + second);
    }

    // Main method to test the generic class
    public static void main(String[] args) {
        // Creating a Pair instance with Integer and String types
        Pair17<Integer, String> pair1 = new Pair17<>(1, "Apple");
        pair1.displayPair();
        // Modifying values using set methods
        pair1.setFirst(2);
        pair1.setSecond("Banana");
        pair1.displayPair();
        // Creating a Pair instance with Double and Boolean types
        Pair17<Double, Boolean> pair2 = new Pair17<>(3.14, true);
        pair2.displayPair();
    }
}