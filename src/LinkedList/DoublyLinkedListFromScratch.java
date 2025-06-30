package LinkedList;
// -----------------------------
// Doubly Linked List from Scratch
// Supports: insertFirst, insertLast, insertAfterIndex, deleteFirst, deleteLast, deleteByIndex, display forward & backward
// -----------------------------

public class DoublyLinkedListFromScratch {
    Node head;
    int size;
    public DoublyLinkedListFromScratch(){
        this.size=0;
    }

    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
        size++;
    }
    public void display(){
        Node temp=head;
        Node lastnode=null;
        while(temp!=null){
            System.out.print(temp.value+" ->");
            lastnode=temp;
            temp=temp.next;
        }
        System.out.println("END");

        System.out.print("This is your reversed Linked List : ");
        while(lastnode!=null){
            System.out.print(lastnode.value+" ->");
            lastnode=lastnode.prev;
        }
        System.out.println("START");
    }
    public void insertLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
            node.next=null;


        }
        size++;
    }
    public void insertAfteranIndex(int index,int value) {
        if(index<0||index>=size){
            System.out.println("Index outof bounds");
            return;
        }
        Node node = new Node(value);
        Node temp = head;
        for (int i = 0; i < index; i++) {
              temp=temp.next;
        }
        if(temp.next==null){
            insertLast(value);
            return;
        }
        temp.next.prev = node;
        node.next = temp.next;
        node.prev = temp;
        temp.next = node;
        size++;

    }
    class Node{
        int value;
        Node next;
        Node prev;
        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next, Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }

    }
}
