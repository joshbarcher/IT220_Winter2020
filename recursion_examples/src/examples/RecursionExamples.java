package examples;

public class RecursionExamples
{
    private static int methodCallCount = 0;

    public static void main(String[] args)
    {
        System.out.println("fac(3): " + factorial(3));
        System.out.println("fac(4): " + factorial(4));
        System.out.println("fac(5): " + factorial(5));
        System.out.println("fac(10): " + factorial(10));
        System.out.println("fac(15): " + factorial(15));
        System.out.println("fac(20): " + factorial(20));
        System.out.println("fac(30): " + factorial(30));
        System.out.println("fac(50): " + factorial(50));
    }

    public static long factorial(long num)
    {
        //base cases
        if (num < 0)
        {
            throw new IllegalArgumentException(
                "Negative factorials don't exist");
        }

        //the smallest factorial
        if (num == 0)
        {
            return 1;
        }

        //recursive call
        long result = num * factorial(num - 1);
        return result;
    }

    public static void printChars(String input)
    {
        //base case
        if (input.length() != 0)
        {
            //print out a single character
            System.out.println(input.charAt(0));

            //recurse
            printChars(input.substring(1));
        }
    }

    public static void printEvensUpToOneHundred(int start)
    {
        //base case
        if (start > 100)
        {
            return; //exit
        }

        //what if the number is odd
        if (start % 2 != 0)
        {
            //change to even number
            start++;
        }

        System.out.println(start);
        printEvensUpToOneHundred(start + 2);
    }

    public static void printDownToZero(int num)
    {
        //base case
        if (num < 0)
        {
            return; //stop calling the method
        }

        //do something... (print the number)
        System.out.println(num);

        //recurse
        printDownToZero(num - 1);
    }

    public static void foo()
    {
        methodCallCount++;
        System.out.println(methodCallCount);
        foo();
    }

    public static void welcomeToProgram()
    {
        String message = "Welcome to my program";
        System.out.println(message);

        runProgram();
    }

    public static void runProgram()
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println(i);
        }
    }
}
