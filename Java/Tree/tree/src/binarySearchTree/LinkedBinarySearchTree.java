package binarySearchTree;

public class LinkedBinarySearchTree {
	private Node root = null;
	private int size = 0;
	
	private Node createNode(int e, Node parent, Node left, Node right) {
		return new Node(e, parent, left, right);
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public Node createBinarySearchTree(int[] arr) {
		Node currentNode = addRoot(arr[0]);
		Node previousNode = null;
		boolean isRightChild = false;
		for(int i = 1; i < arr.length; i++) {
			currentNode = root;
			while(currentNode != null) {
				previousNode = currentNode;
				if(arr[i] < currentNode.getElement()) {
					isRightChild = false;
					currentNode = currentNode.getLeft();
				}
				else {
					isRightChild = true;
					currentNode = currentNode.getRight();
				}
			}
			currentNode = createNode(arr[i], previousNode, null, null);
			if(isRightChild) {
				previousNode.setRight(currentNode);
			}
			else {
				previousNode.setLeft(currentNode);
			}
		}
		return root;
	}
	
	public Node search(Node root, int element) {
		if(root == null || root.getElement() == element) {
			return root;
		}
		if(root.getElement() < element) {
			return search(root.getRight(), element);
		}
		return search(root.getLeft(), element);
	}
	
	public Node addRoot(int e) {
		if(!isEmpty()) {
			return null;
		}
		root = createNode(e, null, null, null);
		size = 1;
		return root;
	}
	
	public Node addLeft(Node parent, int e) {
		if(parent.getLeft() != null) {
			return null;	
		}
		Node child = createNode(e, parent, null, null);
		parent.setLeft(child);
		size++;
		return child;
	}
	
	public Node addRight(Node parent, int e) {
		if(parent.getRight() != null) {
			return null;	
		}
		Node child = createNode(e, parent, null, null);
		parent.setRight(child);
		size++;
		return child;
	}
	
	public Node set(Node position, int e) {
		position.setElement(e);
		return position;
	}
	
	public void preOrder(Node currentNode) {
		if(currentNode != null) {
			System.out.print(currentNode.getElement() + " ");
			preOrder(currentNode.getLeft());
			preOrder(currentNode.getRight());
		}
	}
	
	public void postOrder(Node currentNode) {
		if(currentNode != null) {
			postOrder(currentNode.getLeft());
			postOrder(currentNode.getRight());
			System.out.print(currentNode.getElement() + " ");
		}
	}
	
	public void inOrder(Node currentNode) {
		if(currentNode != null) {
			inOrder(currentNode.getLeft());
			System.out.print(currentNode.getElement() + " ");
			inOrder(currentNode.getRight());
		}
	}
}
