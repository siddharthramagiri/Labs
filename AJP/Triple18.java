// Generic Class with Multiple Type Parameters
public class Triple18<T, U, V> {
    // Instance variables of generic types T, U, and V
    private T first;
    private U second;
    private V third;

    // Constructor to initialize the triple
    public Triple18(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    // Method to get the first element
    public T getFirst() {
        return first;
    }

    // Method to get the second element
    public U getSecond() {
        return second;
    }

    // Method to get the third element
    public V getThird() {
        return third;
    }

    // Method to set the first element
    public void setFirst(T first) {
        this.first = first;
    }

    // Method to set the second element
    public void setSecond(U second) {
        this.second = second;
    }

    // Method to set the third element
    public void setThird(V third) {
        this.third = third;
    }

    // Method to display the triple values
    public void displayTriple() {
        System.out.println("First: " + first + ", Second: " + second + ", Third: " + third);
    }

    // Main method to test the generic class
    public static void main(String[] args) {
        // Creating a Triple instance with Integer, String, and Double types
        Triple18<Integer, String, Double> triple1 = new Triple18<>(1, "Apple", 2.5);
        triple1.displayTriple();
        // Modifying values using set methods
        triple1.setFirst(2);
        triple1.setSecond("Banana");
        triple1.setThird(3.0);
        triple1.displayTriple();
        // Creating a Triple instance with String, Boolean, and Character types
        Triple18<String, Boolean, Character> triple2 = new Triple18<>("Hello", true, 'A');
        triple2.displayTriple();
    }
}