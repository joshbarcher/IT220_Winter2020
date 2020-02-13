package javadocs;

/**
 * This class represents a shoe you can buy.
 *
 * @author Josh Archer
 * @version
 */
public class Shoe
{
    //my shoes are interesting...
    private String brand;
    private String name;
    private double price;

    /**
     *
     * @param brand
     * @param name
     * @param price
     */
    public Shoe(String brand, String name, double price)
    {
        //assign my three fields
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public String getBrand()
    {
        return brand;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString()
    {
        return "Shoe: " + brand;
    }
}
