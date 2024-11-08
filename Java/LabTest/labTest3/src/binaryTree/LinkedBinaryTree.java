package binaryTree;

public class LinkedBinaryTree {
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
	
	public boolean isInternal(Node node) {
		if(node.getLeft() == null && node.getRight() == null) {
			return false;
		}
		return true;
	}
	
	public int numberOfChildren(Node node) {
		if(node.getLeft() == null && node.getRight() == null) {
			return 0;
		}
		else if ((node.getLeft() != null && node.getRight() == null) || 
				(node.getLeft() == null && node.getRight() != null)) {
			return 1;
		}
		else {
			return 2;
		}
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
	
	public boolean attach(Node position, LinkedBinaryTree t1, LinkedBinaryTree t2) {
		if(isInternal(position)) {
			return false;
		}
		size += t1.size() + t2.size();
		if(!t1.isEmpty()) {
			t1.root.setParent(position);
			position.setLeft(t1.root);
			t1.root = null;
			t1.size = 0;
		}
		if(!t2.isEmpty()) {
			t2.root.setParent(position);
			position.setRight(t2.root);
			t2.root = null;
			t2.size = 0;
		}
		return true;
	}
	
	public Node remove(Node position) {
		if(numberOfChildren(position) == 2) {
			return null;	
		}
		Node child = (position.getLeft() != null ? position.getLeft() : position.getRight());
		if(child != null) {
			child.setParent(position.getParent());
		}
		if(position == root) {
			root = child;
		}
		else {
			Node parent = position.getParent();
			if(position == parent.getLeft()) {
				parent.setLeft(child);
			}
			else {
				parent.setRight(child);
			}
		}
		size--;
		position.setElement(0);
		position.setLeft(null);
		position.setRight(null);
		position.setParent(null);
		return child;
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
