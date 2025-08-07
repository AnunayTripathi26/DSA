package LinkedList;

public class LC148 {
    public static void main(String[] args) {
        LLRevisionFromScratch list=new LLRevisionFromScratch();
        list.insertLast(4);
        list.insertLast(2);
        list.insertLast(1);
        list.insertLast(3);
        list.head=sortList(list.head);
        list.display();
    }
    public static LLRevisionFromScratch.Node sortList(LLRevisionFromScratch.Node head) {
        if(head==null||head.next==null){
            return head;
        }
        LLRevisionFromScratch.Node mid=FindMid(head);
        LLRevisionFromScratch.Node midNext=mid.next;
        mid.next=null;
        LLRevisionFromScratch.Node left=sortList(head);
        LLRevisionFromScratch.Node right=sortList(midNext);
        return MergeList(left,right);

    }
    public static LLRevisionFromScratch.Node FindMid(LLRevisionFromScratch.Node head) {
        LLRevisionFromScratch.Node fast=head;
        LLRevisionFromScratch.Node slow=head;
        LLRevisionFromScratch.Node Prev=null;
        while(fast!=null&&fast.next!=null){
            Prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        return Prev;
    }
    public static   LLRevisionFromScratch.Node MergeList(LLRevisionFromScratch.Node head1,LLRevisionFromScratch.Node head2){
        LLRevisionFromScratch.Node head3=new LLRevisionFromScratch.Node(-1);
        LLRevisionFromScratch.Node temp=head3;
        while(head1!=null&&head2!=null){
            if(head1.value<=head2.value){
                temp.next=head1;
                head1=head1.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
            }
            temp=temp.next;

        }
        if(head1!=null){
            temp.next=head1;
            head1=head1.next;
        }
        if(head2!=null){
            temp.next=head2;
            head2=head2.next;
        }
        return head3.next;
    }
}
