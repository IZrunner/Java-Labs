package lr3;
import java.util.ArrayList;

public class LR3 
{
    public ArrayList <Races> localUniverse = new ArrayList <>();
    public void main(String[] args) 
    {
        /*
        Змоделювати Космічну станцію = Піллігрім =, яка може приймати космічні кораблі 
        використовуючи певні правила. Перше правило-на станції не може одночасно перебувати 
        більше 10 кораблів. Кораблі можуть відповідно прилітати і відлітати зі станції. Кожен 
        корабель управляється екіпажами з різних зоряних систем, різними рассами (турианца, земляни, ходакейци).
        Туріанци не люблять ходакейцев, земляни не люблять турианца, ходакекйцам все одно. 
        Відповідно це треба враховувати при прийомі кораблів. І останнє правило-станція має 
        обмеження по сумарній масі кораблів, які нах. на станції, тобто якщо прибув корабель 
        і з ним буде перевищено цей показник - його не можна прийняти. Треба формувати звіт 
        по кораблям за період, які нах. на станції та  по кораблям, яким було відмовлено в
        доступі із зазначенням причини..  
        */
        
        Races Human = new Races("Human");
        Races Turian = new Races("Turian");
        Races Crogan = new Races("Crogan");
        Races Crowd = new Races("Crowd");
        
        Human.setHatedRace(Turian);
        Turian.setHatedRace(Crogan);                
    
            
        localUniverse.add(Human);
        localUniverse.add(Turian);
        localUniverse.add(Crogan);
        localUniverse.add(Crowd);
      
        //SapceshipStation.racesOnStation.addAll(localUniverse);        
        SapceshipStation Piligrim = new SapceshipStation();
        Spaceship Purge = new Spaceship();
        
        
        System.out.println("---------------------------");
        
        Piligrim.letIn(Purge);
        System.out.println("There are " + Piligrim.shipsLimit + " places left on the station");
        
        System.out.println(Purge.pilot.raceName);
        Purge.changePilot(1);
        Purge.setRiot();
        Piligrim.riotCheck(Purge);
       
        
        System.out.println("---------------------------");
        
        Spaceship HappyDelivery = new Spaceship("Happy Delivery", 1500, localUniverse.get(3));
        Piligrim.letIn(HappyDelivery);             
    }
    
}
