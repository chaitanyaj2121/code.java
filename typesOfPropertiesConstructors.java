
package practisingstring;
class Rectangle
{
    private double length;
    private double breadth;
    
   public Rectangle()
   {
       length=1;
       breadth=1;
   }
   public Rectangle(int l,int b)
   {
       setLength(l);
       setBreadth(b);
       
   }
   public Rectangle(Rectangle copy)
   {
       System.out.println("Copy Constructor Called/");
       copy.length=length;
       copy.breadth=breadth;
   }
    public  double getLength()
    {
    return length;
    }
    public void setLength(double x)
   {
       if (x>0)
       { 
          length=x;
       }
       else
       {
           length=0;
       }
   }
    public  double getBreadth()
    {
    return breadth;
    }
    public void setBreadth(double x)
    {
       if (x>0)
       { 
          breadth=x;
       }
       else
       {
           breadth=0;
       }
    }
    public double  area()
    { 
        return length*breadth;
    }
}
public class PractisingString {
    
    public  static void main(String[] args)
 { 
      Rectangle r=new Rectangle (10,15);
     
       r.setLength(7);
      r.setBreadth(6);
       
   
System.out.println("Area is :"+r.area());   
 }
               
}

