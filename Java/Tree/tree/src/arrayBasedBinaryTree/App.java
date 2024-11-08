package arrayBasedBinaryTree;

public class App {
	public static void main(String[] args) {
		try {
			// Creating a binary tree (slide 24)
			ArrayBinaryTree binaryTree = new ArrayBinaryTree();
			int indexOfRoot = binaryTree.addRoot(1);
			int indexOfCurrentNode = binaryTree.addLeft(indexOfRoot, 2);
			indexOfCurrentNode = binaryTree.addLeft(indexOfCurrentNode, 4);
			indexOfCurrentNode = binaryTree.addRight((indexOfCurrentNode - 1)/2, 5);
			indexOfCurrentNode = binaryTree.addRight(indexOfRoot, 3);
			indexOfCurrentNode = binaryTree.addLeft(indexOfCurrentNode, 6);
			indexOfCurrentNode = binaryTree.addRight((indexOfCurrentNode - 1)/2, 7);

			System.out.print("Preorder traversal: ");
			binaryTree.preOrder(0);
			System.out.print("\nPostorder traversal: ");
			binaryTree.postOrder(0);
			System.out.print("\nInorder traversal: ");
			binaryTree.inOrder(0);
			System.out.println();
			
			System.out.println("Number of elements: " + binaryTree.size());
			
			// Creating a binary tree
			ArrayBinaryTree binaryTree2 = new ArrayBinaryTree();
			indexOfRoot = binaryTree2.addRoot(11);
			indexOfCurrentNode = binaryTree2.addLeft(indexOfRoot, 12);
			indexOfCurrentNode = binaryTree2.addRight(indexOfRoot, 13);
			
			System.out.print("\nPreorder traversal: ");
			binaryTree2.preOrder(0);
			
			// Creating a binary tree
			ArrayBinaryTree binaryTree3 = new ArrayBinaryTree();
			indexOfRoot = binaryTree3.addRoot(12);
			
			System.out.print("\nPreorder traversal: ");
			binaryTree3.preOrder(0);
			
			// Attachment
			binaryTree.attach(4, binaryTree2, binaryTree3);
			
			System.out.print("\n\nPreorder traversal: ");
			binaryTree.preOrder(0);
			
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
		}
	}
}
