package org.example.var9;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        int[] nums = {14,8,14,12,1,14,11,8,8,10,4,9,1,2,5,2,4,12,12};
        LinkedIntList list = new LinkedIntList(new LinkedIntList.ListNode(nums[0]));

        for (int i = 1; i < nums.length; i++) {
            list.add(new LinkedIntList.ListNode(nums[i]));
        }

        printList(list);


        list.removeDuplicates();
        printList(list);
    }

    private static void printList(LinkedIntList list) {
        System.out.print('[');
        list.forEach(listNode -> {
            System.out.print(listNode.data + ",");
        });
        System.out.println(']');
    }


}
