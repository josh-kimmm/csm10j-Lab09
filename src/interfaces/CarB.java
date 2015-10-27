package interfaces;


public class CarB implements Drivable
{
    protected boolean power = false;
    
    @Override
    public void Start()
    {
        System.out.println("Starting vehicle");
        power = true;
    }
    
    @Override
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
