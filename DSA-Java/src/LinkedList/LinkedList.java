package LinkedList;

public interface LinkedList {

    public int getCapacity();

    public Node getHead();

    public Node search(int data);

    public void insertBegin(int data);

    public void insertBegin(Node node);

    public void insertEnd(int data);

    public void insertEnd(Node node);

    public void insertMiddle(int pos, int data);

    public void insertMiddle(int pos, Node node);

    public void insertBefore(Node node, int data);

    public void insertBefore(Node node, Node newNode);

    public void insertAfter(Node node, int data);

    public void insertAfter(Node node, Node newNode);

    public void deleteBegin();

    public void deleteEnd();

    public void deleteBefore(Node node);

    public void deleteAfter(Node node);

    public void deleteMiddle(int pos);

    public void reverseList();

    public void printList();

    public boolean isEmpty();
}
