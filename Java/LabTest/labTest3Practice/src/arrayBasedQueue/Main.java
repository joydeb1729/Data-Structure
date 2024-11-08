package arrayBasedQueue;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(5);
        queue.enqueue(15);
        queue.enqueue(30);

        // Display queue size
        System.out.println("Queue size: " + queue.size());

        // Display first element
        System.out.println("First element: " + queue.first());

        // Find and display minimum element
        try {
            int minElement = queue.min();
            System.out.println("Minimum element in the queue: " + minElement);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        // Dequeue elements and display them
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }

        // Try to find minimum element on empty queue
        try {
            System.out.println("Minimum element in the queue: " + queue.min());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
