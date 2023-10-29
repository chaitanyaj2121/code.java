import java.util.*;


public class Test {
    public static void main(String[] args) {
        //java program to find the roots of the quadratic equations
        // aX2+bx+c=o
        
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the element which is at the place of a:-");
        int a=sc.nextInt();
         System.out.print("enter the element which is at the place of b:-");
        int b=sc.nextInt();
        
        System.out.print("enter the element which is at the place of c:-");
          int c=sc.nextInt();
        // firts we are finding underroot b2-4ac 
      
         double root1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
         double root2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
         System.out.println("Roots of the Quadratic equations are:-"+root1+" "+root2);
         
    }

    
}
