package FinalKeyword;

public class Test
{
 int a=100;
 final int b=10;
 
	public static void main(String[] args)
	{
	Test t=new Test();
	t.add();

	}
  public void add()
  {
	  a=a+10;
	  System.out.println("The addition of non static loacal variable is "+a);
	  // b=b+10 We cant update the value in final variable
	  System.out.println("The value of final global variable is "+b);
	  
  }
}
