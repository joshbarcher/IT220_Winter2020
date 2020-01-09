package test;

import sweets.Candy;
import sweets.Cupcake;

public class SweetsDriver
{
    public static void main(String[] args)
    {
        Cupcake cake = new Cupcake("Vanilla", false, true);
        cake.setCalories(600);

        System.out.println(cake.getCalories());
        System.out.println(cake.getFrosting());

        Candy skittles = new Candy();
        System.out.println(skittles);
    }
}
