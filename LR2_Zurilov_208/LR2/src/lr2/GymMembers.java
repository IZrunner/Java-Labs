package lr2;
public class GymMembers implements Gymable 
{
    private boolean isAbleToWorkOut;
    //private static int closetsQuantity = 20;
    private String clientName;
    //private Gym buffObj = new Gym();
    
    
    public GymMembers(String someName)
    {
        this.clientName = someName;
        System.out.println("Hello, mr(ms) " + clientName + "!!!");
    }
    
    
    @Override
    public void setAbility(boolean localAbility) 
    {
        isAbleToWorkOut = localAbility;
    }

    @Override
    public void setPermission(Gym buffObj) 
    {
        if(isAbleToWorkOut == true && buffObj.closetsQuantity != 0)
        {
            buffObj.closetsQuantity -= 1;
            System.out.println("Welcome to the gym! Work hard and build yourself a body of a Greek God!");
        }   
        else
        {     
            System.out.println("Sorry, we're out of places now! But, for the start, you can try not to eat so much or read some books!");
        }
    }
    
    
}