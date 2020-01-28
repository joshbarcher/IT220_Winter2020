package pets;

public class ExoticPet extends Pet
{
    private boolean illegal;

    public ExoticPet(String name, String nickname, double weight, int age,
                     boolean illegal)
    {
        super(name, nickname, weight, age);
        this.illegal = illegal;
    }

    public boolean isIllegal()
    {
        return illegal;
    }

    @Override
    public String toString()
    {
        return "ExoticPet{" + super.toString() +
                ", illegal=" + illegal +
                '}';
    }
}
