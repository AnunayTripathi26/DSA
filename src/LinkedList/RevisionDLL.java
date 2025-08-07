package LinkedList;
public class RevisionDLL{
    public static void main(String[] args) {
       DoublyLinkedListFromScratchRevision list=new DoublyLinkedListFromScratchRevision();
       list.insertFirst(1);
        list.insertFirst(11);
        list.insertFirst(21);
        list.insertFirst(51);
        list.insertFirst(101);
        list.display();
        list.insertLast(501);
        list.display();
        list.insertBetween(1001,2);
        list.display();
//        list.deleteFirst();
//        list.display();
        //list.deleteLast();
        list.deleteBetween(6);
        list.display();
        //list.displayReverse();
    }
}
class DoublyLinkedListFromScratchRevision {
    Node head;
    Node tail;
    int size;
    public DoublyLinkedListFromScratchRevision(){
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
    public void insertBetween(int value,int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size-1){
            insertLast(value);
            return;
        }
        Node node=new Node(value);
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next.prev=node;
        temp.next=node;
        node.prev=temp;
        size++;

    }
    public void insertLast(int value){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node node=new Node(value);
        temp.next=node;
        node.prev=temp;
        node.next=null;
        tail=node;
        size++;
    }
    public void deleteFirst(){
        head=head.next;
        if(head!=null){
            head.prev=null;
        }
        size--;
    }
    public void deleteBetween(int index){
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size-1){
            deleteLast();
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
        size--;

    }
    public void deleteLast(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void displayReverse(){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.value+" <- ");
            temp=temp.prev;
        }
        System.out.println("START");
    }
    class Node{
        Node next;
        Node prev;
        int value;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next,Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }

    }
}
