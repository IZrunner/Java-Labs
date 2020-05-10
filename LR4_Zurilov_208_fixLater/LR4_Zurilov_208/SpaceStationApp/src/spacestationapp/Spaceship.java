package spacestationapp;

public class Spaceship 
{
    protected String shipName;
    protected int shipWeight;
    protected String pilot;  
    protected Data buffObj = new Data();
    
    public Spaceship()
    {
        this.shipName = "Normandy";
        this.shipWeight = 250;
        this.pilot = "Optimus Prime";
    }
    
    public Spaceship(String name, int weight, String pilotRace)
    {
        this.shipName = name;
        this.shipWeight = weight;
        this.pilot = pilotRace;
    }  

    @Override
    public String toString()
    {
        return shipName;
    }    
}