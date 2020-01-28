package pets;

public class AquaticPet extends Pet
{
    private String environment;

    public AquaticPet(String name, String nickname, double weight, int age,
                      String environment)
    {
        super(name, nickname, weight, age);
        this.environment = environment;
    }

    public String getEnvironment()
    {
        return environment;
    }

    @Override
    public String toString()
    {
        return "AquaticPet{" + super.toString() +
                ", environment='" + environment + '\'' +
                '}';
    }
}
