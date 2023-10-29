import java.lang.*;

// practising bitwise operaters 

class Test
{
    public static void main (String ...args)
    {
        int x=-8;
        double y;
        
        /* Left shift operation
        we can say that directly it multiplies x by 2^k  */ 
        int k=2;
        y=x<<k;
        System.out.println(y);
        
        /*right shift operation 
         we can say that directly divides  x by 2^k 
        */
           y=x>>k;
      System.out.println(y);
         /*Unsigned right shift operation  */
        
         y=x>>>k;
      System.out.println(y);
      
      /*not operation  operation 
         we can say that x is incremented by 1 and multiplied by (-)sign */
        y=~x;
      System.out.println(y);
    }
            
}
