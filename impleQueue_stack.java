import java.util.Stack;

public class QueueUsingTwoStacks {
    private Stack<Integer> stack1; // For enqueue operations
    private Stack<Integer> stack2; // For dequeue operations

    public QueueUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation: Add an element to the queue
    public void enqueue(int element) {
        stack1.push(element); // Push the element onto stack1
    }

    // Dequeue operation: Remove an element from the front of the queue
    public int dequeue() {
        if (stack2.isEmpty()) {
            // If stack2 is empty, transfer all elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // If stack2 is still empty, the queue is empty
        if (stack2.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        return stack2.pop(); // Pop the top element from stack2
    }

    // Peek operation: Get the front element without removing it
    public int peek() {
        if (stack2.isEmpty()) {
            // If stack2 is empty, transfer all elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // If stack2 is still empty, the queue is empty
        if (stack2.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        return stack2.peek(); // Peek the top element of stack2
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();

        // Enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Dequeued: " + queue.dequeue()); // Output: 1
        queue.enqueue(4);
        System.out.println("Peek: " + queue.peek());        // Output: 2
        System.out.println("Dequeued: " + queue.dequeue()); // Output: 2
        System.out.println("Dequeued: " + queue.dequeue()); // Output: 3
        System.out.println("Dequeued: " + queue.dequeue()); // Output: 4

        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: true
    }
}
