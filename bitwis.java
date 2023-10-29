class Test 
{
    public static void main (String...args)
    {
        /*program for swapping of 2 numers whithout using  3rd temp variable
      this is done by using bitwise X-OR perater*/
        
       int a=5;
       int b=12;
       a=a^b;
       b=a^b;
       a=a^b;
       System.out.print("a is:"+a+"  b is:"+b);  
       
  }
}
