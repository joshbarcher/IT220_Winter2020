package datastructures;

import java.util.ArrayList;
import java.util.Random;

public class TestBag
{
    public static void main(String[] args)
    {
        //using a generic type with the array list class
        ArrayList<String> listOfStrings = new ArrayList<>();


    }

    private static void numbersExample()
    {
        Bag<Integer> bigOlBagOfNums = new Bag<>(7000000);
        Random random = new Random();

        while (!bigOlBagOfNums.isFull())
        {
            bigOlBagOfNums.add(random.nextInt(1000000));
        }

        System.out.println(bigOlBagOfNums.isFull());
    }

    private static void produceExample()
    {
        Bag<Produce> bagOfProduce = new Bag<>(5);

        Produce apple = new Produce("Apple");
        bagOfProduce.add(new Produce("Tomato"));
        bagOfProduce.add(new Produce("Milk"));
        bagOfProduce.add(new Produce("Pear"));
        bagOfProduce.add(apple);
        bagOfProduce.add(new Produce("Orange"));
        bagOfProduce.add(new Produce("Kale"));
        bagOfProduce.add(new Fruit("Pineapple"));

        System.out.println("Apple? " + bagOfProduce.contains(apple));
    }
}
