package LinkedList;

public class LLApp {

    public static void main(String[] args)
    {

        int arr [] ={1,2,3,4,5};
        //SinglyLinkedList list = new SinglyLinkedList(arr);
        //list.printList();

        //list.reverseList();
        //list.printList();

        LinkedList clist = new CircularLinkedList(arr);
        
        clist.printList();

        clist.reverseList();

        clist.printList();

    }
}
