package LinkedList.QuesSinglyList;

public class ReverseNNode {
}

/**
 Definition for singly-linked list. */
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if(k==0) return head;
        if(k==1){
            ListNode temp = head;
            ListNode curr = null;
            while(temp != null){
                temp.next = curr;
                curr = temp;
            }
            return curr;
        }

        ListNode temp = head;
        ListNode node = new ListNode(-1);
        ListNode curr = null;
        ListNode currHead = node;
        ListNode oldHead = head;
        ListNode travTrack = temp;
        ListNode forward = null;
        ListNode cH = null;

        int p=0;
        while(temp != null){
            travTrack = temp;
            for(int i=0; i<k; i++){
                forward = temp.next;
                temp.next = curr;
                curr = temp;
                cH = curr;
                temp = forward;
                travTrack.next = temp;
                travTrack = temp;

                if(temp == null && i<k){
                    p=1;
                    break;
                }
            }
            curr=  null;
            if(p==1) {
                currHead.next = temp;
//                System.out.println(travTrack.next);
                return node.next;
            }
            currHead.next = cH;
            oldHead = travTrack;
            currHead = oldHead;


        }
        return node.next;
    }
    static void printList(ListNode node){
        if(node == null) {
            System.out.println();
            return;
        }
        System.out.print(node.val + " ");
        printList(node.next);
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        printList(node1);
        ListNode node= reverseKGroup(node1,3);
        printList(node);
    }
}