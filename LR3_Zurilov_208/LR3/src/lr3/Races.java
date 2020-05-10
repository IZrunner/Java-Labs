package lr3;
import java.util.ArrayList;

public class Races 
{ 
    protected Races hatedRace;
    protected String raceName;
    
    Races()
    {
        
    }
    
    Races(String raceNameLocal)
    {
        this.raceName = raceNameLocal;
    }
    
    public void setHatedRace(Races localHatedRace)
    {
        this.hatedRace = localHatedRace;
        System.out.println("This race hates " + localHatedRace.raceName);             
    }
}
