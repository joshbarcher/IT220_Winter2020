package exercise;

public class Sock implements Smellable
{
    private String color;
    private String material;
    private boolean noShow;

    public Sock(String color, String material, boolean noShow)
    {
        this.color = color;
        this.material = material;
        this.noShow = noShow;
    }

    @Override
    public void smell()
    {
        System.out.println("smells awful");
    }

    @Override
    public boolean smellsGood()
    {
        return false;
    }

    public String getColor()
    {
        return color;
    }

    public String getMaterial()
    {
        return material;
    }

    public boolean isNoShow()
    {
        return noShow;
    }

    @Override
    public String toString()
    {
        return "Sock{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", noShow=" + noShow +
                '}';
    }
}
