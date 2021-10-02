package org.learn.linkedlist;

public class LinkedListApplication {
    public static void main(String[] args) {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.insertAtEnd(new ListNode(10, null));
        linkedList.insertAtEnd(new ListNode(20, null));
        linkedList.insertAtBegin(new ListNode(40, null));
        linkedList.insertAtPos(new ListNode(100, null), 1);
        linkedList.display();

    }
}
