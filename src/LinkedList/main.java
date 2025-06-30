package LinkedList;
/**
 * This file demonstrates the implementation of:
 * 1. Singly Linked List
 * 2. Doubly Linked List
 * 3. Circular Linked List
 *
 * Each list is implemented from scratch with core operations like insertion,
 * deletion, and display.
 *
 * To test a specific list:
 * - Uncomment the relevant object instantiation and method calls in the `main()` function.
 * - Example usage is provided in comments for each list class.
 */

class main {
    public static void main(String args[]) {
        ////////////////////////////For singly Linked List//////////////////////////////////////
//        SinglyLinkedListFromScratch list=new SinglyLinkedListFromScratch();
//        list.insertFirst(20);
//        list.insertFirst(30);
//        list.insertFirst(60);
//        list.insertFirst(800);
//        list.insertFirst(1000);
//        list.insertFirst(2000);
//        list.insertFirst(3000);
//        list.insertFirst(4000);
//        list.insertFirst(5000);
//        list.insertFirst(6000);
//        list.display();
//        list.insertLast(10000);
//        list.display();
//        list.deleteFirst();
//        list.display();
//        list.deleteLast();
//        list.display();
//        System.out.println(list.get(2));
//        list.deleteParticular(4);
//        list.display();
//        System.out.println(list.Find(800));
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////For Doubly Linked List////////////////////////////////////////////////

//        DoublyLinkedListFromScratch list2=new DoublyLinkedListFromScratch();
//        list2.insertFirst(1);
//        list2.insertFirst(2);
//        list2.insertFirst(3);
//        list2.insertFirst(4);
//        list2.insertFirst(5);
//        list2.insertFirst(6);
//        list2.insertFirst(7);
//        list2.insertFirst(8);
//        list2.insertFirst(9);
//        list2.insertFirst(10);
//        list2.insertFirst(11);
//        list2.display();
//        list2.insertLast(21);
//        list2.display();
//        list2.insertAfteranIndex(2,51);
//        list2.display();
//
//
//    }

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////For Circular Linked List////////////////////////////////////////////////////////////////////////
        CircularLinkedListFromScratch list=new CircularLinkedListFromScratch();
        list.insert(6);
        list.insert(5);
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        list.display();
        list.delete(2);
        list.display();


    }
}