package org.learn.doublylinkedlist;

public class DLLApplication {
    public static void main(String[] args) {
        DoublyLinkedListImpl doublyLinkedList = new DoublyLinkedListImpl();
        doublyLinkedList.insertAtBeginning(10);
        doublyLinkedList.insertAtBeginning(20);
        doublyLinkedList.insertAtBeginning(30);
        doublyLinkedList.insertAtBeginning(40);
        doublyLinkedList.insertAtEnd(100);
        doublyLinkedList.insertAtBeginning(50);
        doublyLinkedList.display();System.out.println();
        doublyLinkedList.insertAtPos(555,6);
        doublyLinkedList.display();System.out.println();
        doublyLinkedList.insertAtPos(111,4);
        doublyLinkedList.display();System.out.println();
        doublyLinkedList.deleteFirstNode();
        doublyLinkedList.display();System.out.println();
        doublyLinkedList.deleteFirstNode();
        doublyLinkedList.display();System.out.println();
    }
}
