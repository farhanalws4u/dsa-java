package LinkedList;

import LinkedList.*;

public class Insertion {

    static void inserAtGivenPos(Node head, Node newNode, int pos) {
        int count = 1;
        Node prevNode = head;
        Node temp = head;
        while (count != pos) {
            prevNode = temp;
            temp = temp.next;
            count++;
        }
        prevNode.next = newNode;
        newNode.next = temp;
    }

    static Node insertAtBeg(Node head, Node newNode) {
        Node temp = head;
        newNode.next = temp;
        head = newNode;
        return head;
    }

    static void insertAtEnd(Node head, Node newNode) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    public static void main(String[] args) {
        Node head = CreationAndTraverse.createNodes();
        Node newNode = new Node(9);
        // inserAtGivenPos(head,newNode,3);
        // Node newHead = insertAtBeg(head, newNode);
        insertAtEnd(head, newNode);
        CreationAndTraverse.printList(head);
    }

}
