package LinkedList;
// -----------------------------
// Singly Linked List from Scratch
// Supports: insertFirst, insertLast, deleteFirst, deleteLast, get, display
// -----------------------------

public class SinglyLinkedListFromScratch {
    Node head;
    Node tail;
    int size;
    public SinglyLinkedListFromScratch(){
        this.size=0;
    }
    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        size++;
        if(size==1){
            tail=head;
        }
    }
    public void insertLast(int value){
        Node node=new Node(value);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        tail=node;

    }
    public void deleteFirst(){
        if(size==0){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        if(size==1){
            tail=null;
        }
        size--;

    }
    public void deleteLast(){
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
    }
    public void deleteParticular(int index){
        if(index==0){
            deleteFirst();
            return;
        }
        else if(index==size-1){
            deleteLast();
            return;
        }
        else{
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }
    public int get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.value;
    }
    public int Find(int value){
        int index=0;
        Node temp=head;
        while(temp!=null){
            if(temp.value==value){
                return index;
            }
            temp=temp.next;
            index++;
        }
        return -1;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(" "+temp.value+" ->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.next=next;
            this.value=value;
        }
    }
}
