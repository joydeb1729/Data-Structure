package doublyLinkedList;

public class DoublyLinkedList {

    private Node header;
    private Node tailer;
    private int size;

    public DoublyLinkedList(){
        header = new Node(-1, null, null);
        tailer = new Node(-1, null, null);
        header.setNext(tailer);
        tailer.setPrev(header);
        size = 0;
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
        return header.getNext().getElement();
    }

    public int last(){
        if(isEmpty()){
            return -1;
        }
        return tailer.getPrev().getElement();
    }

    public void addFirst(int element){
        addBetween(element, header.getNext(), header);
    }

    public void addLast(int element){
        addBetween(element, tailer, tailer.getPrev());
    }

    public int removeFirst(){
        if(isEmpty()){
            return -1;
        }
        return remove(header.getNext());
    }

    public int removeLast(){
        if(isEmpty()){
            return -1;
        }
        return remove(tailer.getPrev());
    }

    public void addBetween(int element, Node successor, Node predecessor){
        Node newNode = new Node(element, successor, predecessor);
        predecessor.setNext(newNode);
        successor.setPrev(newNode);
        size++;
    }

    public int remove(Node node){
        Node predecessor = node.getPrev();
        Node successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;

        return node.getElement();
    }

    public void showList(){
        Node temp = header.getNext();
        for(int i=0; i<size; i++){
            System.out.print(temp.getElement() +" ");
            temp = temp.getNext();
        }
        System.out.println();
    }

}
