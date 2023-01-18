package org.example.var9;

import java.util.function.Consumer;

public class LinkedIntList {

    private ListNode front;

    public LinkedIntList(ListNode front) {
        this.front = front;
    }


    public ListNode getLast() {
        ListNode last = front;
        while(last.getNext() != null) {
            last = last.getNext();
        }

        return last;
    }

    public void forEach(Consumer<ListNode> consumer) {
        ListNode node = front;
        consumer.accept(node);

        while(node.getNext() != null) {
            node = node.getNext();
            consumer.accept(node);
        }

    }

    public void add(ListNode node) {
        getLast().setNext(node);
    }


    public void removeDuplicates() {
        ListNode prevListNode = front;
        while(prevListNode.getNext() != null) {
            ListNode currentListNode = prevListNode.getNext();


            ListNode checkNode = front;
            while(checkNode != null && checkNode != currentListNode) {
                if(checkNode.getData() == currentListNode.getData()) {
                    prevListNode.setNext(currentListNode.getNext());
                    currentListNode = prevListNode; // to check another on next iter
                    break;
                }

                checkNode = checkNode.getNext();
            }



            prevListNode = currentListNode;
        }
    }


    public static class ListNode {
        public int data;
        public ListNode next = null;

        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }

        public ListNode(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }
}
