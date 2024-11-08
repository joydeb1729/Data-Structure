package linkedListBasedQueue;

import singlyLinkedList.SinglyLinkedList;

public class LinkedQueue {
    private SinglyLinkedList list;

    public LinkedQueue(){
        list = new SinglyLinkedList();
    }

    public int size(){
        return list.getSize();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void enqueue(int element){
        list.addLast(element);
    }

    public int first(){
        return list.first();
    }

    public int dequeue(){
        return list.removeFirst();
    }

}
