package LinkedList.QuesSinglyList;

import LinkedList.simpleList.List;
import LinkedList.simpleList.Node;

public class palindromeList {
    static Node head = null;
    static boolean checkPalindrome(Node temp){
        if(temp == null) return true;
        System.out.println(temp.data+" ");
        boolean isPali = checkPalindrome(temp.next);
//        System.out.println(head.data);
        if( !isPali || temp.data != head.data) return false;
        head = head.next;
        return true;

    }
    public static void main(String[] args) {
        List l1 = new List();
        l1.insertNode(1);
        l1.insertNode(2);
        boolean res = checkPalindrome(l1.getHead());
        System.out.println(res);
    }
}
