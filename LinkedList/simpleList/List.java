package LinkedList.simpleList;

public class List {
    Node head;
    Node tail;
    int size = 0;

    // method for print the list in console.
    public void printList(){
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // method for insert node at the end of the list.
    public void insertNode(int data){
        Node temp = new Node(data);
        if(head == null) head = temp;
        else tail.next = temp;
        tail = temp;
        this.size++;
    }

    // method for insert node at the starting of the list.
    public void insertAtBeginning(int data){
        Node temp = new Node(data);
        if(head == null) head = temp;
        else temp.next = head;
        head = temp;
        this.size++;
    }

    // method for insert value in list at any index.
    public void insertAtIndex(int data, int idx){
        if(idx > this.count()) {
            System.out.println("Please provide valid index !");
            return;
        }
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
        this.size ++ ;
    }

    // method for delete last element from list.
    public void pop(){
        if(this.count() == 0){
            System.out.println("List is already empty !");
            return;
        }

        if(this.count() == 1){
            head = null;
            tail = null;
            this.size -= this.size;
            return;

        }
        Node temp = head;
        while(temp.next.next !=null) temp = temp.next;

        temp.next = null;
        tail = temp;
        this.size -= this.size;
    }

    public int getIdx(int data){
        Node temp=head;
        int idx=0;
        while (temp!=null && temp.data != data) {
            temp = temp.next;
            idx++;
        }
        if(idx == this.count()) return -1;
        return idx;
    }

    public void shift(){
        if(this.count() == 0){
            System.out.println("List already empty !");
            return;
        }
        if(this.count() == 1){
            head = null;
            tail = null;
            size--;
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteAtIdx(int idx){
        if(idx < 0 || idx > this.count() -1){
            System.out.println("Please send valid index !");
            return;
        }
        if(idx == 0) {
            this.shift();
            return;
        }
        if(idx==this.count()-1){
            this.pop();
            return;
        }
        Node temp = head;
        for(int i=1; i<idx; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public void deleteNode(int data){
        int idx = this.getIdx(data);
        if(idx==-1){
            System.out.println("Node doesn't exist in list !");
            return;
        }
        this.deleteAtIdx(idx);
    }

    // recursive print the reverse list.
    public void printReverseList(Node temp){
        if(temp == null) return;
        printReverseList(temp.next);
        System.out.print(temp.data+" ");
    }

    // method for return the size of the list.
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

        list.printList();
//        list.deleteNode(60);
//        list.printList();
        list.printReverseList(list.head);
//
//        list.insertAtBeginning(10);
//        list.insertAtBeginning(0);
//        System.out.println(list.count());
//        list.printList();
//        System.out.println(list.getIdx(90));
//
//        list.shift();
//        System.out.println(list.count());
//        list.printList();
//
//        list.insertAtIndex(80,7);
//        list.printList();

//        list.pop();
//        list.printList();
//
//        list.pop();
//        list.printList();

//        list.insertAtIndex(70,4);
//        list.printList();
//
//        list.insertAtIndex(80,7);
//        list.printList();

//        list.insertAtIndex(90,7);
//        list.printList();
    }
}
