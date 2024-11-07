public class Calculator<T extends Number> {
    // Method to add two numbers
    public double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    // Method to multiply two numbers
    public double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    // Main method to test the generic class
    public static void main(String[] args) {
        // Creating a Calculator instance for Integer type
        Calculator<Integer> intCalc = new Calculator<>();
        System.out.println("Integer Addition: " + intCalc.add(10, 20)); // Output: 30.0System.out.println("Integer
                                                                        // Multiplication: " + intCalc.multiply(10,
                                                                        // 20)); // Output: 200.0// Creating a
                                                                        // Calculator instance for Double type
        Calculator<Double> doubleCalc = new Calculator<>();
        System.out.println("Double Addition: " + doubleCalc.add(10.5, 20.3)); // Output: 30.8System.out.println("Double
                                                                              // Multiplication: " +
                                                                              // doubleCalc.multiply(10.5, 20.3)); //
                                                                              // Output:213.15
        // Creating a Calculator instance for Float type
        Calculator<Float> floatCalc = new Calculator<>();
        System.out.println("Float Addition: " + floatCalc.add(10.5f, 20.5f)); // Output: 31.0System.out.println("Float
                                                                              // Multiplication: " +
                                                                              // floatCalc.multiply(10.5f, 20.5f)); //
                                                                              // Output:215.25

    }
}