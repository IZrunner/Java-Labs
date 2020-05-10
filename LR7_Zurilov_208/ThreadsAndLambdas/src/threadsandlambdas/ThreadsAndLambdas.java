/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsandlambdas;

import java.util.Arrays;
import java.util.List;

//class Incremenator extends Thread
//{
//	private volatile boolean isIncrementCheck = true;
//	private volatile boolean finishCheck = false;
//
//	public void changeAction()	
//	{
//		isIncrementCheck = !isIncrementCheck;
//	}
//	public void finish()
//	{
//		finishCheck = true;
//	}
//
//	@Override
//	public void run()
//	{
//		do
//		{
//                    if(!finishCheck)
//                    {
//			if(isIncrementCheck)
//                        {
//                            ThreadsAndLambdas.incrementedValue++; 	
//                        }						
//                        else
//                        {
//                            ThreadsAndLambdas.incrementedValue--;	
//                        }                                
//                        System.out.print(ThreadsAndLambdas.incrementedValue + " ");
//                    }
//                    else return;
//                    try
//                    {
//                        Thread.sleep(1000);	
//                    }
//                    catch(InterruptedException e){}
//		}
//		while(true); 
//	}
//}

/**
 *
 * @author USER_PC
 */

public class ThreadsAndLambdas 
{       
//    public static int incrementedValue = 0;	
//    static Incremenator incrementatorObj;	
    
    public static void execute(ThreadsAndLambdasInterface someObj) 
    {
        someObj.doSomething();
    }
    
    public static void main(String[] args) 
    {
//        incrementatorObj = new Incremenator();	
//      
//	System.out.print("Value = ");
//	incrementatorObj.start();
//		
//        for(int i = 1; i <= 3; i++)
//	{
//            try
//            {
//                Thread.sleep(i*2*1000); 
//            }
//            catch(InterruptedException e){}
//            incrementatorObj.changeAction();	
//	}
//        
//	incrementatorObj.finish();
        
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list.forEach(n -> System.out.println(n));
        
        execute(new ThreadsAndLambdasInterface() // execute() lets take lambdas as a parameter
        {
            @Override
            public void doSomething() 
            {
               System.out.println("Object's method called via anonymous class (old syntax)");
            }
        });
        execute( () -> System.out.println("Same object's method called via lambda (new syntax)") );
    }    
}
