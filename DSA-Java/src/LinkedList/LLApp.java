package LinkedList;

public class LLApp {

    public static void main(String[] args)
    {
        LinkedList list = new SinglyLinkedList();
        System.out.println(list.getHead());
        System.out.println(list.getCapacity());
        list.insertMiddle(0, 45);
        list.printList();
        System.out.println(list.getCapacity());
        list.insertMiddle(0, 6);
        list.printList();
        System.out.println(list.getCapacity());
        list.insertMiddle(1, 89);
        list.printList();
        System.out.println(list.getCapacity());
        list.printList();
        System.out.println(list.getCapacity());
        list.insertMiddle(3, 78);
        System.out.println(list.getCapacity());
        list.printList();
       
       

    }
}
