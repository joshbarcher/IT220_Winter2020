package stacks;

import java.util.Random;
import java.util.Stack;

public class PracticeWithStacks
{
    public static void main(String[] args)
    {
        BoundedStack stackOfRandomNumbers = new BoundedStack(10);
        Random random = new Random();

        //fill the stack
        while (!stackOfRandomNumbers.isFull())
        {
            //print out elements in the stack
            int randomNum = random.nextInt(20);
            System.out.println(randomNum);
            stackOfRandomNumbers.push(randomNum);
        }
        System.out.println();

        printStackDetails(stackOfRandomNumbers);

        System.out.println("Dump all elements in the stack");
        while (!stackOfRandomNumbers.isEmpty())
        {
            System.out.println(stackOfRandomNumbers.pop());
        }

        printStackDetails(stackOfRandomNumbers);
    }

    private static void sanityCheck()
    {
        BoundedStack stack = new BoundedStack(10);

        //report on the size of our stack
        printStackDetails(stack);

        //add a few elements
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        //report again
        printStackDetails(stack);

        //remove a few (what is the output?)
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        //report again
        printStackDetails(stack);
    }

    private static void printStackDetails(BoundedStack stack)
    {
        System.out.println("Empty? " + stack.isEmpty());
        System.out.println("Full? " + stack.isFull());
        System.out.println("Size? " + stack.size());
        System.out.println();
    }
}
