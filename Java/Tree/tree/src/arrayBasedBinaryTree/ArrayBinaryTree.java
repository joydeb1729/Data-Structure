package arrayBasedBinaryTree;

public class ArrayBinaryTree {
	public static final int CAPACITY = 100;
	private int[] data;
	private int size = 0;
	// No need of 'root' variable, since the root always stays in the 0 index of the array.
	
	// Array is initialized to zero values. In this program, zero value means empty/null.
	public ArrayBinaryTree() {
		this(CAPACITY);
	}
	
	public ArrayBinaryTree(int capacity) {
		data = new int[capacity];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean deleteAllTreeElements() {
		for(int i = 0; i < size(); i++) {
			data[i] = 0;  // Here zero means empty/null.
		}
		size = 0;
		return true;
	}
	
	public boolean isInternal(int indexOfNode) {
		int leftChild = data[2 * indexOfNode + 1];
		int rightChild = data[2 * indexOfNode + 2];
		if(leftChild == 0 && rightChild == 0) {
			return false;
		}
		return true;
	}
	
	public int numberOfChildren(int indexOfNode) {
		int leftChild = data[2 * indexOfNode + 1];
		int rightChild = data[2 * indexOfNode + 2];
		if(leftChild == 0 && rightChild == 0) {
			return 0;
		}
		else if ((leftChild != 0 && rightChild == 0) || 
				(leftChild == 0 && rightChild != 0)) {
			return 1;
		}
		else {
			return 2;
		}
	}
	
	public int addRoot(int e) throws IllegalStateException {
		if(!isEmpty()) {
			throw new IllegalStateException("Tree is not empty.");
		}
		data[0] = e;
		size = 1;
		return 0;
	}
	
	public int addLeft(int indexOfNode, int e) throws IllegalStateException {
		int indexOfLeftChild = 2 * indexOfNode + 1;
		if(data[indexOfLeftChild] != 0) {
			throw new IllegalStateException("The node already has left child.");	
		}
		data[indexOfLeftChild] = e;
		size++;
		return indexOfLeftChild;
	}
	
	public int addRight(int indexOfNode, int e) throws IllegalStateException {
		int indexOfRightChild = 2 * indexOfNode + 2;
		if(data[indexOfRightChild] != 0) {
			throw new IllegalStateException("The node already has right child.");	
		}
		data[indexOfRightChild] = e;
		size++;
		return indexOfRightChild;
	}
	
	public int set(int indexOfNode, int e) {
		data[indexOfNode] = e;
		return indexOfNode;
	}
	
	public boolean attach(int indexOfNode, ArrayBinaryTree t1, ArrayBinaryTree t2) {
		if(isInternal(indexOfNode)) {
			return false;
		}
		size += t1.size() + t2.size();
		ArrayQueue queue = new ArrayQueue();
		ArrayQueue queue2 = new ArrayQueue();
		int indexOfCurrentNode;
		if(!t1.isEmpty()) {
			indexOfCurrentNode = 2 * indexOfNode + 1;  // left child
			queue.enqueue(indexOfCurrentNode);
			for(int i = 0; i < t1.size(); i++) {
				data[queue.dequeue()] = t1.data[i];
				queue.enqueue(2 * indexOfCurrentNode + 1);
				queue.enqueue(2 * indexOfCurrentNode + 2);
			}
			t1.deleteAllTreeElements();
		}
		if(!t2.isEmpty()) {
			indexOfCurrentNode = 2 * indexOfNode + 2;  // right child
			queue2.enqueue(indexOfCurrentNode);
			for(int i = 0; i < t2.size(); i++) {
				data[queue2.dequeue()] = t2.data[i];
				queue2.enqueue(2 * indexOfCurrentNode + 1);
				queue2.enqueue(2 * indexOfCurrentNode + 2);
			}
			t2.deleteAllTreeElements();
		}
		return true;
	}
	
	public int remove(int indexOfNode) throws IllegalStateException {
		if(numberOfChildren(indexOfNode) == 2) {
			throw new IllegalStateException("The node has two children.");	
		}
		int indexOfLeftChild = 2 * indexOfNode + 1;
		int rightOfRightChild = 2 * indexOfNode + 2;
		int indexOfChild = (data[indexOfLeftChild] != 0 ? indexOfLeftChild : rightOfRightChild);
		data[indexOfNode] = data[indexOfChild];
		size--;
		return indexOfChild;
	}
	
	public void preOrder(int indexOfNode) {
		if(data[indexOfNode] != 0) {
			System.out.print(data[indexOfNode] + " ");
			preOrder(2 * indexOfNode + 1);
			preOrder(2 * indexOfNode + 2);
		}
	}
	
	public void postOrder(int indexOfNode) {
		if(data[indexOfNode] != 0) {
			postOrder(2 * indexOfNode + 1);
			postOrder(2 * indexOfNode + 2);
			System.out.print(data[indexOfNode] + " ");
		}
	}
	
	public void inOrder(int indexOfNode) {
		if(data[indexOfNode] != 0) {
			inOrder(2 * indexOfNode + 1);
			System.out.print(data[indexOfNode] + " ");
			inOrder(2 * indexOfNode + 2);
		}
	}
}
