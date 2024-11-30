
package main;

import java.lang.*;

public class Meta_characters_Rugular_Expressions { 
    
    public static void main(String[] args) 
    {
        String str1="abcd1234";
        
        System.out.println("1."+str1.matches("."));
        
        System.out.println("2."+str1.matches("a||b||c"));
        
        System.out.println("6."+str1.matches("[a||b||c]"));
        
        System.out.println("3."+str1.matches("[abc]"));
        
        System.out.println("7."+str1.matches("abc*"));
           
        System.out.println("4."+str1.matches("[^abc]"));
        
        System.out.println("5."+str1.matches("[a-z0-9A-Z]"));
        
        System.out.println("is digit?:"+str1.matches("\\d"));
        
        System.out.println("is a digit at multiple times??:"+str1.matches("\\d*"));
        
        System.out.println("is a digit at 10 times??:"+str1.matches("\\d{10}"));
        
        System.out.println("is not a digit?:"+str1.matches("\\D"));
        
        System.out.println("is not a digit at multiple times?:"+str1.matches("\\D*"));
        
        System.out.println("is a space?:"+str1.matches("\\s"));
        
        System.out.println("is a space at multiple times?:"+str1.matches("\\s*"));
        
        System.out.println("is not a space?:"+str1.matches("\\S"));
        
        System.out.println("is not a space at multiple times?:"+str1.matches("\\S*"));
        
        System.out.println("is str alphabate or digit?:"+str1.matches("\\w"));
        
        System.out.println("is str alphabate or digit at multiple times?:"+str1.matches("\\w*"));
        
        System.out.println("is str not alphabate or digit?:"+str1.matches("\\W"));
        
        System.out.println("is str not alphabate or digit at multiple times?:"+str1.matches("\\W*"));
    }
    
  }
