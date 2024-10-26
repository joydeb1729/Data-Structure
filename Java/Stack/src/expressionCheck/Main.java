package expressionCheck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ArrayStack stack = new ArrayStack();  // Create a new linked list-based stack

        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();

        int length = expression.length();
        boolean isCorrect = true;

        for(int i=0; i<length; i++){
            char currentChar = expression.charAt(i);
            if( currentChar == '(' || currentChar == '{' || currentChar == '['){
                stack.push(currentChar);
            }
            else if(currentChar == ')' || currentChar == '}' || currentChar == ']'){
                if(stack.isEmpty()){
                    isCorrect = false;
                    break;
                }
                char topChar = stack.top();

                if( topChar == '(' && currentChar == ')' ||
                    topChar == '{' && currentChar == '}' ||
                    topChar == '[' && currentChar == ']' ){
                    stack.pop();
                }

            }
        }
        if(isCorrect){
            System.out.println("Expression is Correct!");
        }
        else {
            System.out.println("Expression is Wrong!");
        }

    }
}

//[A+(B*C)+{(A-C)+D}]