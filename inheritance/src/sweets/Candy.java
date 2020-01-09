package sweets;

public class Candy extends Sweet
{
    private String name;
    private double weight;

    public Candy()
    {
        name = "Skittles";
        weight = 0.1;
    }

    public Candy(String name, double weight)
    {
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
