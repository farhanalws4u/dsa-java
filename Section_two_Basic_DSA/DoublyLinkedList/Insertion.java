package Section_two_Basic_DSA.DoublyLinkedList;
import Section_two_Basic_DSA.DoublyLinkedList.*;

public class Insertion {

    static NodeDouble insetAtBeg(NodeDouble head,int val){
        if(head == null) return null;
        NodeDouble temp = head;
        NodeDouble newNode = new NodeDouble(val);

        newNode.next = temp;
        temp.prev = newNode;
        return newNode; // as new head
    }

    static void insertAtEnd(NodeDouble head, int val){
        NodeDouble newNode = new NodeDouble(val);
        NodeDouble temp = head;
        while(temp.next != null){
            temp =  temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    static void insertAtGivenPos(NodeDouble head, int val, int pos){
        int count = 0;
        NodeDouble temp = head;
        NodeDouble newNode = new NodeDouble(val);
        while(count != pos){
            temp = temp.next;
            count++;
        }
        temp.prev.next = newNode;
        newNode.prev = temp.prev;
        newNode.next = temp;
        temp.prev = newNode;
    }

    static void reverse(NodeDouble head){
        NodeDouble current = head;
        NodeDouble temp = null;
        
        while(current != null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
           if (temp != null) {
            head = temp.prev;
        }
    }

    public static void main(String[] args) {
        NodeDouble head = CreateAndTraverse.createList();
        // NodeDouble newHead = insetAtBeg(head, 9);
        // insertAtEnd(head, 9);
        // insertAtGivenPos(head, 20, 3);
        reverse(head);
        CreateAndTraverse.traverse(head);
    }
}
