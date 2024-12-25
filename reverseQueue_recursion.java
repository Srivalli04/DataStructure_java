import java.util.LinkedList;
import java.util.Queue;

public class QueueReverser {

    // Function to reverse the queue using recursion
    public static void reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return;           
        }

        // Remove the front element
        int front = queue.poll();

        // Recursively reverse the remaining queue
        reverseQueue(queue);

        // Add the removed element to the rear of the queue
        queue.add(front);
    }

    public static void main(String[] args) {
        // Initialize a queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // Print the original queue
        System.out.println("Original Queue: " + queue);

        // Reverse the queue
        reverseQueue(queue);

        // Print the reversed queue
        System.out.println("Reversed Queue: " + queue);
    }
}
