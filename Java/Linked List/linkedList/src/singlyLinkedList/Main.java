package singlyLinkedList;

public class Main {

    public static void main (String[] args) {

        SinglyLinkedList list1 = new SinglyLinkedList();
        SinglyLinkedList list2 = new SinglyLinkedList();

        for(int i=1; i<=5; i++){
            list1.addLast(i*10);
            list2.addLast(i);
        }

        list1.showList();
        list2.showList();

    }

}
