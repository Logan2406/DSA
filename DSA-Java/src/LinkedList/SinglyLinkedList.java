package LinkedList;

public class SinglyLinkedList implements LinkedList{
    private Node head;
    private int capacity;

    public SinglyLinkedList()
    {
        //at the time of creating
        this.head=null;
        this.capacity=0;
        
    }

    public SinglyLinkedList(int[] arr)
    {
        Node temp = null;
        Node prev = null;
        for(int i=0;i<arr.length;i++)
        {
          temp = new Node(arr[i]);
          if(i==0)
          {
            this.head = temp;
            prev=this.head;
          }
          else{
            prev.setNext(temp);
            prev = prev.getNext();
          }   
        }
        this.capacity=arr.length;
    }

    @Override
    public int getCapacity()
    {
        return this.capacity;
    }

    @Override
    public Node getHead()
    {
        return this.head;
    }

    @Override
    public Node search(int data)
    {
        //to be implemented
        Node temp = this.head;
        while(temp!=null)
        {
            if(temp.getData()==data)
            {
                return temp;
            }
            temp=temp.getNext();
        }
        return null;
    }

    //getIndex


    @Override
    public void insertBegin(int data)
    {
        Node node = new Node(data);
        this.insertBegin(node);
    } 

    @Override
    public void insertBegin(Node node)
    {
        if(this.head==null)
        {
            this.head=node;
        }
        else
        {
            node.setNext(this.head);
            this.head = node;
        }
        this.capacity++;

    } 

    @Override
    public void insertEnd(int data)
    {
        Node node = new Node(data);
        this.insertEnd(node);
    }

    @Override
    public void insertEnd(Node node)
    {

        if(this.head == null )
        {
            this.head =node;
        }

        else
        {
            Node temp = this.head;
            while(temp!=null && temp.getNext()!=null)
            {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
        this.capacity++;

    }

    @Override
    public void insertBefore(Node node, int data)
    {
        Node newNode = new Node(data);
        this.insertBefore(node, newNode);
    }


    @Override
    public void insertBefore(Node node, Node newNode)
    {
        Node head = this.head;
        if(node==head)
        {
            insertBegin(newNode);
        }
        else
        {
            while(head.getNext()!=node)
            {
                head=head.getNext();
            }
            newNode.setNext(head.getNext());
            head.setNext(newNode);
            this.capacity++;
        }
            
        
        
            
    }


    @Override
    public void insertAfter(Node node, int data)
    {
        Node newNode = new Node(data);
        this.insertAfter(node,newNode);
            
    }


    @Override
    public void insertAfter(Node node, Node newNode)
    {
        
        if(node==null)
        {
            insertEnd(newNode);
        }
        else
        {
            Node af = node.getNext();
            newNode.setNext(af);
            node.setNext(newNode);
            this.capacity++;
        }
        
    }


    @Override
    public void insertMiddle(int pos, int data)
    {

        Node node= new Node(data);
        this.insertMiddle(pos, node);

    }

    @Override
    public void insertMiddle(int pos, Node node)
    {
        if(pos<0)
        {
            System.out.println("Cannot be added, invalid position");
        }
    
        else if(pos>this.capacity)
        {
            System.out.println("Cannot be addeded since position exceeds the capacity");
        }
        else
        {
            if(pos==0)
            {
                insertBefore(this.head, node);
            }
            else
            {
                Node temp=this.head;
               
                while((pos-1)>0)
                {
                    temp=temp.getNext();
                    pos--;
                }
                this.insertAfter(temp,node);
            }
        }       
    }

    //Perfect till here

    @Override
    public void deleteBegin()
    {
        if(this.capacity==0)
        {
            System.out.println("Cannot be deleted since no element present, underflow");
        }
        else
        {
            this.head=this.head.getNext();
            this.capacity--;
        }

    }


    @Override
    public void deleteEnd()
    {
        if(this.capacity==0)
        {
            System.out.println("Cannot be deleted since no element present, underflow");
        }
        if(this.capacity==1)
        {
            this.head=null;
            this.capacity--;
        }
        else
        {
            Node temp = this.head;
            while(temp.getNext()!=null && temp.getNext().getNext()!=null)
            {
                temp=temp.getNext();
            }
            temp.setNext(null);
            this.capacity--;
        }

    }

    @Override
    public void deleteBefore(Node node)
    {
        
        Node temp = this.head;
        if(this.head==node)
        {
            System.out.println("No element before this");
        }
        Node prev=null;
        while(temp.getNext()!=node)
        {
            prev=temp;
            temp=temp.getNext();
            
        }
        if(temp==this.head)
        {
            this.deleteBegin();
        }
        else
        {
            prev.setNext(temp.getNext());
            this.capacity--;
        }

    }


    @Override
    public void deleteAfter(Node node)
    {
        if(node!=null)
        {
            if(this.head==null)
            {
                System.out.println("No element in the list");
            }
            if(node.getNext()==null)
            {
                System.out.println("No element present afte this node in list");
            }
            if(node.getNext()!=null)
            {
                node.setNext(node.getNext().getNext());
                this.capacity--;
            }
        }

    }


    @Override
    public void deleteMiddle(int pos)
    {
        
        if(pos>=this.capacity)
        {
            System.out.println("Invalid Position, exceed the capacity");
        }
        else if(pos<0)
        {
            System.out.println("Invalid Postion, cannot be negative");
        }
        else 
        {
            if(pos==0)
            {
                this.deleteBegin();
            }
            Node temp = this.head;
            while((pos-1)>0)
            {
                temp=temp.getNext();
                pos--;
            }
            this.deleteAfter(temp);
            this.capacity--;
        }
    }

    public void reverseList()
    {
        if(this.head!=null)
        {
            Node prev=null;
            Node curr = this.head;
            Node af = null;

            while(curr!=null)
            {
                af = curr.getNext();
                curr.setNext(prev);
                prev = curr;
                curr=af;
            }
            this.head = prev;
        }

    }

    @Override
    public void printList()
    {
        Node temp = this.head;
        while(temp!=null)
        {
            System.out.print(temp.getData()+"->");
            temp=temp.getNext();
        }
        System.out.print("null\n");

    }

    @Override
    public boolean isEmpty()
    {
        if(this.capacity>0)
        {
            return false;
        }
        
        return true;
    }
    

}
