package lr2;
public class Gym 
{
    public int closetsQuantity = 20;
    
    public Gym() {}
    
    public void SetClosetsQuantity(int someValue)
    {
        closetsQuantity = someValue;
    }
    
    public void CheckClosetsQuantity()
    {
        System.out.println("There are " + closetsQuantity + " free closets avaliable now");
    } 
    
}
