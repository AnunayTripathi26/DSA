package LinkedList;

public class LC876 {
    public static void main(String[] args) {
        LLRevisionFromScratch list=new LLRevisionFromScratch();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        System.out.println(middleNode(list.head));
    }
    public static int middleNode(LLRevisionFromScratch.Node head) {
        LLRevisionFromScratch.Node fast=head;
        LLRevisionFromScratch.Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.value;

    }
}
