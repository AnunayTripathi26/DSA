package LinkedList;

public class linkedList {
    Node head;
   class Node {
       String data;
       Node next;

       Node(String data){
           this.data=data;
           this.next=null;
       }
   }
   public void addfirst(String data){
       Node newnode=new Node(data);
       if(head==null){
           head=newnode;
           return;
       }
       newnode.next=head;
       head=newnode;
   }
   public void addlast(String data){
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
       newnode.next=null;
   }
   public void printlist(){
       if(head==null){
           System.out.println("List is empty");
       }
       Node currnode=head;
       while(currnode.next!=null){
           System.out.println(currnode+"->");
           currnode=currnode.next;
       }
       System.out.println("Null");
   }
   public static void main(String args[]){
       linkedList list=new linkedList();
       list.addfirst("a");
       list.addfirst("is");
       list.addfirst("this");
       list.addlast("List");
       list.printlist();

   }
}
