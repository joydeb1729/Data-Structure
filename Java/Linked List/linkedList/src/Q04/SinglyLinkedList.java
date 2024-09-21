package Q04;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList(){
        head=null;
        tail=null;
        size=0;
    }

    public int getSize() {
        return size;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public Boolean isEmpty(){
        return size == 0;
    }

    public int first(){
        if(isEmpty()){
            return -1;
        }
        return head.getElement();
    }

    public int last(){
        if(isEmpty()){
            return -1;
        }
        return tail.getElement();
    }

    public void addFirst(int element){
        Node newNode = new Node(element, head);
        this.head = newNode;
        if(size == 0){
            this.tail = head;
        }
        size++;
    }

    public void addLast(int element){
        Node newNode = new Node(element, null);
        if(isEmpty()){
            head = newNode;
        }
        else{
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }

    public int removeFirst(){
        if(isEmpty()){
            return -1;
        }
        int removedElement = head.getElement();
        head = head.getNext();
        size--;
        if(size == 0){
            tail = null;
        }
        return  removedElement;
    }

    public int removeLat(){
        if(isEmpty()){
            return 1;
        }
        int removedElement = tail.getElement();;
        Node temp = head;
        while(temp.getNext() != tail){
            temp = temp.getNext();
        }
        temp.setNext(null);
        size--;
        if(size == 0){
            head = null;
        }
        return removedElement;
    }

    public void removeGreater(){

        Node current = this.getHead();

        while(current.getNext()!=null){
            Node temp = current.getNext();
            Node prev = current;

            while(temp!=null){
                if(temp.getElement() > current.getElement()){
                    temp = temp.getNext();
                    prev.setNext(temp);
                    size--;
                }
                else {
                    temp = temp.getNext();
                    prev = prev.getNext();
                }

            }
            current = current.getNext();
            if(current == null){
                break;
            }

        }

    }

    public void showList(){
        Node temp = head;
        for(int i=0; i<size; i++){
            System.out.print(temp.getElement() +" ");
            temp=temp.getNext();
        }
        System.out.println();
    }
}
