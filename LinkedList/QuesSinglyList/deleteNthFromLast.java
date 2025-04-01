package LinkedList.QuesSinglyList;

import LinkedList.simpleList.List;
import LinkedList.simpleList.Node;

public class deleteNthFromLast {
    static Node deleteNthFromLast(Node temp, int n){
        Node slow=temp;
        Node fast=temp;

        for(int i=1; i<=n; i++)  fast = fast.next;

        if(fast==null) {
            temp = slow.next;
            return temp;

        };

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        };

        slow.next = slow.next.next;
        return temp;

    }
    public static void main(String[] args) {
        List l1 = new List();
        l1.insertNode(10);
        l1.insertNode(20);
//        l1.insertNode(30);
//        l1.insertNode(40);
//        l1.insertNode(50);
//        l1.insertNode(60);

        Node head = l1.getHead();

        l1.printListNode(head);
        System.out.println();
        head = deleteNthFromLast(head,1);
        l1.printListNode(head);

    }
}
