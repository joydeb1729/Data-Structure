public class ArrayBinaryTree {
    private int size;
    private int capacity=100;
    private Integer[] tree;

    public ArrayBinaryTree(int capacity){
        this.capacity = capacity;
        this.tree = new Integer[capacity];
        this.size = 0;
    }
    public ArrayBinaryTree(){
        this.tree = new Integer[capacity];
        this.size = 0;
    }

    public Integer getElement(int index){
        if(index>=size){
            throw new ArrayIndexOutOfBoundsException("Index out of bound");
        }
        return tree[index];
    }

    public int getSize(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size==0;
    }

    public void addRoot(int element){
        if(!isEmpty()){
            throw new IllegalStateException("Tree already has a root!");
        }
        tree[0] = element;
        size = 1;
    }

    public void addLeft(int parentIndex, int element){
        int childIndex = (2 * parentIndex) +1;

        if(childIndex >= capacity || childIndex < 0){
            throw new ArrayIndexOutOfBoundsException("Left Child index out of bound!");
        }
        if(tree[parentIndex] == null){
            throw new IllegalStateException("Parent Node does not exist!");
        }

        tree[childIndex] = element;
        size++;
    }

    public void addRight(int parentIndex, int element){
        int childIndex = (2 * parentIndex) + 2;

        if(childIndex >= capacity || childIndex < 0){
            throw new ArrayIndexOutOfBoundsException("Left Child index out of bound!");
        }
        if(tree[parentIndex] == null){
            throw new IllegalStateException("Parent Node does not exist!");
        }

        tree[childIndex] = element;
        size++;
    }

    public void show(){
        System.out.println("Array representation of the Binary tree:");

        for(int i = 0; i<size; i++){
            System.out.print(tree[i] + " ");
        }
        System.out.println();
    }

}
