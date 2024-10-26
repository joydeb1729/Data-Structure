public class Main {
    public static void main(String[] args) {
        ArrayBinaryTree tree = new ArrayBinaryTree(10);

        // Adding elements
        tree.addRoot(10);
        tree.addLeft(0, 5);
        tree.addRight(0, 15);
        tree.addLeft(1, 3);
        tree.addRight(1, 7);
        tree.addLeft(2, 13);
        tree.addRight(2, 20);

        // Display the tree
        tree.show();

        // Output details
        System.out.println("Tree size: " + tree.getSize());
        System.out.println("Is tree empty? " + tree.isEmpty());
    }
}
