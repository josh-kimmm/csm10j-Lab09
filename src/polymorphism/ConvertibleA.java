package polymorphism;


public class ConvertibleA extends CarA
{
    private boolean carTop = true;
    
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
