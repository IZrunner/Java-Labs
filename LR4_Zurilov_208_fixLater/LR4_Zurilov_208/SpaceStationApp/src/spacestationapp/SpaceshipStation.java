package spacestationapp;
import java.util.ArrayList;

public class SpaceshipStation 
{
    protected String stationName; 
    protected int shipsLimit = 10;
    protected int stationWeightLimit;
    protected int toTurianHateLevel = 0;
    protected int toCroganHateLevel = 0;
    protected int commonHateLevel = toTurianHateLevel + toCroganHateLevel;
    protected int toTurianHateLimit = shipsLimit / 3;
    protected int toCroganHateLimit = toTurianHateLevel;
    protected int acceptedHateLimit = toTurianHateLimit + toCroganHateLimit;
    public ArrayList <Spaceship> shipsOnStation = new ArrayList <>();
    protected Data buffObj = new Data();
    
    
    public SpaceshipStation()
    {
        this.stationName = "Pilgrim";
        this.stationWeightLimit = 1000;
    }
    
    public SpaceshipStation(String name, int shipsLimit , int weight)
    {
        this.stationName = name;
        this.shipsLimit = shipsLimit;
        this.stationWeightLimit = weight;
    }   
    
    public void letIn(Spaceship newShip)
    {   
        if(newShip.shipWeight < this.stationWeightLimit && this.shipsLimit != 0 && this.commonHateLevel < this.acceptedHateLimit)
        {
            this.shipsOnStation.add(newShip);
            this.stationWeightLimit -= newShip.shipWeight;
            this.shipsLimit --;   
            if(newShip.pilot == "Human")
            {
                this.toTurianHateLevel++;
            }
            else if(newShip.pilot == "Turian")
            {
                this.toCroganHateLevel++;
            }     
            System.out.println("Welcome, dear guests from " + newShip.shipName + " !!!");
            System.out.println("Please, don't fool around too much here");
        }              
        else
        {
            reportReason();
        }
    }
    
    public void letOut(Spaceship newShip)
    {
        this.shipsOnStation.remove(newShip);
        this.stationWeightLimit += newShip.shipWeight;
        this.shipsLimit ++;      
        if(newShip.pilot == "Human")
        {
                this.toTurianHateLevel--;
        }
        else if(newShip.pilot == "Turian")
        {
            this.toCroganHateLevel--;
        }     
        System.out.println("See you, space cowboy...");
    }
    
    /*
    public void riotCheck(Spaceship newShip)
    {
        if(newShip.pilot.equals(buffObj.localUniverse.get(3)))
        {
            System.out.println("We cannot keep rebel crew on board ! "
                    + "\nPlease, leave the staton or we'll force you to do so !");
            letOut(newShip);
        } else {
        }
    }
    */
    
    public void reportReason()
    {      
        if(this.commonHateLevel > this.acceptedHateLimit)
        {
            System.out.println("The station is too dangerous for newcoming guests !");
        }     
        else if(this.shipsLimit == 0)
        {
            System.out.println("The station is overwhelmed !");
        }
        else
        {
            System.out.println("The station is overburdened !");        
        }
    }
    
    @Override
    public String toString()
    {
        return stationName;
    }    
}