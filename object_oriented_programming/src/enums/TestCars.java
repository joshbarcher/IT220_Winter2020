package enums;

public class TestCars
{
    public static void main(String[] args)
    {
        Car bug = new Car("Volkswagon", "Bug", "V4");
        Car van = new Car("Honda", "Odyssey", "V6");

        if (bug.getMake() == "Volkswagon")
        {
            System.out.println("Nice car!");
        }

        if (van.getModel() == "Oddyssey")
        {
            System.out.println("Where you going in that van?");
        }

        if (van.getEngine() == "v6")
        {
            System.out.println("That car has some \"get up and go\"");
        }
    }
}
