package LinkedList;

public class DNode {

    private Integer data;
    private DNode prev;
    private DNode next;

    public DNode()
    {
        this.data = null;
        this.prev = null;
        this.next = null;
    }

    public DNode(int data)
    {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public int getData()
    {
        return this.data;

    }

    public DNode getPrev()
    {
        return this.prev;
    }

    public DNode getNext()
    {
        return this.next;
    }
    
    public void setDate(int data)
    {
        this.data = data;
    }
    public void setPrev(DNode prev)
    {
        this.prev = prev;
    }
    public void setNext(DNode next)
    {
        this.next = next;
    }

}
