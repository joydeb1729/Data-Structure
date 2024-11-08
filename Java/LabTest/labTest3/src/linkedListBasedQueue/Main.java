package linkedListBasedQueue;

public class Main {
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        // Display queue size
        System.out.println("Queue size: " + queue.size());

        // Display first element
        System.out.println("First element: " + queue.first());

        // Dequeue elements and display them
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }

        // Display size after dequeuing all elements
        System.out.println("Queue size after dequeuing: " + queue.size());

        // Attempt to get the first element of an empty queue
        if (queue.isEmpty()) {
            System.out.println("Queue is empty, no first element.");
        } else {
            System.out.println("First element: " + queue.first());
        }
    }
}
