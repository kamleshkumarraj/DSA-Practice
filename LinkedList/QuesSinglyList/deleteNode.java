package LinkedList.QuesSinglyList;

import LinkedList.simpleList.List;
import LinkedList.simpleList.Node;

public class deleteNode {
    static void deleteGivenNode(Node node){
        int val = node.next.data;
        node.next = node.next.next;
        node.data = val;
    }
    public static void main(String[] args) {
        List l1 = new List();
        l1.insertNode(10);
        l1.insertNode(20);
        l1.insertNode(30);

        l1.printList();
        deleteGivenNode(l1.getNodeForVal(10));
        l1.printList();

    }
}
