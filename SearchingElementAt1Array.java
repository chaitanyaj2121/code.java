
package practisingstring;
import java.util.Scanner;


public class Practising1DArray {
 
   
    public static void main(String[] args) 
    {
     int []a = {1,2,3,3,6,7};
     int sum=0;
     System.out.println("There are:"+(a.length-1)+" Index in the program");
     for(int i=0;i<a.length;i++)
     { 
                if(6==a[i])
                 {
                    System.out.println("Element is Found at index:"+(i));
                   
                 } 
                else if(i<a.length)
                {
                    System.out.println("Element is Not Found at index:"+i);
                }   
      }
   }
}
