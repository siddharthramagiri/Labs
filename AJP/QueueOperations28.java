import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations28 {
    public static void main(String[] args) {
        // Creating a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();
        // i. Insertion (Enqueue)
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("David");
        queue.add("Eve");
        System.out.println("Queue after insertion: " + queue);
        // ii. Deletion (Dequeue)
        String removedElement = queue.poll(); // Removes the head of the queue
        System.out.println("Removed element: " + removedElement);
        System.out.println("Queue after deletion: " + queue);
        // iii. Traversing the Queue
        System.out.println("Traversing the queue:");
        for (String name : queue) {
            System.out.println(name);
        }
        // iv. Peeking at the front element
        String frontElement = queue.peek(); // Retrieves but does not remove the headof thequeue
        System.out.println("Front element (peek): " + frontElement);
        // v. Checking if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
    }
}