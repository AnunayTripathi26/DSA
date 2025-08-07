package LinkedList;

public class LC21 {
    public static void main(String[] args) {
        Problem21 list1 =new Problem21();

        list1.insertUsingRec(1,0);
        list1.insertUsingRec(2,1);
        list1.insertUsingRec(4,2);

        Problem21 list2 =new Problem21();

        list2.insertUsingRec(1,0);
        list2.insertUsingRec(3,1);
        list2.insertUsingRec(4,2);

        Problem21 list3=new Problem21();
        list3.head=list3.mergeTwoLists(list1,list2);
        list3.display();
//        list1.display();
//        list2.display();
        Problem21 list4=new Problem21();
        list4.head=list4.mergeTwoLists2(list1.head,list2.head);
        list4.display();
    }

}
class Problem21{
    ListNode head;


    public void insertUsingRec(int value,int index){
//        ListNode temp=head;
        head=insertUsingRec(index,value,head);
    }
    public ListNode insertUsingRec(int index,int value,ListNode temp){
        if(index==0){
            ListNode node=new ListNode(value,temp);
            return node;
        }
        temp.next=insertUsingRec(index-1,value,temp.next);
        return temp;
    }
    public void insertLast(int val){
        ListNode node=new ListNode(val);
        if(head==null){
            head=node;
            head.next=null;
            return;
        }

        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;


    }
    public void display(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }

    public ListNode mergeTwoLists(Problem21 list1,Problem21 list2){
        ListNode head1=list1.head;
        ListNode head2=list2.head;
        Problem21 list3 =new Problem21();
        while(head1!=null&& head2!=null){
            if(head1.val<=head2.val){
                list3.insertLast(head1.val);
                head1=head1.next;

            }
            else{
                list3.insertLast(head2.val);
                head2=head2.next;
            }
        }
            while(head1!=null){
                list3.insertLast(head1.val);
                head1=head1.next;

            }


            while(head2!=null){
                list3.insertLast(head2.val);
                head2=head2.next;
            }

        return list3.head;
    }
    /////////////////////////////////////Another way///////////////////////////////////////////////////////////
    public ListNode mergeTwoLists2(ListNode head1, ListNode head2) {
        ListNode head3=new ListNode(-1);
        ListNode temp=head3;

        while(head1!=null&& head2!=null){
            if(head1.val<=head2.val){
                temp.next=head1;
                head1=head1.next;

            }
            else{
                temp.next=head2;
                head2=head2.next;
            }
            temp=temp.next;
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;

        }


        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }

        return head3.next;
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

        public ListNode() {

        }
    }
}
