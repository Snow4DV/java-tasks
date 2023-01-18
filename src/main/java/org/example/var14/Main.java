package org.example.var14;


import java.util.Objects;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();


        System.out.println(equals(stack1, stack2));
    }

    private static boolean equals(Stack<Integer> stack1, Stack<Integer> stack2) {
        Stack<Integer> temp = new Stack<>();
        boolean result = true;
        while(true) {

            if(stack1.isEmpty() && !stack2.isEmpty() || !stack1.isEmpty() && stack2.isEmpty()) { // sizes are not the same
                result = false;
                break;
            } else if(stack1.isEmpty()) {
                result = true;
                break;
            } else {
                Integer value1 = stack1.pop();
                Integer value2 = stack2.pop();
                if(Objects.equals(value1, value2)) {
                    temp.push(value1);
                } else {
                    stack1.add(value1);
                    stack1.add(value2);
                    result = false;
                }
            }
        }

        while(!temp.isEmpty()) {
            stack1.push(temp.peek());
            stack2.push(temp.pop());
        }

        return result;
    }
}
