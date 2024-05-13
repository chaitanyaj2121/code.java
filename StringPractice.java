

import java.lang.*;

public class StringPractice { 
    
    public static void main(String[] args) 
    {
         String str1=new String ("Chaitanyajawanjal21@gmail.com");
         if (str1.matches("\\w*@gmail(.*)"))
         {
             System.out.println("yes its gmail!1");
             int num=str1.indexOf('@');
             System.out.println("Username:"+str1.substring(0, num));
         }
         else
         {
             System.out.println("Its not an gmail account!!");
         }
    }
  }
