package arrayBasedStack;

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);  // Create a stack with a capacity of 5

        // Push elements to the stack
        System.out.println("Pushing elements: 10, 20, 30");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.showStack();  // Display the stack

        // Pop an element
        System.out.println("Popping an element.");
        stack.pop();
        stack.showStack();  // Display the stack after pop

        // Push more elements
        System.out.println("Pushing elements: 40, 50");
        stack.push(40);
        stack.push(50);
        stack.showStack();  // Display the stack after pushing more elements

        // Pop all elements
        System.out.println("Popping all elements:");
        while (!stack.isEmpty()) {
            System.out.println("Top element: " + stack.top());
            stack.pop();
            stack.showStack();
        }

        // Try to pop from an empty stack
        try {
            stack.pop();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
