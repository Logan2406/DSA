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

        Node head = this.last.getNext();
        Node newNode = new Node(data);
        if(node!=null)
        {
            while(head.getNext()!=node)
            {
                head = head.getNext();
            }
            newNode.setNext(node);
            head.setNext(newNode);
        }
    }


    @Override
    public void insertBefore(Node node, Node newNode) {
        Node head = this.last.getNext();
        if(node!=null)
        {
            while(head.getNext()!=node)
            {
                head = head.getNext();
            }
            newNode.setNext(node);
            head.setNext(newNode);
        }
    }

    @Override
    public void insertAfter(Node node, int data) {
        Node newNode = new Node(data);

        if(node!=null)
        {
            Node af = node.getNext();
            node.setNext(newNode);
            newNode.setNext(af);
        }
    }

    @Override
    public void insertAfter(Node node, Node newNode) {
        if(node!=null)
        {
            Node af = node.getNext();
            node.setNext(newNode);
            newNode.setNext(af);
        }   
    }

    @Override
    public void deleteBegin() {
       if(this.last==null)
       {

       }
       else if(this.capacity ==1)
       {
            this.last = null;
       }
       else
       {
            Node head = this.last.getNext();
            this.last.setNext(head.getNext());
       }
    }

    @Override
    public void deleteEnd() {
        if(this.last==null)
       {

       }
       else if(this.capacity ==1)
       {
            this.last = null;
       }
       else
       {
            Node head = this.last.getNext();
            Node temp = head;
            while(temp.getNext()!=this.last)
            {
                temp = temp.getNext();
            }
            temp.setNext(head);
       }
    }

    @Override
    public void deleteBefore(Node node) {
        if(node!=null)
        {
            Node temp = this.last.getNext();
            while(temp.getNext().getNext()!=node)
            {
                temp= temp.getNext();
            }
            temp.setNext(node);
            
        }
    }

    @Override
    public void deleteAfter(Node node) {
       if(node!=null)
       {
            Node temp = node.getNext();
            node.setNext(temp.getNext());
       }
    }

    @Override
    public void deleteMiddle(int pos) {
       
        if(pos<=0)
        {
            deleteBegin();
        }
        else if(pos>=this.capacity)
        {
            deleteEnd();
        }
        else
        {
            Node head = this.last.getNext();
            while(pos>1)
            {
                head = head.getNext();
                pos--;
            }
            deleteAfter(head);
        }
    }

    @Override
    public void reverseList() {
       Node head = this.last.getNext();
       this.last.setNext(null);
    
       Node prev=this.last;
       Node curr = head;
       Node af = null;

       while(curr!=null)
       {
           af = curr.getNext();
           curr.setNext(prev);
           prev = curr;
           curr=af;
       }
       this.last =  head;   

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
