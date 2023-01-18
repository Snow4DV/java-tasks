package org.example.var7;


public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,7};
        int[] nums2 = {1,2,3,4,5};
        LinkedIntList list1 = new LinkedIntList(new LinkedIntList.ListNode(nums1[0]));

        for (int i = 1; i < nums1.length; i++) {
            list1.add(new LinkedIntList.ListNode(nums1[i]));
        }

        LinkedIntList list2 = new LinkedIntList(new LinkedIntList.ListNode(nums1[0]));

        for (int i = 1; i < nums2.length; i++) {
            list2.add(new LinkedIntList.ListNode(nums2[i]));
        }

        printList(list1);

        printList(list2);

        list1.removeAll(list2);
        printList(list1);
    }

    private static void printList(LinkedIntList list) {
        System.out.print('[');
        list.forEach(listNode -> {
            System.out.print(listNode.data + ",");
        });
        System.out.println(']');
    }


}
