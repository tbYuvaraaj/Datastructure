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
            System.exit(1);
        }
        for(pointer = head; pointer.getNextNode()!=null; pointer= pointer.getNextNode()) {
            System.out.print(pointer.getData()+",");
        }
        System.out.print(pointer.getData());System.out.println();
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

    // Delete operations
    // Delete the first node
    public void deleteFirstNode() {
        ListNode pointer;
        if(length == 0) {
            System.out.println("List is empty... Nothing to delete..");
        } else {
            pointer = head;
            head = pointer.getNextNode();
            pointer.setNextNode(null);
            length--;
        }
    }

    // Delete last node
    public void deleteLastNode() {
        ListNode pt1,pt2;
        if(length == 0) {
            System.out.println("List is empty... Nothing to delete");
        } else {
            pt1 = head;pt2 = head.getNextNode();
            if(pt2 == null) {
                head = null;
                length--;
            } else {

            while(pt2.getNextNode() !=null) {
                pt1 = pt1.getNextNode();
                pt2 = pt2.getNextNode();
            }
            pt1.setNextNode(null);
            length--;
            }
        }
    }

    // Delete intermediate node
    // Node to be deleted is in between two nodes
    public void deleteIntermediateNode(ListNode node) {
        ListNode temp1,temp2;
        if(length == 0) {
            System.out.println("List is empty..");
        } else {
            temp1 = head;temp2 = head.getNextNode();

            while(null!= temp2) {
                if(temp2.getData() == node.getData()) {
                    temp1.setNextNode(temp2.getNextNode());
                    length--;
                    break;
                }
                temp1 = temp1.getNextNode();
                temp2 = temp2.getNextNode();
            }
        }

    }

}
