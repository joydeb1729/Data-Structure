package binarySearchTree;

public class App {
	public static void main(String[] args) {
		LinkedBinarySearchTree bst = new LinkedBinarySearchTree();
		int[] arr = {45, 15, 79, 90, 10, 55, 12, 20, 50};
		Node root = bst.createBinarySearchTree(arr);
		bst.preOrder(root);
		
		System.out.println("\n" + bst.search(root, 50).getElement());
	}
}
