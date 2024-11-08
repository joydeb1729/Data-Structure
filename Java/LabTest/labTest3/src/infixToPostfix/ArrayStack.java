package infixToPostfix;

public class ArrayStack {
    public static final int CAPACITY = 100;
    private char[] data;
    private int t = -1;

    public ArrayStack(){
        this(CAPACITY);
    }

    public ArrayStack(int capacity){
        data = new char[capacity];
    }

    public int size(){
        return t+1;
    }

    public boolean isEmpty(){
        return (t==-1);
    }

    public void push (char element) throws IllegalStateException{
        if(this.size() == data.length){
            throw new IllegalStateException("Stack is full!");
        }
        else{
            data[++t] = element;
        }
    }

    public char top() throws IllegalStateException{
        if(this.isEmpty()){
            throw new IllegalStateException("Stack is Empty!");
        }
        else{
            return data[t];
        }
    }

    public void pop() throws IllegalStateException{
        char removedChar = ' ';
        if(this.isEmpty()){
            throw new IllegalStateException("Stack is Empty!");
        }
        else{
            data[t] = ' ';
            t--;
        }
    }

    public void showStack() throws IllegalStateException{
        if(this.isEmpty()){
            throw new IllegalStateException("Stack is Empty!");
        }
        else{
            for(int i=0; i<=t; i++){
                System.out.print(this.data[i] + " ");
            }
            System.out.println();
        }
    }
}
