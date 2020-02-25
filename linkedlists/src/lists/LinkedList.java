package lists;

public class LinkedList
{
    //fields
    private Node head; //reference to the first node in the list
    private Node tail; //reference to the last node in the list
    private int size;

    //constructor

    public LinkedList()
    {
        //do nothing...
    }

    //methods
    public void add(Object element)
    {
        //is the linked list empty
        if (head == null)
        {
            head = new Node(element);
        }
        else
        {
            //search to the end of the linked list and insert the new node
            Node current = head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = new Node(element);
        }
    }

    public boolean remove(Object element)
    {
        return false;
    }

    public int size()
    {
        return 0;
    }

    public void clear()
    {

    }

    public Object get(int index)
    {
        return null;
    }

    private class Node
    {
        private Object data;
        private Node next;

        public Node(Object data)
        {
            this.data = data;
        }

        public Node(Object data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }
}
