package Q02;

public class Main {

    public static void main (String[] args) {

        SinglyLinkedList list1 = new SinglyLinkedList();
        SinglyLinkedList list2 = new SinglyLinkedList();

        for(int i=1; i<=5; i++){
            list1.addLast(i*10);
            list2.addLast(i);
        }

        list1.addFirst(0);
        list2.addLast(100);
        list1.showList();
        list2.showList();

        Node head1 = list1.getHead();
        Node head2 = list2.getHead();

        SinglyLinkedList mergedList = mergeList(head1, head2);

        mergedList.showList();

    }

    public static SinglyLinkedList mergeList(Node head1, Node head2){
        Node h1 = head1;
        Node h2 = head2;
        SinglyLinkedList mergedList = new SinglyLinkedList();

        while(h1!=null || h2!=null){

            if(h1==null){
                mergedList.addLast(h2.getElement());
                h2 = h2.getNext();
            }
            else if(h2==null){
                mergedList.addLast(h1.getElement());
                h1 = h1.getNext();
            }

            else if(h1.getElement() >= h2.getElement()){
                mergedList.addLast(h2.getElement());
                h2 = h2.getNext();
            }
            else if(h1.getElement() < h2.getElement()){
                mergedList.addLast(h1.getElement());
                h1 = h1.getNext();
            }
        }

        return mergedList;

    }

}
