package stacks;

public class PracticeWithStacks
{
    public static void main(String[] args)
    {
        BoundedStack stack = new BoundedStack(10);

        //report on the size of our stack
        System.out.println("Empty? " + stack.isEmpty());
        System.out.println("Full? " + stack.isFull());
        System.out.println("Size? " + stack.size());
        System.out.println();

        //add a few elements
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        //report again
        System.out.println("Empty? " + stack.isEmpty());
        System.out.println("Full? " + stack.isFull());
        System.out.println("Size? " + stack.size());

        //remove a few (what is the output?)
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        //report again
        System.out.println("Empty? " + stack.isEmpty());
        System.out.println("Full? " + stack.isFull());
        System.out.println("Size? " + stack.size());
    }
}
