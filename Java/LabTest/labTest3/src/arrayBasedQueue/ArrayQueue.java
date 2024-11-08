package arrayBasedQueue;

public class ArrayQueue {
    public static final int CAPACITY = 100;
    private int[] data;
    private int first = 0;
    private int size = 0;

    public ArrayQueue(int CAPACITY) {
        this.data = new int[CAPACITY];
    }

    public ArrayQueue() {
        this(CAPACITY);
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int first() {
        if (isEmpty()) {
            return -1;
        }
        return data[first];
    }

    public void enqueue(int element) throws IllegalStateException {
        if (size == data.length) {
            throw new IllegalStateException("Queue is full");
        }
        int avail = (first + size) % data.length;
        data[avail] = element;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int removedElement = data[first];
        first = (first + 1) % data.length;
        size--;
        return removedElement;
    }

    // Min method to find the smallest element in the queue
    public int min() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int minValue = data[first];
        for (int i = 1; i < size; i++) {
            int currentIndex = (first + i) % data.length;
            if (data[currentIndex] < minValue) {
                minValue = data[currentIndex];
            }
        }
        return minValue;
    }
}
