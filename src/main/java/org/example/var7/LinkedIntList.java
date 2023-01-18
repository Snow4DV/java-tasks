package org.example.var7;

import java.util.List;
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

    public void remove(ListNode node) {
        if(node == front) {
            front = front.getNext();
        } else {
            ListNode previousNode = front;
            while(previousNode.getNext() != null) {
                if(previousNode.getNext() == node) {
                    previousNode.setNext(node.getNext());
                    return;
                }
            }
        }
    }


    public void removeAll(LinkedIntList list2) {
        ListNode currentNodeList1 = this.front;
        ListNode currentNodeList2 = list2.front;

        do { // Looping through all list1 [this] elements

            do { // Looping through all list2 elements

                if(currentNodeList2 == null) {
                    return;
                }

                if(currentNodeList1.getData() == currentNodeList2.getData()) {
                    this.remove(currentNodeList1);
                }

                currentNodeList2 = currentNodeList2.getNext();
            } while(currentNodeList2 != null && currentNodeList2.getData() <= currentNodeList1.getData());

            currentNodeList1 = currentNodeList1.getNext();
        } while(currentNodeList1 != null);
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




    public static class ListNode {
        public int data;

        public ListNode(int data) {
            this.data = data;
        }

        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }

        public ListNode next = null;

        public int getData() {
            return data;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        public ListNode getNext() {
            return next;
        }
    }
}
