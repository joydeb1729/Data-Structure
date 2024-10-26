package infixToPostfix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ArrayStack stack = new ArrayStack();  // Create a new linked list-based stack
        String postFixExpression = null;

        Scanner sc = new Scanner(System.in);
        String infixExpression = sc.nextLine();

        int length = infixExpression.length();
        boolean isCorrect = true;

        for(int i=0; i<length; i++){

            char currentChar = infixExpression.charAt(i);

            if( currentChar == '(' || currentChar == '{' || currentChar == '['){
                stack.push(currentChar);
            }
            else if(currentChar == ')' || currentChar == '}' || currentChar == ']'){
                if(stack.isEmpty()){
                    isCorrect = false;
                    break;
                }

                while(true){
                    char topChar = stack.top();
                    stack.pop();
                    if(topChar == '(' && currentChar == ')' ||
                        topChar == '{' && currentChar == '}' ||
                        topChar == '[' && currentChar == ']' ){
                        break;
                    }
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