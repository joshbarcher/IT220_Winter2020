package sweets;

public class Cupcake extends Sweet
{
    private String frosting;
    private boolean hasWrapper;
    private boolean hasFilling;

    public Cupcake()
    {
        frosting = "Chocolate";
        hasFilling = true;
        hasWrapper = true;
    }

    public Cupcake(String frosting, boolean hasWrapper,
                   boolean hasFilling)
    {
        this.frosting = frosting;
        this.hasWrapper = hasWrapper;
        this.hasFilling = hasFilling;
    }

    public String getFrosting()
    {
        return frosting;
    }

    public boolean isHasWrapper()
    {
        return hasWrapper;
    }

    public boolean isHasFilling()
    {
        return hasFilling;
    }

    @Override
    public String toString()
    {
        return "Cupcake{" +
                "frosting='" + frosting + '\'' +
                ", hasWrapper=" + hasWrapper +
                ", hasFilling=" + hasFilling +
                '}';
    }
}
