package Section_two_Basic_DSA.LinkedList;

import Section_two_Basic_DSA.LinkedList.*;

public class Deletion {

    static Node deleteFirst(Node head) {
        Node temp = head;
        temp = head.next;
        head.next = null;
        return temp;
    }

    static void deleteLast(Node head) {
        Node prev = head;

        while (head.next != null) {
            prev = head;
            head = head.next;
        }
        prev.next = null;
    }

    static void deleteGivenPos(Node head, int pos) {
        Node temp = head;
        Node prev = head;
        int count = 0;
        while (count != pos - 1) {
            prev = temp;
            temp = temp.next;
            count++;
        }
        prev.next = temp.next;
        temp.next = null;
        // free temp
    }

    public static void main(String[] args) {
        Node head = CreationAndTraverse.createNodes();
        // Node newHead = deleteFirst(head);
        // deleteLast(head);
        deleteGivenPos(head, 3);
        CreationAndTraverse.printList(head);
    }
}