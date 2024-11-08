package heap;

public class ArrayMaxHeap {
	public static final int CAPACITY = 100;
	private int[] data;
	private int size = 0;
	// No need of 'root' variable, since the root always stays in the 0 index of the array.
	
	// Array is initialized to zero values. In this program, zero value means empty/null.
	public ArrayMaxHeap() {
		this(CAPACITY);
	}
	
	public ArrayMaxHeap(int capacity) {
		data = new int[capacity];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public void heapifyUp(int lastIndex) {
        int lastElement = data[lastIndex];
        int tempIndex = lastIndex;
        while((tempIndex > 0) && (lastElement > data[(tempIndex - 1) / 2])) {
        	data[tempIndex] = data[(tempIndex - 1) / 2];
        	tempIndex = (tempIndex - 1) / 2;
        }
        data[tempIndex] = lastElement;
    }
	
	public int heapifyDown(int lastIndex) {
        int tempIndex = 1;
        int lastElement = data[lastIndex];
        int maximumElement = data[0];
        lastIndex--;
        while(tempIndex < lastIndex) {
        	if((tempIndex < lastIndex) && (data[tempIndex] < data[tempIndex + 1])) {
        		tempIndex++;
        	}
        	if(lastElement >= data[tempIndex]) {
        		break;
        	}
        	data[(tempIndex - 1) / 2] = data[tempIndex];
        	tempIndex = 2 * tempIndex + 1; 
        }
        data[(tempIndex - 1) / 2] = lastElement;
        return maximumElement;
    }
	
	public void createMaxHeap(int[] arr) {
		// data array will contain the max heap
		for(int i = 0; i < arr.length; ++i) {
	      data[i] = arr[i];
	    }
		size = arr.length;
		for(int i = 1; i < size(); i++) {
			heapifyUp(i);
    	}
	}
	
    public int deleteMaximum()
    {
        int maximumValue = heapifyDown(size() - 1);
        data[size() - 1] = 0;
        size--;
        return maximumValue;
    }
    
    public int[] heapSort() {
    	for(int i = size() - 1; i > 0; i--) {
    		data[i] = heapifyDown(i);
    	}
    	int[] arr = new int[size()]; 
    	for(int i = 0; i < size(); i++) {
  	      arr[i] = data[i];
  	    }
    	return arr;
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
