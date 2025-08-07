package LinkedList;

import java.util.List;

public class LC142 {
    public static void main(String[] args) {
        LL142 list=new LL142();
        list.addLast(3);
        list.addLast(2);
        list.addLast(0);
        list.addLast(-4);
        list.display();
        System.out.println(list.detectCycle(list.head));



    }


}
class LL142{
    ListNode head;
    ListNode tail;
    public LL142(){
        this.head=null;
        this.tail=null;
    }
    public void addLast(int val){
        ListNode node=new ListNode(val);
        if(head==null){
            head=node;
            tail=head;
        }
        node.next=head;
        tail.next=node;
        tail=node;
    }
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null&&fast!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;

    }
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        int count=0;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){

                do{
                    count++;
                    slow=slow.next;
                }while(slow!=fast);
                break;
            }
        }
        if(count!=0){
            ListNode first=head;
            ListNode second=head;
            while(count>0){
                second=second.next;
                count--;
            }
            while(first!=second){
                first=first.next;
                second=second.next;
            }
            return first;
        }
        ListNode Nocycle=new ListNode(-1);
        return Nocycle;

    }
//    public ListNode detectCycle(ListNode head) {
//        int length=LengthOfCycle()
//        while()
//
//    }
    public void display(){
        ListNode temp=head;
        do{
            System.out.print(temp.val+"->");
            temp=temp.next;
        }while(temp!=head);
        System.out.println();
    }
    class ListNode{
        ListNode next;
        int val;
        public ListNode(int val){
            this.val=val;
        }
        public ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }
    }
}
