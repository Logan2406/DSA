package LinkedList;

public class Node {


    Integer data;
    Node next;

    public Node()
    {
        this.data=null;
        this.next =null;

    }
    public Node(int i)
    {
        this.data=i;
        this.next =null;

    }

    public void setData(int i)
    {
        this.data = i;

    }
    public void setNext(Node n)
    {
        this.next = n;
    }

    public int getData()
    {
        return this.data;
    }
    public Node getNext()
    {
        return this.next;
    }

    public boolean hasNext()
    {
        if (this.next!=null)
        {
            return true;
        }
        return false;
    }
}
