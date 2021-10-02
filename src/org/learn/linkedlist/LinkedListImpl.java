package org.learn.linkedlist;

public class LinkedListImpl {

    ListNode head = null;
    int length;

    // Insert a node at end of list
    public void insertAtEnd(ListNode node) {
        ListNode pointer;
        if(head == null) {
            head = node;
        } else {
            pointer = head;
            while(pointer.getNextNode()!= null) {
                pointer = pointer.getNextNode();
            }
            pointer.setNextNode(node);
        }
        length++;
    }

    // Print the list
    public void display() {
        ListNode pointer;
        if(head == null) {
            System.out.println("List is empty!");
        }
        for(pointer = head; pointer.getNextNode()!=null; pointer= pointer.getNextNode()) {
            System.out.print(pointer.getData()+",");
        }
        System.out.print(pointer.getData());
    }

    // Insert at beginning
    public void insertAtBegin(ListNode node) {
        if(head == null) {
            head = node;
        } else {
            node.setNextNode(head);
            head = node;
        }
        length++;
    }

    // Insert node at provided position
    public void insertAtPos(ListNode node, int pos) {
        ListNode temp = head;
        if(pos > length) {
            pos = length+1;
        }

        if(pos == 1) {
            node.setNextNode(head);
            head = node;
        } else {
            for(int i=1; i<pos-1;i++) {
                temp = temp.getNextNode();
            }

            node.setNextNode(temp.getNextNode());
            temp.setNextNode(node);
        }
        length++;
    }
}
