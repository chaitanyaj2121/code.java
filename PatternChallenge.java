
package practisingstring;
import java.util.Scanner;


public class PractisingString {
 
   
    public static void main(String[] args) 
    {
       
       Scanner sc=new Scanner (System.in);
             
    for (int i=5;i>=1;i--)
    {
        for(int k=1;k<=i-1;k++)
        {
          System.out.print(" ");
        }
        for(int  j=i;j<=5;j++)
        {
          System.out.print("*");
        }
         for(int j=i;j<=5-1;j++)
        {
          System.out.print("*");
        }
         System.out.printf("\n"); 
    }
    for(int i=1;i<=5;i++)
    {
      for (int k=1;k<=i;k++)
      {
          System.out.print(" ");
      }
      for(int j=4;j>=i;j--)
      {
          System.out.print("*");
      }
      for(int j=4-1;j>=i;j--)
      {
          System.out.print("*");
      }
      
      
      System.out.println("");
    }
    
    }
}
