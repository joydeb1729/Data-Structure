package heap;

public class App {
	public static void main(String[] args) {
		int[] arr = {50, 30, 40, 10, 20, 15};
		ArrayMaxHeap maxHeap = new ArrayMaxHeap();
		maxHeap.createMaxHeap(arr);
		maxHeap.preOrder(0);
		System.out.println("\nMaximum value " +  maxHeap.deleteMaximum() + " is deleted.");
		maxHeap.preOrder(0);
		
		// Remember after sorting this is not a heap anymore.
		int[] sorted = maxHeap.heapSort();
		System.out.println("\nSorted array using heap sort: ");
	    for(int i = 0; i < sorted.length; i++) {
	    	System.out.print(sorted[i] + " ");
	    }
	    System.out.println();
	}
}
