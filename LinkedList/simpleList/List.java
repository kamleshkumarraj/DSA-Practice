package LinkedList.simpleList;

public class List {
    Node head;
    Node tail;
    int size = 0;

    public void printList(){
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void insertNode(int data){
        Node temp = new Node(data);
        if(head == null) head = temp;
        else tail.next = temp;
        tail = temp;
        this.size++;
    }

    public void insertAtBeginning(int data){
        Node temp = new Node(data);
        if(head == null) head = temp;
        else temp.next = head;
        head = temp;
        this.size++;
    }

    
    public static void main(String[] args) {
        // Node a = new Node(10);
        // Node b = new Node(20);
        // Node c = new Node(30);
        // Node d = new Node(40);
        // Node e = new Node(50);

        // a.next = b;
        // b.next = c;
        // c.next = d;
        // d.next = e;
        // printList(a);

        List list = new List();
        list.insertNode(20);
        list.insertNode(30);
        list.insertNode(40);
        list.insertNode(50);
        list.insertNode(60);

        list.insertAtBeginning(10);
        list.insertAtBeginning(0);

        list.printList();
    }
}
