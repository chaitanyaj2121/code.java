import java.lang.*;
import java.util.Scanner;

public class NumberWordConverter { 
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a number:");
     
        String str="";
            int  num=sc.nextInt();
        
        
            int r;
         for(;num!=0;)
         {
              r=num%10;
             str=str+r;
             num=num/10;
         }
         char c;
        for (int i=str.length()-1;i>=0;i-- )
        {
            c=str.charAt(i);
            
            switch(c)
            {
                case '0': {
                    System.out.print(" ZERO");
                      break;
                }
                case '1': {
                    System.out.print(" one");
                      break;
                }
                case '2': {
                    System.out.print(" Two");
                      break;
                }
                case '3': {
                    System.out.print(" Three");
                      break;
                }
                case '4': {
                    System.out.print(" four");
                      break;
                }
                case '5': {
                    System.out.print(" five");
                      break;
                }
                case '6': {
                    System.out.print(" six");
                      break;
                }
                case '7': {
                    System.out.print(" seven");
                      break;
                }
                case '8': {
                    System.out.print(" eight");
                      break;
                }
                case '9': {
                    System.out.print(" nine");
                      break;
                }
            }
            
           }
        
    }
  }
