package exercise;

import java.util.Arrays;

public class Sandwich implements Seeable, Smellable
{
    private String bread;
    private String[] meats;
    private boolean hasCheese;

    public Sandwich(String bread, String[] meats, boolean hasCheese)
    {
        this.bread = bread;
        this.meats = meats;
        this.hasCheese = hasCheese;
    }

    @Override
    public void smell()
    {
        System.out.println("yummy");
    }

    @Override
    public boolean smellsGood()
    {
        return true;
    }

    @Override
    public void lookAt()
    {
        System.out.println("The sandwich doesn't move");
    }

    @Override
    public void stareIntentlyAt()
    {
        System.out.println("The sandwich looks nervous");
    }

    public String getBread()
    {
        return bread;
    }

    public String[] getMeats()
    {
        return meats;
    }

    public boolean isHasCheese()
    {
        return hasCheese;
    }

    @Override
    public String toString()
    {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", meats=" + Arrays.toString(meats) +
                ", hasCheese=" + hasCheese +
                '}';
    }
}
