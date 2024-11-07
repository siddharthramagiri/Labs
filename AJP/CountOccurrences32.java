import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurrences32 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Create a HashMap to store numbers and their counts
        HashMap<Integer, Integer> countMap = new HashMap<>();
        System.out.println("Enter integers (type 'exit' to finish):");
        while (true) {
            // Read input
            String input = scanner.nextLine();
            // Exit condition
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                // Parse the input to an integer
                int number = Integer.parseInt(input);
                // Update the count in the HashMap
                countMap.put(number, countMap.getOrDefault(number, 0) + 1);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer or type 'exit' to finish.");
            }
        }
        // Display the count of occurrences
        System.out.println("\nCount of occurrences:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // Close the scanner
        scanner.close();
    }
}