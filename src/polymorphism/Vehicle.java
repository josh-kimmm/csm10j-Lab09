package polymorphism;


public abstract class Vehicle {
    
    protected boolean power = false;
    
    public void Start()
    {
        System.out.println("Starting vehicle");
        power = true;
    }
    public void Drive()
    {
        if(power)
        {
            System.out.println("Driving vehicle");
        }
        else
        {
            System.out.println("Start the vehicle first");
        }
    }
}
