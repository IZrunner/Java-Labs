package lr2;
public enum Posts {
    Boss(10), Manager(7), Worker(3);
    
    private int salary; 
    private String[] DaysOfWeek = {
        "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    };
    private String[] WorkerRestDays = new String[7];
    
    Posts(int setSalary)
    {
        this.salary = setSalary;
    }
    
    public void SetNewSalary(int setNewSalary)
    {
        this.salary = setNewSalary;
    }
    
    public void SetRestDaysOfWeek(int start, int end)
    {
        int bufRestDaysAmount = 0;
        for(int i = start; i <= end; i++)
        {                 
            WorkerRestDays[bufRestDaysAmount] = DaysOfWeek[i];
            System.out.println("Day " + bufRestDaysAmount + " is " + DaysOfWeek[i]);
            bufRestDaysAmount ++;
        }
    }
    } 