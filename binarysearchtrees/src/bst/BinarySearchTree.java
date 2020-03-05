package bst;

public class BinarySearchTree
{
    //fields
    private Node root;
    private int size;

    //constructors
    public BinarySearchTree()
    {
        //do nothing...
    }

    //binary search tree ADT methods
    public void add(Comparable element)
    {
        //check if the tree is empty
        if (root == null)
        {
            root = new Node(element);
            size++;
        }
        else
        {
            add(element, root);
        }
    }

    //a private recursive method that helps us move down the tree
    //to insert a new element
    private void add(Comparable elementToInsert, Node currentNode)
    {
        if (currentNode.data.compareTo(elementToInsert) == 0)
        {
            //the element is already in the tree, stop (return)!
            return;
        }
        else if (currentNode.data.compareTo(elementToInsert) > 0) //look to the left
        {
            if (currentNode.left == null)
            {
                //no left child
                currentNode.left = new Node(elementToInsert);
                size++;
            }
            else
            {
                //there is a left child, go search there
                add(elementToInsert, currentNode.left);
            }
        }
        else if (currentNode.data.compareTo(elementToInsert) < 0) //look to the right
        {
            if (currentNode.right == null)
            {
                //no right child
                currentNode.right = new Node(elementToInsert);
                size++;
            }
            else
            {
                //there is a right child, go search there
                add(elementToInsert, currentNode.right);
            }
        }
    }

    public boolean contains(Comparable search)
    {
        return contains(search, root);
    }

    private boolean contains(Comparable search, Node current)
    {
        if (current == null)
        {
            return false; //not found!
        }

        if (current.data.compareTo(search) == 0)
        {
            return true; //found!
        }
        else if (current.data.compareTo(search) > 0) //look to the left
        {
            return contains(search, current.left);
        }
        else //if (current.data.compareTo(search) < 0) //look to the right
        {
            return contains(search, current.right);
        }
    }

    public boolean containsIterative(Comparable search)
    {
        Node current = root;
        while (current != null)
        {
            if (current.data.compareTo(search) == 0)
            {
                return true; //found!
            }
            else if (current.data.compareTo(search) > 0) //look to the left
            {
                current = current.left;
            }
            else //if (current.data.compareTo(search) < 0) //look to the right
            {
                current = current.right;
            }
        }
        return false; //not found!
    }

    public void remove()
    {

    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    private class Node
    {
        //use the Comparable interface for elements...
        private Comparable data;
        private Node left;
        private Node right;

        public Node(Comparable data)
        {
            this.data = data;
        }

        public Node(Comparable data, Node left, Node right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
