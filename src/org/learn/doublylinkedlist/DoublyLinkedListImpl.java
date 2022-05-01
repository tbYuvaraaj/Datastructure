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
        node.setPrevious(temp);
        length++;
    }

    // Insert node at provided position
    public void insertAtPos(int data, int pos) {
        DLLNode node = new DLLNode(data,null,null);
        DLLNode temp;

        if(head == null) {
            head = node;
        } else if(pos ==1) {
            insertAtBeginning(data);
        }else {
            temp = head;
            for(int i=1;i<pos;i++) {
                temp = temp.getNext();
            }
            temp.getPrevious().setNext(node);
            node.setPrevious(temp.getPrevious());
            node.setNext(temp);
            temp.setPrevious(node);
        }
        length++;
    }

    //Delete first node from the list
    public void deleteFirstNode() {
        if(length ==0) {
            System.out.print("List is empty..");
            return;
        }

        head = head.getNext();
        head.setPrevious(null);
        length--;
    }

}
