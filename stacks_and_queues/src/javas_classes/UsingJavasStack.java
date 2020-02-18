package javas_classes;

import stacks.BoundedStack;

import java.util.Stack;

public class UsingJavasStack
{
    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<>();

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
        System.out.println();

        //report again
        printStackDetails(stack);

        //add a few elements and loop over the stack
        stack.push("e");
        stack.push("f");
        stack.push("g");
        stack.push("h");
        stack.push("i");

        //this will not remove elements from the stack, but
        //will instead observe each element
        for(String letter : stack)
        {
            System.out.println(letter);
        }
    }

    private static void printStackDetails(Stack stack)
    {
        System.out.println("Empty? " + stack.isEmpty());
        System.out.println("Size? " + stack.size());
        System.out.println();
    }
}
