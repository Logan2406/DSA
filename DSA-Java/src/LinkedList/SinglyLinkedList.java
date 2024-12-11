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

    @Override
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

    @Override
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

    @Override
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

    @Override
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


    @Override
    public void insertBefore(Node node, int data)
    {

        //Not handled the  condition for if insert before head position
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


    @Override
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


    @Override
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


    @Override
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


    @Override
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


    @Override
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
                        this.capacity--;
                    }
                    else
                    {
                        temp = temp.getNext();
                    }
                }
            }
        
        }
    }


    @Override
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
                this.capacity--;
            }
        }

    }


    @Override
    public void deleteMiddle(int pos)
    {
        Node temp = this.head;
        if(pos>=this.capacity)
        {
            this.deleteEnd();
        }
        else if(pos<=0)
        {
            this.deleteBegin();
        }
        else 
        {
            pos--;
            while(pos>0)
            {
                temp = temp.getNext();
                pos--;

            }
            this.deleteAfter(temp);
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
