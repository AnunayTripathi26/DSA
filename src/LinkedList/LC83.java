package LinkedList;

public class LC83 {
    public static void main(String[] args) {
        Problem83 list=new Problem83();
        list.insertUsingRec(1,0);
        list.insertUsingRec(1,1);
        list.insertUsingRec(2,2);
        list.insertUsingRec(3,3);
        list.insertUsingRec(3,4);
        list.display();
        list.deletedup();
        list.display();


    }

}

class Problem83{
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
    public void display(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }

    public void deletedup() {

        deleteDuplicates(head);
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while(temp!=null&&temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }

        }
        return head;
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
