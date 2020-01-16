package exercise;

public class Driver
{
    public static void main(String[] args)
    {
        Sandwich pbAndJ = new Sandwich("wheat",
                new String[0], false);
        Sandwich meatAndCheese = new Sandwich("rye",
                new String[] {"salami", "pastrami"}, true);
        Laptop laptop = new Laptop("Intel I9", 16, "MSI");

        //group together objects that use the Seeable interface
        Seeable[] thingsToSee = {pbAndJ, meatAndCheese, laptop};
        for (int i = 0; i < thingsToSee.length; i++)
        {
            thingsToSee[i].stareIntentlyAt();
        }

        //group together objects that use the Smellable interface
        Smellable[] smellyThings = {pbAndJ, new Sock("white", "cotton", false)};
        for (int i = 0; i < smellyThings.length; i++)
        {
            smellyThings[i].smell();
        }
    }
}
