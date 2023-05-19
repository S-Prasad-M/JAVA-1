import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue
        Queue<String> queue = new LinkedList<>();

        // Enqueue elements to the Queue
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");
        queue.offer("Durian");
        // Print the elements of the Queue
        System.out.println("Queue: " + queue);

        // Find and print the size of the Queue
        int size = queue.size();
        System.out.println("Size of Queue: " + size);

        // Access and print the front element of the Queue
        String frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        // Check if the Queue is empty and print the result
        boolean isEmpty = queue.isEmpty();
        System.out.println("Queue is empty: " + isEmpty);

        // Dequeue an element from the Queue
        String dequeuedElement = queue.poll();
        System.out.println("Dequeued element: " + dequeuedElement);

        // Enqueue the element "Grapes" to the Queue
        queue.offer("Grapes");
        System.out.println("Queue after enqueuing Grapes: " + queue);

        // Iterate over the elements of the Queue and print each element
        System.out.print("Elements in Queue: ");
        for (String element : queue) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Clear the Queue and print the empty Queue
        queue.clear();
        System.out.println("Queue after clearing: " + queue);
    }
}