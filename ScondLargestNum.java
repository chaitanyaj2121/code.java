
import java.lang.*;

public class ScondLargestNum { 
    
    public static void main(String[] args) 
    {
            
             //find the second largest element in an array
            int arr[]={5,57,55,556,54,44};
            
              int max1=arr[0];
              int max2=0;
              
              
          for (int i=0;i<arr.length;i++){
             
              if(arr[i]>max1)
              {
                  max2=max1;
                 max1=arr[i];
              }
              else if(arr[i]>max2) 
               {
                   max2=arr[i];
               }
          }   
    System.out.println("Second Largest Num is:"+max2);
    }
  }