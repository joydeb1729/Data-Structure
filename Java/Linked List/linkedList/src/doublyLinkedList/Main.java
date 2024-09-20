package doublyLinkedList;

public class Main {

    public static void main (String[] args) {

        DoublyLinkedList list1 = new DoublyLinkedList();
        DoublyLinkedList list2 = new DoublyLinkedList();

        for(int i=1; i<=6; i++){
            list1.addLast(i*10);
            list2.addLast(i);
        }

        list1.showList();
        list2.showList();


    }

}
