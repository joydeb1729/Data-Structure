package binaryTree;

public class App {
	public static void main(String[] args) {
		LinkedBinaryTree binaryTree = new LinkedBinaryTree();
		Node rootNode = binaryTree.addRoot(1);
		Node currentNode = binaryTree.addLeft(rootNode, 2);
		currentNode = binaryTree.addLeft(currentNode, 4);
		currentNode = binaryTree.addRight(currentNode.getParent(), 5);
		currentNode = binaryTree.addRight(rootNode, 3);
		currentNode = binaryTree.addLeft(currentNode, 6);
		currentNode = binaryTree.addRight(currentNode.getParent(), 7);

		binaryTree.preOrder(rootNode);
		System.out.println();
		binaryTree.postOrder(rootNode);
		System.out.println();
		binaryTree.inOrder(rootNode);
		System.out.println();
		
		System.out.println(binaryTree.size());
	}
}
