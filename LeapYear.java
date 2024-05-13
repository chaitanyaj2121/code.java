
import java.lang.*;

public class LeapYear { 
    
    public static void main(String[] args) 
    {
        int year=2011;
        if (year%4==0)
        {
            if (year%100==0)
            {
                if (year%400==0)
                {
                  System.out.println("yes its a leap year");
                  
                }
                else{
                  System.out.println("No its not a leap year");  
                }
            }
            else{
                System.out.println("Yes its a leap year");
            }
            
        }
        else{
            System.out.println("Its not a leap year");
        }
    }
  }
