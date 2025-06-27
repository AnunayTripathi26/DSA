package LinkedList;

public class ll2 {
    Node head;

    public class Node{
       String data;
       Node next;

       Node(String data){
           this.data=data;
           this.next=null;
       }

    }
    public void addLast(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node currnode=head;
        while(currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=newnode;



    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currnode=head;
        while(currnode.next!=null){
            System.out.print(currnode+"->");
            currnode=currnode.next;
        }
        System.out.println("null");

    }
    public void addFirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
        }
        Node secondlast=head;
        Node lastnode=head.next;
        while(lastnode.next!=null){
            lastnode=lastnode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }
    public static void main(String args[]){
        ll2 list=new ll2();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("Linked");
        list.addLast("list");
        list.printList();
    }
}
