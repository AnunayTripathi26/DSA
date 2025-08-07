package LinkedList;
class Working{
    public static void main(String[] args) {
        LLRevisionFromScratch list=new LLRevisionFromScratch();
        list.insertFirst(2);
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(8);
        list.insertFirst(10);
        list.insertLast(0);
        list.insert(7,3);
        list.display();
//        list.deleteLast();
//        list.display();
        list.insertUsingRecursion(3,5);
        list.display();
        System.out.println(list.hasCycle(list.head));

    }
}
  class LLRevisionFromScratch {
    Node head;
    Node tail;
    int size;
    public LLRevisionFromScratch(){
        this.size=0;
    }
    public  void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void insert(int value, int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node node=new Node(value);
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        size++;
    }
      public boolean hasCycle(Node head) {
          Node fast=head;
          Node slow=head;
          while(fast!=null&&fast.next!=null){
              fast=fast.next.next;
              slow=slow.next;
              if(fast==slow){
                  return true;
              }
          }
          return false;

      }
    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insertUsingRecursion(int index,int value){
                                                                         //1,2,3,5
        head=insertUsingRecursion(index,value,head);
    }
      public Node insertUsingRecursion(int index,int value,Node temp){
        if(index==0){
            Node temp2=new Node(value,temp);
            size++;
            return temp2;
        }
        temp.next=insertUsingRecursion(index-1,value,temp.next);
        return temp;

      }
    public void deleteFirst(){
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
      }
    public void delete(int index){
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
    static class Node{
        Node next;
        int value;

        public  Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
