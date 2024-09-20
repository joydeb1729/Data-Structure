package circularLinkedList;

public class CircularLinkedList {

    private Node tail;
    private int size;

    public CircularLinkedList(){
        this.size = 0;
        this.tail = null;
    }
    public int getSize() {
        return size;
    }

    public Boolean isEmpty(){
        return size == 0;
    }

    public int first(){
        if(isEmpty()){
            return -1;
        }
        return tail.getNext().getElement();
    }

    public int last(){
        if(isEmpty()){
            return -1;
        }
        return tail.getElement();
    }

    public void rotate(){
        if(tail!=null){
            tail = tail.getNext();
        }
    }

    public void addFirst(int element){
        if(size == 0){
            tail = new Node(element, null);
            tail.setNext(tail);
        }
        else{
            Node newNode = new Node(element, tail.getNext());
            tail.setNext(newNode);
        }
        size++;
    }

    public void addLast(int element){
        addFirst(element);
        tail = tail.getNext();
    }

    public int removeFisrt(){
        if(isEmpty()){
            return -1;
        }
        Node head = tail.getNext();

        if(head == tail){
            tail = null;
        }
        else{
            tail.setNext(head.getNext());
        }
        size--;
        return head.getElement();
    }

    public void showList(){
        Node temp = tail.getNext();
        for(int i=0; i<size; i++){
            System.out.print(temp.getElement() +" ");
            temp=temp.getNext();
        }
        System.out.println();
    }

}
