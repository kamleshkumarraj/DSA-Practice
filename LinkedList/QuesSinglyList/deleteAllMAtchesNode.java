package LinkedList.QuesSinglyList;

import LinkedList.simpleList.List;
import LinkedList.simpleList.Node;

public class deleteAllMAtchesNode {
    static int findIdx(Node temp, int val){
        int idx = 0;
        while(temp != null && temp.data != val) {
            temp = temp.next;
            idx++;
        };
        if(temp == null) return -1;
        return idx;

    }
    static Node performDeletion(Node head, int idx){
        Node temp = head;
        if(head.next == null){
            temp = null;
            return temp;
        }
        for(int i=1; i<idx; i++){
            head = head.next;
        }
        if(idx == 0) temp = head.next;
        head.next = head.next.next;

        return temp;
    }
    static Node deleteNode(Node head, int val){
//        System.out.println(findIdx(head,val));
        if(findIdx(head,val) == -1) return head;
        Node temp = performDeletion(head,findIdx(head, val));
        return deleteNode(temp, val);

    }

    static void printList(Node temp){
        if(temp == null) return;
        System.out.print(temp.data+" ");
        printList(temp.next);
    }
    static Node deleteEfficient(Node temp, int target){
        // this is my approach.
//        Node head = temp;
//        while(temp.next != null){
//            if(temp.data == target) {
//                head = head.next;
//                temp = temp.next;
//            }
//            else if(temp.next.data == target){
//                temp.next = temp.next.next;
//            }else{
//                temp = temp.next;
//            }
//        }
//        if(head.data == target) head = null;

        // in above scenario we check the target is head and not and we have to handle multiple case.
        // but for avoiding this case firstly we insert a dummy node at head this possibilites of target is head will be removed and then perform deletion and then we return head.next;

        Node dummy = new Node(Integer.MIN_VALUE);
        dummy.next = temp;
        Node head = dummy;
        while(head.next != null){
            if(head.next.data == target) head.next = head.next.next;
            else head = head.next;
        }
    return dummy.next;

    }
    public static void main(String[] args) {
        List l1= new List();
        l1.insertNode(10);
//        l1.insertNode(2);
        l1.insertNode(10);
        l1.insertNode(10);
        l1.insertNode(10);
//        l1.insertNode(50);
//        l1.insertNode(20);
//        l1.insertNode(70);
        l1.insertNode(1);
        l1.insertNode(10);
        l1.insertNode(20);
        l1.insertNode(30);
        l1.insertNode(40);
        l1.insertNode(50);
        l1.insertNode(10);
        l1.insertNode(10);
        l1.insertNode(20);
        l1.insertNode(10);
        Node head = l1.getHead();
        printList(head);
        System.out.println();

//        head = deleteNode(head, 1);
//        System.out.println(findIdx(l1.getHead(), 70));
        head = deleteEfficient(l1.getHead(),10);
        printList(head);

        // now we write code for delete all matches node in iteration.


    }
}

//class Solution {
//    // first we find the index for the given node.
//    static int findIdx(Node temp, int val){
//        int idx = 0;
//        while(temp !=null && temp.val != val) idx++;
//        if(temp == null) return -1
//        return idx;
//
//    }
//    static performDeletion(Node head, int idx){
//        for(int i=1; i<idx; i++){
//            head = head.next;
//        }
//        head.next = head.next.next;
//    }
//    static int deleteNode(Node head,val){
//        if(findIdx(head,val) == -1) return;
//        performDeletion(head,val);
//        deleteNode(head, findIdx(head,val));
//
//    }
//    public ListNode removeElements(ListNode head, int val) {
//        deleteNode(head,val)
//    }
//}
