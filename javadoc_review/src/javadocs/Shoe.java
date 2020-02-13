package javadocs;

/**
 * This class represents a shoe you can buy. The price of the
 * show must be positive.
 *
 * @author Josh Archer
 * @version 1.0
 */
public class Shoe extends Object
{
    //my shoes are interesting...
    private String brand;
    private String name;
    private double price;

    /**
     * Creates a new shoe with brand, name and price.
     *
     * @param brand the shoe brand
     * @param name the name
     * @param price the price, which must be positive
     *
     * @throws IllegalArgumentException thrown when the price is negative
     */
    public Shoe(String brand, String name, double price)
    {
        //defensive programming
        if (price < 0)
        {
            throw new IllegalArgumentException("Negative price not supported");
        }

        //assign my three fields
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    /**
     * Retrieves the shoe brand
     * @return the shoe brand
     */
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
     * Returns the brand of the shoe as a string
     * @return the brand name
     */
    @Override
    public String toString()
    {
        return "Shoe: " + brand;
    }
}
