package Section_two_Basic_DSA.LinkedList;
import  Section_two_Basic_DSA.LinkedList.*;

public class Reverse {

    static Node reverse(Node head){
        Node prev=null ;
        Node curr = head;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // at last 
        head = prev;

        return head;
    }

    public static void main(String[] args) {
        Node head = CreationAndTraverse.createNodes();
        Node newHead = reverse(head);
        CreationAndTraverse.printList(newHead);
    }
}
