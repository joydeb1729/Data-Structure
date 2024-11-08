package arrayBasedBinaryTree;

public class ArrayQueue {
	public static final int CAPACITY = 100;
	private int[] data;
	private int f = 0;
	private int sz = 0;
	
	public ArrayQueue() {
		this(CAPACITY);
	}
	
	public ArrayQueue(int capacity) {
		data = new int[capacity];
	}
	
	public int size() {
		return sz;
	}
	
	public boolean isEmpty() {
		return (sz == 0);
	}
	
	public void enqueue(int e) throws IllegalStateException {
		if(sz == data.length) {
			throw new IllegalStateException("Queue is full.");
		}
		int avail = (f + sz) % data.length;
		data[avail] = e;
		sz++;
	}
	
	public int first() {
		if(isEmpty()) {
			return -1; // a garbaze value.
		}
		return data[f];
	}
	
	public int dequeue() {
		if(isEmpty()) {
			return -1; // a garbaze value.
		}
		int answer = data[f];
		data[f] = 0;
		f = (f + 1) % data.length;
		sz--;
		return answer;
	}
}
