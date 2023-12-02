
package practicingjavaprograms;

class Product
{
  private int item;
  private String  name;
  private int price;
  private int quantity;
 
  // Defoult Constructor
  public Product()
  {
      System.out.println("Default constructor Exicuted");
     item=0;
     name=null;
     price=0;
     quantity=0;    
  }
  //parametarised Constructor
  public Product(int i,String n,int p,int q)
  {
      /*item=i;  
      name=n;
      price=p;
      quantity=q;  */
     setDeal(i,n,p,q);
  }
  public void setDeal(int i,String n,int p,int q)
  {
      item=i;  
      name=n;
      price=p;
      quantity=q;
      System.out.println("Deal set Sucessfully....!!!");
 //     System.out.printf("i.e :item=%4$d,Name=%3$s,price=%2$d,Quantity=%1$d",quantity,price,name,item);
  }
}


public class PracticingJavaPrograms {

    
    public static void main(String[] args)
    {
        Product p=new Product();
        p.setDeal(1, "Patil",990000000, 10);
    }
    
}
