package Section_two_Basic_DSA.DoublyLinkedList;

import java.util.Scanner;

public class CreateAndTraverse {

    static NodeDouble createList(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of list.");
        int size = in.nextInt();

        NodeDouble head = null;
        NodeDouble currentNode = null;
        NodeDouble prevNode = null;

        for(int i=0;i<size;i++){
            System.out.println("Enter the value");
            int data = in.nextInt();
            NodeDouble newNode = new NodeDouble(data);
            if(head ==null){
                head = newNode;
                currentNode = newNode;
            }else{  
               currentNode.next = newNode;
               newNode.prev = currentNode;
               prevNode = currentNode;
               currentNode = currentNode.next;
            }
        }

        return head;
    }

    static void traverse(NodeDouble head){
        NodeDouble temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        NodeDouble head = createList();
        traverse(head);
    }
}

class NodeDouble {
    int data;
    NodeDouble next;
    NodeDouble prev;

    NodeDouble(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}