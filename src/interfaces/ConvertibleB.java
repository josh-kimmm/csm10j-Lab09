package interfaces;


public class ConvertibleB implements Drivable
{
        private boolean power = false, carTop = true;
    
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
    
    public void PutTopUp()
    {
        if(!carTop)
        {
            System.out.println("Putting top up");
            carTop = true;
        }
        else
        {
            System.out.println("Top is already up");
        }
    }
    
    public void PutTopDown()
    {
        if(carTop)
        {
            System.out.println("Putting top down");
            carTop = false;
        }
        else
        {
            System.out.println("Top is already down");
        }
    }
    
}
