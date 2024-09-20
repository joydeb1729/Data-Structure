package circularLinkedList;


public class Main {

    public static void main (String[] args) {

        CircularLinkedList list1 = new CircularLinkedList();
        CircularLinkedList list2 = new CircularLinkedList();

        for(int i=1; i<=5; i++){
            list1.addLast(i*10);
            list2.addLast(i);
        }

        list1.showList();
        list2.showList();


    }

}
