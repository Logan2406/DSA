package LinkedList;

public class SinglyLinkedList {
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

    public int getCapacity()
    {
        return this.capacity;
    }

    public Node getHead()
    {
        return this.head;
    }

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

    public void insertBegin(int data)
    {
        Node node = new Node(data);
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

    public void insertEnd(int data)
    {
        Node node = new Node(data);

        if(this.head == null )
        {
            this.head =node;
        }

        Node temp = this.head;
        while(temp!=null && temp.hasNext())
        {
            temp = temp.getNext();
        }

        temp.setNext(node);
        this.capacity++;
    }

    public void insertEnd(Node node)
    {

        if(this.head == null )
        {
            this.head =node;
        }

        Node temp = this.head;
        while(temp!=null && temp.hasNext())
        {
            temp = temp.getNext();
        }

        temp.setNext(node);
        this.capacity++;

    }

    public void insertMiddle(int pos, int data)
    {
        // if the pos is greater than the capacity then insert at the end
        Node node= new Node(data);

        if(pos>=this.capacity)
        {
            this.insertEnd(node);
        }
        else if(pos<=0)
        {
            this.insertBegin(node);
        }
        else
        {
            Node temp = this.head;
            while(pos>0)
            {
                temp = temp.getNext();
                pos--;
            }
            this.insertAfter(temp, node);
        }
        this.capacity++;

    }

    public void insertMiddle(int pos, Node node)
    {
            // if the pos is greater than the capacity then insert at the end
            if(pos>=this.capacity)
            {
                this.insertEnd(node);
            }
            else if(pos<=0)
            {
                this.insertBegin(node);
            }
            else
            {
                Node temp = this.head;
                while(pos>0)
                {
                    temp = temp.getNext();
                    pos--;
                }
                this.insertAfter(temp, node);
            }
            this.capacity++;
    
            
    }

    public void insertBefore(Node node, int data)
    {
            if(node!=null)
            {
                Node newNode = new Node(data);
                Node temp = this.head;
                while(temp!=null && temp.getNext()==node)
                {
                    temp = temp.getNext();
                }
                
                newNode.setNext(node);
                temp.setNext(newNode); 
                this.capacity++; 
            }
            
    }

    public void insertBefore(Node node, Node newNode)
    {
        if(node!=null)
        {
            Node temp = this.head;
            if(this.head==node)
            {
                newNode.setNext(node);
                this.head = newNode;
            }
            
            else
            {
                while(temp!=null && temp.getNext()==node)
                {
                    temp = temp.getNext();
                }
                
                newNode.setNext(node);
                temp.setNext(newNode);
            }
          
            this.capacity++;
        }
        
            
    }

    public void insertAfter(Node node, int data)
    {
        if(node!=null)
        {
            Node newNode = new Node(data);
            Node af = node.getNext();
            newNode.setNext(af);
            node.setNext(newNode);
            this.capacity++;
            
        } 
            
    }

    public void insertAfter(Node node, Node newNode)
    {
        if(node!=null)
        {
            Node af = node.getNext();
            newNode.setNext(af);
            node.setNext(newNode);
            this.capacity++;
            
        } 
            
    }

    public void deleteBegin()
    {
        if(this.capacity==0)
        {

        }
        else
        {
            Node temp = this.head;
            this.head=this.head.getNext();
            temp=null;
            this.capacity--;

        }

    }

    public void deleteEnd()
    {
        if(this.capacity==0)
        {

        }
        if(this.capacity==1)
        {
            Node temp = this.head;
            this.head=null;
            temp =null;
            this.capacity--;
        }
        else
        {
            Node temp = this.head;
            while(temp!=null && temp.getNext()!=null && temp.getNext().getNext()!=null)
            {
                temp=temp.getNext();
            }
            
            temp.setNext(null);
            this.capacity--;
        }

    }

    public void deleteBefore(Node node)
    {
        if(node!=null)
        {
            Node temp = this.head;
            if(this.head==node)
            {
                
            }
            if(this.head.getNext()==node)
            {
                this.deleteBegin();
            }
            else
            {
                while(temp!=null && temp.getNext()!=null && temp.getNext().getNext()!=null)
                {
                    if(temp.getNext().getNext()==node)
                    {
                        temp.setNext(node);
                    }
                    else
                    {
                        temp = temp.getNext();
                    }
                }
            }
        
        }
    }

    public void deleteAfter(Node node)
    {
        if(node!=null)
        {
            if(this.head==null)
            {

            }
            if(node.getNext()!=null)
            {
                node.setNext(node.getNext());
            }
        }

    }


    public void deleteMiddle(int pos)
    {
        
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
    public boolean isEmpty()
    {
        return true;
    }
    

}
