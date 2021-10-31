package org.learn.doublylinkedlist;

public class DoublyLinkedListImpl {
    int length;
    DLLNode head = null;

    // Insert node at the beginning
    public void insertAtBeginning(int data) {
        DLLNode node = new DLLNode(data,null, null );
        if(head == null) {
            head = node;
        } else {
            node.setNext(head);
            head.setPrevious(node);
            head = node;
        }
        length++;
    }

    // Display DLL
    public void display() {
        DLLNode temp;
        if(length == 0) {
            System.out.println("List is empty...");
            return;
        }
        temp = head;
        while(temp!=null) {
            System.out.print(temp.getData()+"->");
            temp = temp.getNext();
        }
    }

    // insert node at end
    public void insertAtEnd(int data) {
        DLLNode temp;
        DLLNode node = new DLLNode(data,null,null);
        if(head == null) {
            head = node;
            return;
        }
        temp = head;
        while(temp.getNext()!=null) {
            temp = temp.getNext();
        }
        temp.setNext(node);
        length++;
    }

    // Insert node at provided position

}
