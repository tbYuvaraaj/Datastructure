package org.learn.linkedlist;

public class LinkedListApplication {
    public static void main(String[] args) {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.insertAtBegin(new ListNode(10, null));
        linkedList.insertAtBegin(new ListNode(20, null));
        linkedList.insertAtBegin(new ListNode(30, null));
        linkedList.insertAtBegin(new ListNode(40, null));
        linkedList.display();
        linkedList.deleteIntermediateNode(new ListNode(30, null));
        linkedList.display();
        linkedList.deleteIntermediateNode(new ListNode(20, null));
        linkedList.display();


    }
}
