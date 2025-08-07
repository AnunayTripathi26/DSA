package LinkedList;

import java.util.LinkedList;

public class LC141 {
    public static void main(String[] args) {
        LL141 list=new LL141();
        list.addLast(3);
        list.addLast(2);
        list.addLast(0);
        list.addLast(-4);
        list.display();
        System.out.println(list.LengthOfCycle(list.head));



    }

}
class LL141{
    ListNode head;
    ListNode tail;
    public LL141(){
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
    public int LengthOfCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        int count=0;
        while(fast.next!=null&&fast!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){

                do{
                    count++;
                    slow=slow.next;
                }while(slow!=fast);
                return count;
            }
        }
        return count;

    }
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
