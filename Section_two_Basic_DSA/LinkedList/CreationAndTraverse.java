package LinkedList;

import java.util.Scanner;

public class CreationAndTraverse {

    static Node createNodes() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the List");
        int n = in.nextInt();
        Node head = null;
        Node temp = null;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter data value of Node" + " " + i + 1);
            int data = in.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                temp = head;
            } else {
                temp.next = newNode;
                temp = temp.next;
            }
        }
        return head;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.println("value of Node is" + " " + head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = createNodes();
        printList(head);
    }
}

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}