package queues;

import java.util.ArrayList;

public class QueueTests
{
    public static void main(String[] args)
    {
        MyQueue queue = new MyQueue();

        //add a few elements
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");

        //print them out
        while (!queue.isEmpty())
        {
            System.out.println(queue.dequeue());
        }

        //stress the data structure
        while(queue.size() < 5000000)
        {
            queue.enqueue("a");
        }
        System.out.println("Size: " + queue.size());

        while (!queue.isEmpty())
        {
            queue.dequeue();
        }
        System.out.println("Queue is empty");
    }
}
