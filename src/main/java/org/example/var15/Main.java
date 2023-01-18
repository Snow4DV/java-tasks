package ru.snowadv.var15;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] nums = {-1,2,-3,-2,4,5,-9,-9,2,3,4,5};
        for (Integer num :
                nums) {
            stack.push(num);
        }


        System.out.println(stack);
        splitStackQueue(stack);

        System.out.println(stack);

    }

    private static void splitStackQueue(Stack<Integer> stack) {
        Queue<Integer> queue = new ArrayDeque<>();
        int negativeNumsCount = 0;
        while (!stack.isEmpty()) {
            int num = stack.pop();
            if(num < 0) negativeNumsCount++;
            queue.add(num);
        }

        while (negativeNumsCount > 0) {
            int num = queue.poll();
            if(num < 0) {
                stack.push(num);
                negativeNumsCount--;
            } else {
                queue.add(num);
            }
        }

        while(!queue.isEmpty()) {
            stack.push(queue.poll());
        }

    }
    private static void spltiStackPriorityQueue(Stack<Integer> stack) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        while(!queue.isEmpty()) {
            stack.push(queue.poll());
        }
    }


    private static void splitStack(Stack<Integer> stack) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        while(!stack.isEmpty()) {
            int newElement = stack.pop();
            if(newElement >= 0) {
                queue.addLast(newElement);
            } else {
                queue.addFirst(newElement);
            }
        }

        while(!queue.isEmpty()) {
            stack.push(queue.pop());
        }
    }
}

