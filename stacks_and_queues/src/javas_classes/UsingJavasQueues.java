package javas_classes;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class UsingJavasQueues
{
    public static void main(String[] args)
    {
        //a linked list will respect the order in which elements are inserted,
        //whereas a priority queue will return elements in priority order
        Queue<Double> queueOfDoubles = new LinkedList<>(); //new PriorityQueue<>();

        queueOfDoubles.offer(5.0);
        queueOfDoubles.offer(2.0);
        queueOfDoubles.offer(3.0);
        queueOfDoubles.offer(1.0);
        queueOfDoubles.offer(6.0);

        //print out my elements
        while (!queueOfDoubles.isEmpty())
        {
            System.out.println(queueOfDoubles.poll());
        }

        //make some changes
//        System.out.println(queueOfDoubles.poll());
//        System.out.println(queueOfDoubles.peek());
//        System.out.println(queueOfDoubles.poll());
//        System.out.println(queueOfDoubles.poll());
//        System.out.println(queueOfDoubles.peek());
//        System.out.println(queueOfDoubles.peek());
//
//        queueOfDoubles.offer(6.0);
//        System.out.println(queueOfDoubles.poll());
    }
}
