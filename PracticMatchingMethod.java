
package PracticMatchingMethod;
import java.util.Scanner;

public class PracticMatchingMethod {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
       

    String str;
       
           do{
               
        System.out.print("Enter password.........!!!:-");
        str =sc.next();
       
       boolean b= str.matches("@Chaitanya");
      
    if (b)
    {
        System.out.println("Welcome Chaitanya");
    }
    else 
    {
        System.out.println("Wrong Password ");   
    }
     }
    while(!str.matches("@Chaitanya"));
           
       
    
    
}
}
