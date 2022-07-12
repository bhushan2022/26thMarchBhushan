package constructor;

public class UserDefinedConstructor 
{
	int a;//1.variable declaration
	int b;//1.variable declaration
	int c;//1.variable declaration
	public UserDefinedConstructor()
	{
		//user defined constructor
		//The constructor is called when an object of class is created
		System.out.println("Hi user define constructor is running");
		//2.initialize data member/variable
		a=200;
		b=170;
		c=150;
		}

	public static void main(String[] args) 
	{
		UserDefinedConstructor ud= new UserDefinedConstructor();
       ud.add();
       ud.sub();
	}
   public void add()//non static regular method
   {
	  int sum=a+b;//value of a & b will e received from constructor
	  System.out.println("The addition of A & B is "+sum);
	    
      int sum1=a+c;
	   System.out.println("The addition of A & C is "+sum1);
   }
   public void sub()
   {
	  int sub=a-c;
	  System.out.println("The sustraction of A & C is "+sub);
	  
	  int sub1=b-c;
	  System.out.println("The sustraction of B & C is "+sub1);
	   
   }
}
