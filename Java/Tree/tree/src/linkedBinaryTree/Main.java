package linkedBinaryTree;

public class Main {
    public static void main(String[] args) {
        // Create a linkedBinaryTree.LinkedBinaryTree instance
        LinkedBinaryTree tree = new LinkedBinaryTree();

        // Testing addRoot and addLeft/addRight
        Node root = tree.addRoot(10);
        System.out.println("Root added with element: " + root.getElement());

        Node leftChild = tree.addLeft(root, 5);
        System.out.println("Left child added with element: " + leftChild.getElement());

        Node rightChild = tree.addRight(root, 15);
        System.out.println("Right child added with element: " + rightChild.getElement());

        // Testing additional child nodes
        Node leftLeft = tree.addLeft(leftChild, 3);
        System.out.println("Left-Left child added with element: " + leftLeft.getElement());

        Node leftRight = tree.addRight(leftChild, 7);
        System.out.println("Left-Right child added with element: " + leftRight.getElement());

        Node rightLeft = tree.addLeft(rightChild, 13);
        System.out.println("Right-Left child added with element: " + rightLeft.getElement());

        Node rightRight = tree.addRight(rightChild, 20);
        System.out.println("Right-Right child added with element: " + rightRight.getElement());

        // Show tree structure
        System.out.println("\nCurrent linkedBinaryTree.LinkedBinaryTree structure:");
        tree.showRecursive(tree.getRoot(), 0);

        // Test getSize and isEmpty
        System.out.println("\nTree size (should be 7): " + tree.getSize());
        System.out.println("Is tree empty? " + tree.isEmpty());

        // Test numberOfChild and isInternal
        System.out.println("Number of children of root (should be 2): " + tree.numberOfChild(root));
        System.out.println("Is root an internal node? " + tree.isInternal(root));

        // Test set method
        tree.set(rightRight, 25);
        System.out.println("Changed right-right child element to 25");
        tree.showRecursive(tree.getRoot(), 0);

        // Test attachLeftTrees and attachRightTrees
        LinkedBinaryTree subTree = new LinkedBinaryTree();
        Node subTreeRoot = subTree.addRoot(50);
        subTree.addLeft(subTreeRoot, 40);
        subTree.addRight(subTreeRoot, 60);

        System.out.println("\nAttaching subtree to left of left-right node:");
        tree.attachLeftTrees(leftRight, subTree);
        tree.showRecursive(tree.getRoot(), 0);

        // Test remove method
        System.out.println("\nRemoving left-left node:");
        tree.remove(leftLeft);
        tree.showRecursive(tree.getRoot(), 0);

        // Display final tree structure
        System.out.println("\nFinal linkedBinaryTree.LinkedBinaryTree structure:");
        tree.showRecursive(tree.getRoot(), 0);
        System.out.println("Final tree size: " + tree.getSize());
    }
}
