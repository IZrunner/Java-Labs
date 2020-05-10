package mainClass;

public class sample_task9 
{
    public int targetNumber;
    public String destinationString;

    public sample_task9(int num)
    {
        this.targetNumber = num;
    }

    public String numToStr(int someVal)
    {
        switch (someVal)
        {
            case 0:
                destinationString = "null";
                break;
            case 1:
                destinationString = "one";
                break;
            case 2:
                destinationString = "two";
                break;
            case 3:
                destinationString = "three";
                break;
            case 4:
                destinationString = "four";
                break;
            case 5:
                destinationString = "five";
                break;
            default:
                destinationString = "beyond the oundaries";
        }
        System.out.println("Our number in method is " + destinationString);
        return destinationString;
    }
}
