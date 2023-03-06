public class Transformer extends Vehicle{

    private boolean isAutobot;

    public Transformer(String name, int wheels, boolean isAutobot)
    {
        super(name, wheels);
        this.isAutobot = isAutobot;
    }

    public void getAllegiance()
    {
        if (isAutobot)
        {
            System.out.println("I will vanquish evil and defend the Earth");
        }
        else
        {
            System.out.println("I'm totally NOT an evil killer robot disguised as a Camaro >:)");
        }
    }

    public void transform()
    {
        System.out.println("TRANSFORM");
    }
}
