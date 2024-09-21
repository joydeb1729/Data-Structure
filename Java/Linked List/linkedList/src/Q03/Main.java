package Q03;

public class Main {

    public static void main (String[] args) {

        SinglyLinkedList list1 = new SinglyLinkedList();

        list1.addLast(1);
        list1.addLast(3);
        list1.addLast(3);
        list1.addLast(5);
        list1.addLast(7);
        list1.addLast(7);
        list1.addLast(7);
        list1.addLast(10);
        list1.addLast(10);

        list1.showList();

        list1.removeDuplicates();

        list1.showList();


    }

}
