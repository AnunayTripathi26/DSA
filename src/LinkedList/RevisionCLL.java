package LinkedList;

public class RevisionCLL {
    public static void main(String[] args) {
        CirclularLinkedListRevisionFromScratch list=new CirclularLinkedListRevisionFromScratch();
        list.insertFirstLast(5);
        list.insertFirstLast(4);
        list.insertFirstLast(3);
        list.insertFirstLast(2);
        list.insertFirstLast(1);
        list.display();
        list.delete(1);
        list.display();


    }
}
class CirclularLinkedListRevisionFromScratch {
    Node head;
    Node tail;
    public CirclularLinkedListRevisionFromScratch(){
        this.head=null;
        this.tail=null;
    }
    public void insertFirstLast(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
            head.next=tail;
            tail.next=head;
        }
        tail.next=node;
        tail=node;
        tail.next=head;
    }
    public void delete(int value){
//        if(head.value==value){
//            tail.next=head.next;
//            head=head.next;
//        }
        Node temp=head;
        if(temp.value==value){
            head=head.next;
            tail.next=head;
            return;
        }

        while(temp.next.value!=value){
            temp=temp.next;
        }
        temp.next=temp.next.next;

    }
    public void display(){
        Node temp=head;
        do{
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }while(temp!=head);
        System.out.println();

    }



    class Node {
        Node next;
        int value;

        public Node(int value) {
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}