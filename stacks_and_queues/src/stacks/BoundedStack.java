package stacks;

public class BoundedStack
{
    private int maxSize;
    private Object[] theStack;
    private int topOfStack = 0;
    private int size = 0;

    public BoundedStack(int maxSize)
    {
        this.maxSize = maxSize;
        theStack = new Object[maxSize];
    }

    //here are my ADT methods

    //adds an element to the top of the stack
    public boolean push(Object element)
    {
        //out of room...
        if (topOfStack >= theStack.length)
        {
            return false;
        }

        theStack[topOfStack] = element;
        topOfStack++;
        return true;
    }

    //removes and returns the top element of the stack
    public Object pop()
    {
        //return null if the stack is empty
        if (topOfStack == 0)
        {
            return null;
        }

        //save the top element of the stack
        Object top = theStack[topOfStack - 1];

        //remove the top element of the stack
        theStack[topOfStack - 1] = null;
        topOfStack--;

        return top;
    }

    //returns the top element of the stack
    public Object peek()
    {
        //return null if the stack is empty
        if (topOfStack == 0)
        {
            return null;
        }

        return theStack[topOfStack - 1];
    }

    public int size()
    {
        //TODO
        return 0;
    }

    public boolean isEmpty()
    {
        //TODO
        return false;
    }

    public boolean isFull()
    {
        //TODO
        return false;
    }
}
