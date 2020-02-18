package queues;

import java.util.ArrayList;

public class MyQueue
{
    private ArrayList<Object> internalQueue;

    public MyQueue()
    {
        internalQueue = new ArrayList<>();
    }

    public void enqueue(Object element)
    {
        internalQueue.add(element);
    }

    public Object dequeue()
    {
        if (internalQueue.size() == 0)
        {
            return null;
        }

        return internalQueue.remove(0);
    }

    public Object peek()
    {
        if (internalQueue.size() == 0)
        {
            return null;
        }
        return internalQueue.get(0);
    }

    public int size()
    {
        return internalQueue.size();
    }

    public boolean isEmpty()
    {
        return internalQueue.isEmpty();
    }
}
