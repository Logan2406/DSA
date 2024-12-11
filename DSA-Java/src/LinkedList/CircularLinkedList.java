package LinkedList;

public class CircularLinkedList implements LinkedList {

    private Node last;
    private int capacity;

    public CircularLinkedList()
    {
        this.last =null;
        this.capacity=0;
    }

    public CircularLinkedList(int arr[])
    {
        Node temp =null;
        Node prev =null;
        for(int i=0; i<arr.length;i++)
        {
            Node newNode = new Node(arr[i]);
            this.last = newNode;
            if(i==0)
            {
                temp = newNode;
            }
            else
            {
                prev.setNext(newNode);
            }
            prev = newNode;
            newNode.setNext(temp);
        }
        this.capacity = arr.length;

    }

    @Override
    public int getCapacity() {
       return this.capacity;
    }

    @Override
    public Node getHead() {
        return this.last.getNext();
    }

    public Node getLast()
    {
        return this.last;
    }

    @Override
    public Node search(int data) {
        if(this.last!=null)
        {
            Node head = this.last.getNext();
            Node temp = head;
            while(temp.getNext()!=head)
            {
                if(temp.getData() == data)
                {
                    return temp;
                }
                temp = temp.getNext();
            }
        }
        return null;
    }

    @Override
    public void insertBegin(int data) {

        Node temp = new Node(data);
        if(this.last!=null)
        {
            Node head = this.last.getNext();
            this.last.setNext(temp);
            temp.setNext(head);
        }
        else
        {
            this.last = temp;
            temp.setNext(temp);
        }
    }

    @Override
    public void insertBegin(Node node) {
        if(this.last!=null)
        {
            Node head = this.last.getNext();
            this.last.setNext(node);
            node.setNext(head);
        }
        else
        {
            this.last = node;
            node.setNext(node);
        }
    }

    @Override
    public void insertEnd(int data) {

        Node temp = new Node(data);
        if(this.last!=null)
        {
            Node head = this.last.getNext();
            this.last.setNext(temp);
            temp.setNext(head);
        }
        else
        {
            this.last = temp;
            temp.setNext(temp);
        }


    }

    @Override
    public void insertEnd(Node node) {
        if(this.last!=null)
        {
            Node head = this.last.getNext();
            this.last.setNext(node);
            node.setNext(head);
        }
        else
        {
            this.last = node;
            node.setNext(node);
        }
    }

    @Override
    public void insertMiddle(int pos, int data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertMiddle'");
    }

    @Override
    public void insertMiddle(int pos, Node node) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertMiddle'");
    }

    @Override
    public void insertBefore(Node node, int data) {

    }

    @Override
    public void insertBefore(Node node, Node newNode) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertBefore'");
    }

    @Override
    public void insertAfter(Node node, int data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertAfter'");
    }

    @Override
    public void insertAfter(Node node, Node newNode) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertAfter'");
    }

    @Override
    public void deleteBegin() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteBegin'");
    }

    @Override
    public void deleteEnd() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteEnd'");
    }

    @Override
    public void deleteBefore(Node node) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteBefore'");
    }

    @Override
    public void deleteAfter(Node node) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAfter'");
    }

    @Override
    public void deleteMiddle(int pos) {
       
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteMiddle'");
    }

    @Override
    public void reverseList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reverseList'");
    }

    @Override
    public void printList() {

        if(this.last!=null)
        {
            Node temp = this.last.getNext();
            do
            {
                System.out.print(temp.getData()+"->");
                temp= temp.getNext();
            }while(temp!=this.last.getNext());
            System.out.print("head\n");
        }

    }

    @Override
    public boolean isEmpty()
    {
        return true;
    }

}
