class exception
{
 public static void main (String args[])
  {
    int a=5;
    int b=5;
    int x,y;
    try
    {
      x=(a+b)/(a-b);
    }
    catch(ArithmeticException e)
    {
     System.out.println("division by zero error");
     System.out.println("x is undefined");
    }
     y=(a-b)/(a+b);
    System.out.println("y="+y);
  }
}