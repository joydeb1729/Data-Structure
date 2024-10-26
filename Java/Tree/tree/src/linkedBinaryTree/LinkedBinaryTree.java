package linkedBinaryTree;

public class LinkedBinaryTree {
    private Node root;
    private int size;

    public LinkedBinaryTree(){
        root = null;
        size = 0;
    }

    public Node createNode(int element, Node parent, Node left, Node right){
        return new Node(element,parent,left,right);
    }

    public int getSize(){
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public boolean isInternal(Node node){
        if(node.getLeft()==null && node.getRight()==null){
            return false;
        }
        else{
            return true;
        }
    }

    public int numberOfChild(Node node){
        if(node.getLeft()==null && node.getRight()==null){
            return 0;
        }
        else if (node.getLeft()!=null && node.getRight()!=null ) {
            return 2;
        }
        else {
            return 1;
        }
    }

    public Node addRoot(int element){
        if(!isEmpty()){
            return null;
        }
        this.root = createNode(element, null, null, null);
        size = 1;

        return this.getRoot();
    }

    public Node addLeft(Node parent, int e){
        if(parent.getLeft()!=null){
            return null;
        }
        Node leftChild = createNode(e,parent,null, null);
        parent.setLeft(leftChild);

        size++;
        return leftChild;
    }

    public Node addRight(Node parent, int e){
        if(parent.getRight()!=null){
            return null;
        }
        Node rightChild = createNode(e,parent,null, null);
        parent.setRight(rightChild);

        size++;
        return rightChild;
    }

    public Node set(Node node, int e){
        node.setElement(e);
        return node;
    }

    public boolean attachTrees(Node position, LinkedBinaryTree t1,LinkedBinaryTree t2){
        if(isInternal(position)){
            return false;
        }

        this.size += (t1.getSize()+t2.getSize());

        if(!t1.isEmpty()){
            t1.getRoot().setParent(position);
            position.setLeft(t1.getRoot());

            t1.setRoot(null);
            t1.setSize(0);
        }
        if(!t2.isEmpty()){
            t2.getRoot().setParent(position);
            position.setLeft(t2.getRoot());

            t2.setRoot(null);
            t2.setSize(0);
        }
        return true;
    }

    public boolean attachLeftTrees(Node position, LinkedBinaryTree t){
        if(position.getLeft()!=null){
            return false;
        }

        this.size += t.getSize();

        if(!t.isEmpty()){
            t.getRoot().setParent(position);
            position.setLeft(t.getRoot());

            t.setRoot(null);
            t.setSize(0);
        }
        return true;
    }

    public boolean attachRightTrees(Node position, LinkedBinaryTree t){
        if(isInternal(position)){
            return false;
        }

        this.size += t.getSize();

        if(!t.isEmpty()){
            t.getRoot().setParent(position);
            position.setLeft(t.getRoot());

            t.setRoot(null);
            t.setSize(0);
        }
        return true;
    }

    public Node remove(Node position){
        if(numberOfChild(position) == 2){
            return null;
        }

        Node child=null;

        if(position.getLeft()!=null){
            child = position.getLeft();
        }
        else if (position.getRight()!=null){
            child = position.getRight();
        }
        if(child!=null){       // there is only one child of position.
            child.setParent(position.getParent());
        }
        if (position==root){
            root = child;
        }
        else {
            Node parent = position.getParent();
            if(parent.getLeft() == position){
                parent.setLeft(child);
            }
            else{
                parent.setRight(child);
            }
        }
        size--;
        return child;

    }

    public void showRecursive(Node node, int level) {
        if (node != null) {
            // Fetch details of the node's relationships
            String parentElement = (node.getParent() == null) ? "null" : String.valueOf(node.getParent().getElement());
            String leftElement = (node.getLeft() == null) ? "null" : String.valueOf(node.getLeft().getElement());
            String rightElement = (node.getRight() == null) ? "null" : String.valueOf(node.getRight().getElement());

            // Print the node with indentation based on its level in the tree
            System.out.println("    ".repeat(level) +
                    "linkedBinaryTree.Node: " + node.getElement() +
                    " [Parent: " + parentElement +
                    ", Left: " + leftElement +
                    ", Right: " + rightElement + "]");

            // Recursively print left and right children
            showRecursive(node.getLeft(), level + 1);
            showRecursive(node.getRight(), level + 1);
        }
    }

}
