package LinkedList;

public class LLApp {

    public static void main(String[] args)
    {

        int arr [] ={};
        //SinglyLinkedList list = new SinglyLinkedList(arr);
        //list.printList();

        //list.reverseList();
        //list.printList();

        LinkedList clist = new CircularLinkedList(arr);
        
        clist.printList();

    }
}
