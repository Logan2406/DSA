package LinkedList;

public class CircularLinkedList implements LinkedList {

    private Node head;
    private int capacity;

    public CircularLinkedList()
    {
        this.head =null;
        this.capacity=0;
    }

    public CircularLinkedList(int arr[])
    {
        if(arr.length<=0)
        {

        }
        else
        {
            Node curr = null;
            for(int i=0;i<arr.length;i++)
            {
                Node temp = new Node(arr[i]);
                
                if(i==0)
                {
                    this.head = temp;
                    curr = temp;
                }
                else
                {
                    curr.setNext(temp);
                    curr = temp;
                }
            }
            curr.setNext(this.head);
            this.capacity = arr.length;
        }
    }

    @Override
    public int getCapacity() {
       return 0;
    }

    @Override
    public Node getHead() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHead'");
    }

    @Override
    public Node search(int data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }

    @Override
    public void insertBegin(int data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertBegin'");
    }

    @Override
    public void insertBegin(Node node) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertBegin'");
    }

    @Override
    public void insertEnd(int data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertEnd'");
    }

    @Override
    public void insertEnd(Node node) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertEnd'");
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertBefore'");
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
       Node temp = this.head;
       if(this.capacity==1)
       {
        System.out.println(this.head.getData()+"->head");
       }
       else
       {
        while(temp!=null && temp.getNext()!=this.head)
        {
            System.out.print(temp.getData()+"->");
            temp = temp.getNext();
        }
        if(this.capacity==0)
        {
            System.out.print("null\n");
        }
        else
        {
            System.out.print(temp.getData()+"->head\n"); 
        }
       }
        
    }

    @Override
    public boolean isEmpty()
    {
        return true;
    }

}
