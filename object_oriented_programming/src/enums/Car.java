package enums;

public class Car
{
    private String make;
    private String model;
    private String engine;

    public Car(String make, String model, String engine)
    {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public String getEngine()
    {
        return engine;
    }

    @Override
    public String toString()
    {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
