package mainClass;
import java.util.Scanner;

public class sample_task5 
{
    Scanner inputObj = new Scanner(System.in);
    public int arraySize;
    public int valueToDelete;

    public sample_task5(int size, int valDelete)
    {
        this.arraySize = size;
        this.valueToDelete = valDelete;
    }
    
    public int[] deleteValuesFromArr(int[] someArr, int arrSize, int delVal)
    {
        for(int i = 0; i < arrSize; i++)
        {
            System.out.print("Input the value : ");
            someArr[i] = inputObj.nextInt();
        }

        System.out.println(" ");

        for(int i = 0; i < arrSize; i++)
        {
            if(someArr[i] == delVal)
            {         
               for(int j = i; j < arrSize-1; j++)
               {
                   someArr[j] = someArr[j+1];
               }
               //i++;   
               //break;
               continue;
            }          
        }

        for(int i = 0; i < arrSize; i++)
        {
            System.out.print(someArr[i] + " ");
        }
        return someArr;
    }    
}
