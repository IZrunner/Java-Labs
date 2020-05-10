package lr2;
import java.util.Scanner;
import java.util.Arrays;

public class LR2 { 
    public static void main(String[] args) 
    {
        /*//TASK_22
        try //ArithmeticException
        {
        int i = 0 / 0;
        }
        catch (ArithmeticException e) 
        {
        e.printStackTrace();
        int i = 0;
        }
        */
        
        
        /*//TASK_25
        Posts.Boss.SetNewSalary(500);
        Posts.Boss.SetRestDaysOfWeek(0, 6);
        System.out.println("-----------------");
        Posts.Manager.SetRestDaysOfWeek(2, 5);
        */
        
        
        //TASK_29
        Gym buffObj = new Gym();
        GymMembers VasyaPupkin = new GymMembers("Vasya Pupkin");    
        buffObj.CheckClosetsQuantity();
        VasyaPupkin.setAbility(false);
        VasyaPupkin.setPermission(buffObj);
        buffObj.SetClosetsQuantity(25);
        
        System.out.println("----------------------------------");
        
        GymMembers PyotrAlekseevich = new GymMembers("Pyotr Alekseevich");
        buffObj.CheckClosetsQuantity();
        PyotrAlekseevich.setAbility(true);
        PyotrAlekseevich.setPermission(buffObj);
        buffObj.CheckClosetsQuantity();
        
        
        
        /*//TASK_33
        Scanner scanObj = new Scanner(System.in);
	System.out.println("Enter size of int array:");
	int size = scanObj.nextInt();
	int[] intArray = new int[size];
        int index;
        
	for (int i = 0; i < size; i++) 
        {
            System.out.println("Please enter int value at index " + i + ":");
            intArray[i] = scanObj.nextInt();
	}
        
        try //ArrayIndexOutOfBoundsException
        {
            System.out.println("Enter array index to get the value:");
            index = scanObj.nextInt();
            scanObj.close();
            System.out.println("Value at " + index + " = " + intArray[index]);
        }
	catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("This index is beyond the bounds of array! Default is 0");
            index = 0;
            System.out.println("Value at " + index + " = " + intArray[index]); 
        }
	
        System.out.println("");
        
        String sampleText;
        try //NullPointerException
        {
            sampleText = null;
            System.out.println("Get hash-code of the magestic string : " + sampleText.hashCode());
        }
        catch (NullPointerException ex)
        {
            System.out.println("You can't get sring's hash-code, because the string is empty!");
            sampleText = "sample text";
            System.out.println("But now it's possible : " + sampleText.hashCode());
        }
        
        System.out.println("");
        
        String unmanagedString = "java";
        try //IndexOutOfBoundsException
        {
            System.out.println("Get the char at string's 12-th position : ");
            System.out.println(unmanagedString.charAt(12));    
        }
        catch (IndexOutOfBoundsException ex)
        {
            System.out.println("Wrong index, it's more than the strin's size! Default index is 0");
            System.out.println("Char at 0 position is " + unmanagedString.charAt(0));
        }
        
        System.out.println("");
        
         try 
         {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } 
        catch (Exception ex) 
        {
            System.out.println("Something went wrong.");
        }
        */
        
        
        /*//TASK_36
        //Scanner scanObj = new Scanner(System.in);
        System.out.print("Enter the date in format D-M-Y : ");
        String strYear = scanObj.nextLine();  
        
        String[] bufYear = strYear.split("-"); 
        int[] intYear = new int[bufYear.length];
        int dayIndex, numberOfDaysInMonth;
        
        
        for(int i = 0; i < bufYear.length; i++)
        {
            intYear[i] = Integer.parseInt(bufYear[i]); 
            System.out.println(intYear[i]);
            
            if(i == intYear.length - 1)
            {
                if (((intYear[intYear.length - 1] % 4 == 0) && (intYear[intYear.length - 1] % 100 != 0)) || (intYear[intYear.length - 1] % 400 == 0))
                {
                    //System.out.println("Specified year is a leap year");
                    switch (intYear[1]) 
                    {
                    case 1: 
                        //January   
                        numberOfDaysInMonth = 31;
                        dayIndex = intYear[0];       
                        System.out.println("Your day's index is " + dayIndex);
                        break;
                        
                    case 2: 
                        //February     
                        numberOfDaysInMonth = 29;
                        dayIndex = 31 + intYear[0];            
                        System.out.println("Your day's index is " + dayIndex);                             
                        break;
                        
                    case 3: 
                        //March   
                        numberOfDaysInMonth = 31;
                        dayIndex = 60 + intYear[0];
                        System.out.println("Your day's index is " + dayIndex);
                        break;
                        
                    case 4: 
                        //April                  
                        numberOfDaysInMonth = 30;
                        dayIndex = 91 + intYear[0];                       
                        System.out.println("Your day's index is " + dayIndex);
                        break;
                        
                    case 5: 
                        //May                       
                        numberOfDaysInMonth = 31;
                        dayIndex = 121 + intYear[0];
                        
                        System.out.println("Your day's index is " + dayIndex);
                        break;
                        
                    case 6:
                        //June
                        numberOfDaysInMonth = 30;
                        dayIndex = 152 + intYear[0];
                        
                        System.out.println("Your day's index is " + dayIndex);
                        break;
                        
                    case 7:
                        //July
                        numberOfDaysInMonth = 31;
                        dayIndex = 182 + intYear[0];
                        
                        System.out.println("Your day's index is " + dayIndex);
                        break;
                        
                    case 8:
                        //August
                        numberOfDaysInMonth = 31;
                        dayIndex = 213 + intYear[0];
                        
                        System.out.println("Your day's index is " + dayIndex);
                        break;
                        
                    case 9:
                        //September
                        numberOfDaysInMonth = 30;
                        dayIndex = 244 + intYear[0];
                        
                        System.out.println("Your day's index is " + dayIndex);
                        break;
                        
                    case 10:
                       //October
                        numberOfDaysInMonth = 31;
                        dayIndex = 274 + intYear[0];
                        
                        System.out.println("Your day's index is " + dayIndex);
                        break;
                        
                    case 11:
                        //November
                        numberOfDaysInMonth = 30;
                        dayIndex = 305 + intYear[0];
                        
                        System.out.println("Your day's index is " + dayIndex);
                        break;
                        
                    case 12:
                        //December
                        numberOfDaysInMonth = 31;
                        dayIndex = 335 + intYear[0];
                        System.out.println("Your day's index is " + dayIndex);
                    }
                }
                else
                {
                    //System.out.println("Specified year is not a leap year");
                    switch (intYear[1]) 
                    {
                    case 1: 
                        //January   
                        numberOfDaysInMonth = 31;
                        dayIndex = intYear[0];       
                        System.out.println("Your day's index is " + dayIndex);
                        break;
                        
                    case 2: 
                        //February       
                        numberOfDaysInMonth = 28;
                        dayIndex = 31 + intYear[0];
                        System.out.println("Your day's index is " + dayIndex);                                 
                        break;
                        
                    case 3: 
                        //March   
                        numberOfDaysInMonth = 31;
                        dayIndex = 59 + intYear[0];
                        System.out.println("Your day's index is " + dayIndex);
                        break;
                        
                    case 4: 
                        //April                  
                        numberOfDaysInMonth = 30;
                        dayIndex = 90 + intYear[0];                       
                        System.out.println("Your day's index is " + dayIndex);
                        break;
                        
                    case 5: 
                        //May                       
                        numberOfDaysInMonth = 31;
                        dayIndex = 120 + intYear[0];
                        
                        System.out.println("Your day's index is " + dayIndex);
                        break;
                        
                    case 6:
                        //June
                        numberOfDaysInMonth = 30;
                        dayIndex = 151 + intYear[0];
                        
                        System.out.println("Your day's index is " + dayIndex);
                        break;
                        
                    case 7:
                        //July
                        numberOfDaysInMonth = 31;
                        dayIndex = 181 + intYear[0];
                        
                        System.out.println("Your day's index is " + dayIndex);
                        break;
                        
                    case 8:
                        //August
                        numberOfDaysInMonth = 31;
                        dayIndex = 212 + intYear[0];
                        
                        System.out.println("Your day's index is " + dayIndex);
                        break;
                        
                    case 9:
                        //September
                        numberOfDaysInMonth = 30;
                        dayIndex = 243 + intYear[0];
                        
                        System.out.println("Your day's index is " + dayIndex);
                        break;
                        
                    case 10:
                       //October
                        numberOfDaysInMonth = 31;
                        dayIndex = 273 + intYear[0];
                        
                        System.out.println("Your day's index is " + dayIndex);
                        break;
                        
                    case 11:
                        //November
                        numberOfDaysInMonth = 30;
                        dayIndex = 304 + intYear[0];
                        
                        System.out.println("Your day's index is " + dayIndex);
                        break;
                        
                    case 12:
                        //December
                        numberOfDaysInMonth = 31;
                        dayIndex = 334 + intYear[0];
                        System.out.println("Your day's index is " + dayIndex);
                    }
                } 
            }
        }
        */ 
    }
}