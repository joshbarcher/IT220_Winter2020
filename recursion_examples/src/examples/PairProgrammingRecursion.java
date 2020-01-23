package examples;

public class PairProgrammingRecursion
{
    public static void main(String[] args)
    {
        System.out.println(powerN(3, 1));
        System.out.println(powerN(3, 2));
        System.out.println(powerN(3, 3));
        System.out.println();

        System.out.println(bunnyEars(0));
        System.out.println(bunnyEars(1));
        System.out.println(bunnyEars(2));
        System.out.println();

        System.out.println(crazyBunnyEars(0));
        System.out.println(crazyBunnyEars(1));
        System.out.println(crazyBunnyEars(2));
        System.out.println(crazyBunnyEars(3));
        System.out.println(crazyBunnyEars(4));
        System.out.println();

        System.out.println(checkParens("((()))"));
        System.out.println(checkParens("[(()))"));
        System.out.println(checkParens("(((]))"));
        System.out.println(checkParens("(((x)))"));
        System.out.println();

        System.out.println(countHi("xxhixx"));
        System.out.println(countHi("xhixhix"));
        System.out.println(countHi("hi"));
        System.out.println(countHi("xxhxixx"));
        System.out.println();
    }

    public static int powerN(int base, int power)
    {
        if (power < 0)
        {
            throw new IllegalArgumentException("Base exponent given...");
        }

        if (power == 0)
        {
            return 1;
        }

        return base * powerN(base, power - 1);
    }

    public static int bunnyEars(int bunnies)
    {
        if (bunnies < 0)
        {
            throw new IllegalArgumentException("Negative bunnies given...");
        }

        if (bunnies == 0)
        {
            return 0;
        }

        return 2 + bunnyEars(bunnies - 1);
    }

    public static int crazyBunnyEars(int bunnies)
    {
        if (bunnies < 0)
        {
            throw new IllegalArgumentException("Negative bunnies given...");
        }

        if (bunnies == 0)
        {
            return 0;
        }

        if (bunnies % 2 == 0) //even
        {
            return 3 + crazyBunnyEars(bunnies - 1);
        }
        else //odd
        {
            return 2 + crazyBunnyEars(bunnies - 1);
        }
    }

    public static boolean checkParens(String input)
    {
        //base case...
        if (input.equals(""))
        {
            return true;
        }
        else if (input.length() == 1)
        {
            return false;
        }

        char first = input.charAt(0);
        char last = input.charAt(input.length() - 1);
        if (first == '(' && last == ')')
        {
            //recurse
            return checkParens(input.substring(1, input.length() - 1));
        }
        else
        {
            return false;
        }
    }

    public static int countHi(String input)
    {
        if (input.length() < 2)
        {
            return 0;
        }

        //find the index of hi
        int index = input.indexOf("hi");
        if (index == -1) //not found
        {
            return 0;
        }
        else
        {
            return 1 + countHi(input.substring(index + 2));
        }
    }
}
