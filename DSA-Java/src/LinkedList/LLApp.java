package LinkedList;

public class LLApp {

    public static void main(String[] args)
    {

        int arr [] ={1,2,3};
        SinglyLinkedList list = new SinglyLinkedList(arr);
        list.printList();

        list.reverseList();
        list.printList();

    }
}
