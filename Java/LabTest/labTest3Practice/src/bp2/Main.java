package bp2;

public class Main {
    public static void main(String[] args) {
        // Create the main tree
        LinkedBinaryTree mainTree = new LinkedBinaryTree();

        // Add the root
        Node root = mainTree.addRoot(1);
        // Add left and right children to the root
        Node leftChild = mainTree.addLeft(root, 2);
        Node rightChild = mainTree.addRight(root, 3);

        // Add children to the left child
        mainTree.addLeft(leftChild, 4);
        mainTree.addRight(leftChild, 5);

        // Add children to the right child
        mainTree.addLeft(rightChild, 6);
        mainTree.addRight(rightChild, 7);

        // Display the size of the main tree
        System.out.println("Size of the main tree: " + mainTree.getSize());

        // Preorder traversal
        System.out.print("Preorder traversal of the main tree: ");
        mainTree.preOrder(mainTree.getRoot());
        System.out.println();

        // Inorder traversal
        System.out.print("Inorder traversal of the main tree: ");
        mainTree.inOrder(mainTree.getRoot());
        System.out.println();

        // Postorder traversal
        System.out.print("Postorder traversal of the main tree: ");
        mainTree.postOrder(mainTree.getRoot());
        System.out.println();

        // Create two smaller trees to attach
        LinkedBinaryTree tree1 = new LinkedBinaryTree();
        tree1.addRoot(8);
        tree1.addLeft(tree1.getRoot(), 9);
        tree1.addRight(tree1.getRoot(), 10);

        LinkedBinaryTree tree2 = new LinkedBinaryTree();
        tree2.addRoot(11);
        tree2.addLeft(tree2.getRoot(), 12);
        tree2.addRight(tree2.getRoot(), 13);

        Node position = mainTree.getNode(4);
        //mainTree.attachLeftTrees(position, tree1);
        //mainTree.attachRightTrees(position, tree2);

        //Attach tree1 and tree2 to the leftChild (node with value 2)
        if (mainTree.attachTrees(position, tree1, tree2)) {
            System.out.println("Successfully attached tree1 and tree2 to the left child of the main tree.");
        } else {
            System.out.println("Failed to attach trees.");
        }


        // Display the new size of the main tree after attachment
        System.out.println("New size of the main tree after attachment: " + mainTree.getSize());

        // Preorder traversal after attachment
        System.out.print("Preorder traversal of the main tree after attachment: ");
        mainTree.preOrder(mainTree.getRoot());
        System.out.println();

        // Inorder traversal after attachment
        System.out.print("Inorder traversal of the main tree after attachment: ");
        mainTree.inOrder(mainTree.getRoot());
        System.out.println();

        // Postorder traversal after attachment
        System.out.print("Postorder traversal of the main tree after attachment: ");
        mainTree.postOrder(mainTree.getRoot());
        System.out.println();
        System.out.println(mainTree.getNode(4).getElement());
    }
}
