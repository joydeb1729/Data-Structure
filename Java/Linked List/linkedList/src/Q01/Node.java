package Q01;

public class Node {

    private int element;
    private Node next;
    private Node prev;

    public Node(int element, Node next, Node prev){
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    public int getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
