
import java.lang.*;
import java.util.Scanner;

public class PalindromeNumber { 
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a number:");
        
      int  num_To_Resverse=sc.nextInt();
        int initialize=num_To_Resverse;

           int reversedNum=0;
         while(num_To_Resverse!=0)
                 {
                   int r=num_To_Resverse%10;
                   
                  reversedNum=reversedNum*10+r;
                  num_To_Resverse=num_To_Resverse/10;
                  
                 }
         System.out.println("Reverse of "+initialize+" is "+reversedNum);
         
         // Lets continue the program for the palindrome number
         if (initialize==reversedNum)
         {
             System.out.println("Yes its a palindrome number!!");
         }
         else {
             System.out.print("its not a palindrome number");
         }
    }
  }
