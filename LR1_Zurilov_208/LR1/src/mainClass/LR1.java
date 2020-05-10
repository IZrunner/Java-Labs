package mainClass;
import java.util.Scanner;


public class LR1 
{  
    public static void main(String[] args) 
    {
        Scanner inputObj = new Scanner(System.in);
        /*//TASK 5//       
        System.out.print("Input size of the array : ");
        int arraySize = inputObj.nextInt();
        int[] sampleArray = new int[arraySize];

        System.out.print("Input the value to delete : ");
        int valueToDelete = inputObj.nextInt();
        
        sample_task5 firstObj = new sample_task5(arraySize, valueToDelete);
        firstObj.deleteValuesFromArr(sampleArray, arraySize, valueToDelete);
        */
          
        
        /*//TASK 9//
        System.out.print("Input a number from 0 to 5:");
        int numberVal = inputObj.nextInt();
        sample_task9 someObj = new sample_task9(numberVal);
        String otherWord = someObj.numToStr(numberVal);
        System.out.println("Our number in Main is " + otherWord);
        */;
        
        
        /*//TASK 11//
        System.out.print("Enter the value to split on digits: ");
        int numToSplit = inputObj.nextInt();
        int j;
        int sumOfDigits = 0;
        String numStr = String.valueOf(numToSplit);
        
        for(int i = 0; i < numStr.length(); i++) 
        {
            j = Character.digit(numStr.charAt(i), 10);
            sumOfDigits += j;
            System.out.println("digit: " + j);
        }       
        System.out.println("Sum of digits = " + sumOfDigits);
        */
        
        
        /*//TASK 13//    
        System.out.print("Input size of the array : ");
        int sortArraySize = inputObj.nextInt();
        int[] sortArray = new int[sortArraySize];
        for(int i = 0; i < sortArraySize; i++)
        {
            System.out.print("Input the value : ");
            sortArray[i] = inputObj.nextInt();
        }
        
        sample_task13 ob = new sample_task13(); 
        ob.sort(sortArray); 
        System.out.println("Sorted array"); 
        ob.printArray(sortArray); 
        */
        
        
        /*//TASK 19//       
        System.out.print("Type your string : ");
        String inpStr = inputObj.nextLine();
        System.out.println("Original String : " + inpStr);
        
        char temp;
        char[] arr = inpStr.toCharArray();
        int len = arr.length;
        for(int i=0; i<(inpStr.length())/2; i++,len--){
            temp = arr[i];
            arr[i] = arr[len-1];
            arr[len-1] = temp;
        }

        System.out.println("Reverse String :" + String.valueOf(arr));
        */
        
        
        
    }
    
    
}
