package assistedPracticeProject;

interface First 
{  
    default void view() 
    { 
        System.out.println("First excution"); 
    } 
} 
interface Second 
{  
    default void view() 
    { 
        System.out.println("Second excution"); 
    } 
}  
public class Diamondproblem implements First, Second 
{  
    public void view() 
    {  
        First.super.view(); 
        Second.super.view(); 
    } 
    public static void main(String args[]) 
    { 
    	Diamondproblem DP = new Diamondproblem(); 
        DP.view(); 
    } 
}


