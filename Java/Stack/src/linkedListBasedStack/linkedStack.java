package linkedListBasedStack;

import singlyLinkedList.SinglyLinkedList;

public class linkedStack {

    private SinglyLinkedList list;

    public linkedStack(){
        list = new SinglyLinkedList();
    }

    public int size(){
        return list.getSize();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void push(int element){
        list.addFirst(element);
    }

    public int top(){
        return list.first();
    }

    public void pop(){
        list.removeFirst();
    }

    public void showStack(){
        list.showList();
    }

}
