package sorting.pets;

public class Pet
{
    private String name;
    private String nickname;
    private double weight;
    private int age;

    public Pet(String name, String nickname, double weight, int age)
    {
        this.name = name;
        this.nickname = nickname;
        this.weight = weight;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public String getNickname()
    {
        return nickname;
    }

    public double getWeight()
    {
        return weight;
    }

    public int getAge()
    {
        return age;
    }

    @Override
    public String toString()
    {
        return "Pet{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
