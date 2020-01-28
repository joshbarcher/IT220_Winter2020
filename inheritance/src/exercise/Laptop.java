package exercise;

public class Laptop implements Seeable
{
    private String cpu;
    private int gigsRam;
    private String brand;

    public Laptop(String cpu, int gigsRam, String brand)
    {
        this.cpu = cpu;
        this.gigsRam = gigsRam;
        this.brand = brand;
    }

    @Override
    public void lookAt()
    {
        System.out.println("The laptop buzzes");
    }

    @Override
    public void stareIntentlyAt()
    {
        System.out.println("The laptop buzzes");
    }

    public String getCpu()
    {
        return cpu;
    }

    public int getGigsRam()
    {
        return gigsRam;
    }

    public String getBrand()
    {
        return brand;
    }

    @Override
    public String toString()
    {
        return "Laptop{" +
                "cpu='" + cpu + '\'' +
                ", gigsRam=" + gigsRam +
                ", brand='" + brand + '\'' +
                '}';
    }
}
