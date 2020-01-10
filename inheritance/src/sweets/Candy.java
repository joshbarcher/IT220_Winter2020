package sweets;

public class Candy extends Sweet
{
    private String name;
    private double weight;

    public Candy(boolean homemade, int calories,
                 String name, double weight)
    {
        super(homemade, calories);
        this.name = name;
        this.weight = weight;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    @Override
    public String toString()
    {
        return "Candy{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
