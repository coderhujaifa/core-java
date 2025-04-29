package JavaCollectionFramework;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Book 1");
        stack.push("Book 2");
        stack.push("Book 3");

        System.out.println("Stack: " + stack);
        
        System.out.println(stack.peek()); //Returns top items

//        stack.pop(); // removes top element
//        System.out.println(stack);
    }
}