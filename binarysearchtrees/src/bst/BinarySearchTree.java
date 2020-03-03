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
        else if (currentNode.data.compareTo(elementToInsert) > 0)
        {
            if (currentNode.left == null)
            {
                //no left child
                currentNode.left = new Node(elementToInsert);
            }
            else
            {
                //there is a left child, go search there
                add(elementToInsert, currentNode.left);
            }
        }
    }

    public boolean contains()
    {
        return false;
    }

    public void remove()
    {

    }

    public int size()
    {
        return 0;
    }

    public boolean isEmpty()
    {
        return false;
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
