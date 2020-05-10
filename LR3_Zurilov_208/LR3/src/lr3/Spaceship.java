package lr3;

public class Spaceship 
{
    protected String shipName;
    protected int shipWeight;
    protected Races pilot;
    protected int raceIndex;
    protected LR3 buffObj = new LR3();
    
    public Spaceship()
    {
        this.shipName = "Normandy";
        this.shipWeight = 250;
        this.pilot = buffObj.localUniverse.get(0);
    }
    
    public Spaceship(String name, int weight, Races pilotRace)
    {
        this.shipName = name;
        this.shipWeight = weight;
        this.pilot = pilotRace;
    }
        
    public void changePilot(int pilotRaceIndx)
    {   
        System.out.println("Here 0 is 'Human', 1 is 'Turian', 2 is 'Crogan', 3 is 'Crowd'");    
        switch(pilotRaceIndx)
        {
            case 0:
            this.pilot = buffObj.localUniverse.get(0);            
            System.out.println("Changed to " + this.pilot.raceName);
            break;
            
            case 1:
            this.pilot = buffObj.localUniverse.get(1);           
            System.out.println("Changed to " + this.pilot.raceName);
            break;
            
            case 2:
            this.pilot = buffObj.localUniverse.get(2);
            System.out.println("Changed to " + this.pilot.raceName);
            break;
            
            case 3:
            this.pilot = buffObj.localUniverse.get(3);
            System.out.println("Changed to " + this.pilot.raceName);
            break;
            
            default:
            this.pilot = buffObj.localUniverse.get(3);            
            System.out.println("Changed to " + this.pilot.raceName + ". Let's make a riot!!!");
            break;
        }       
    }
    
    public void setRiot()
    {
        this.pilot = buffObj.localUniverse.get(3);
        System.out.println("This boat is not good, the " + this.pilot.raceName + " is now the captain");     
    }

}