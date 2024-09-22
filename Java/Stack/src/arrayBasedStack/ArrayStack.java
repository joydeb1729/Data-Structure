package arrayBasedStack;

public class ArrayStack {
    public static final int CAPACITY = 100;
    private int[] data;
    private int t = -1;

    public ArrayStack(){
        this(CAPACITY);
    }

    public ArrayStack(int capacity){
        data = new int[capacity];
    }

    public int size(){
        return t+1;
    }

    public boolean isEmpty(){
        return (t==-1);
    }

    public void push (int element) throws IllegalStateException{
        if(this.size() == data.length){
            throw new IllegalStateException("Stack is full!");
        }
        else{
            data[++t] = element;
        }
    }

    public int top() throws IllegalStateException{
        if(this.isEmpty()){
            throw new IllegalStateException("Stack is Empty!");
        }
        else{
            return data[t];
        }
    }

    public void pop() throws IllegalStateException{
        if(this.isEmpty()){
            throw new IllegalStateException("Stack is Empty!");
        }
        else{
            data[t] = 0;
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
