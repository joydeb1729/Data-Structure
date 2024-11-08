package binaryTree;

public class Node {
	private int element;
	private Node parent;
	private Node left;
	private Node right;
	
	public Node(int element, Node parent, Node left, Node right) {
		this.element = element;
		this.parent = parent;
		this.left = left;
		this.right = right;
	}

	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
}