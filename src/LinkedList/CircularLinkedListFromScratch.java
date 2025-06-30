package LinkedList;
// -----------------------------
// Circular Linked List from Scratch
// Supports: insert, delete, display (loops back to head)
// -----------------------------

public class CircularLinkedListFromScratch {
    Node head;
    Node tail;

    public CircularLinkedListFromScratch(){
        this.head=null;
        this.tail=null;
    }
    public void insert(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
            tail.next=head;
            return;
        }
        else{
            tail.next=node;
            node.next=head;
            tail=node;
        }
    }
    public void display(){
        Node temp=head;
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            do{
                System.out.print(temp.value+" ->");
                temp=temp.next;
            }while(temp!=head);
            System.out.println("Head");
        }
    }

    public void delete(int value){
        Node temp=head;
        if(head==null){
            return;
        }
        else if(temp.value==value){
            tail.next=temp.next;
            head=temp.next;
            return;
        }
        else{
            do{

                if(temp.next.value==value){
                    if(temp.next==tail){
                        tail=temp;
                    }
                    temp.next=temp.next.next;
                    break;
                }
                temp=temp.next;
            }
            while(temp!=head);
        }

    }
    class Node{
        Node next;
        int value;

        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.next=next;
        }
    }
}
