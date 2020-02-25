package tests;

import lists.LinkedList;

public class TestMyList
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        System.out.println(list.size());
        System.out.println(list.contains("a"));
        System.out.println(list.contains("c"));
        System.out.println(list.contains("e"));
        System.out.println(list.contains("f"));
        System.out.println();

        //access elements by index
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.get(list.size() - 1));
    }
}
