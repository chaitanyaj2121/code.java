class Test 
{
    public static void main (String...args)
    {
        /*program for storing 2 values in one variable
      this is done by using Masking and Merging */
        
        byte  c;
       c=(byte)(9<<4);
    
       c=(byte)(c|12); 
       
       System.out.println((c&0b11110000)>>4);// o/p :-9
       
       System.out.println((c&0b00001111));// o/p :-12
  }
}
