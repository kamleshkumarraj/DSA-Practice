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

    public void insertAtIndex(int data, int idx){
        if(idx==0) {
            this.insertAtBeginning(data);
            return;
        };
        if(idx== this.count()) {
            this.insertNode(data);
            return;
        };
        Node temp = new Node(data);
        Node temp1 = head;
        for(int i=1; i<idx; i++){
            temp1 = temp1.next;
        }
        temp.next = temp1.next;
        temp1.next = temp;
    }

    public int count(){
        return size;
    }
    
    public static void main(String[] args) {


        List list = new List();
        list.insertNode(20);
        list.insertNode(30);
        list.insertNode(40);
        list.insertNode(50);
        list.insertNode(60);

        list.insertAtBeginning(10);
        list.insertAtBeginning(0);

        list.printList();

        list.insertAtIndex(80,7);
        list.printList();

//        list.insertAtIndex(70,4);
//        list.printList();
//
//        list.insertAtIndex(80,7);
//        list.printList();

//        list.insertAtIndex(90,7);
//        list.printList();
    }
}
