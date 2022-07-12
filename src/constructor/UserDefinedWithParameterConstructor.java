package constructor;

public class UserDefinedWithParameterConstructor {
	int a;
	int b;
	int c;
	
     public UserDefinedWithParameterConstructor()//user defined constuctor without parameter constructor
{
	a=10;
	b=20;
	c=30;
} 
   public UserDefinedWithParameterConstructor(int x) //user defined constuctor with one parameter constuctor
   {
	   a=x;
   }
   public UserDefinedWithParameterConstructor(int x,int y) //user defined constuctor with two parameter constuctor
   {
	   a=x;
	   b=y;
   } 
   public UserDefinedWithParameterConstructor(int x,int y,int z) //user defined constuctor with two parameter constuctor
   {
	   a=x;
	   b=y;
	   c=z;
	   
   }
	public static void main(String[] args) {
		UserDefinedWithParameterConstructor udc= new UserDefinedWithParameterConstructor();
		udc.addition();
		UserDefinedWithParameterConstructor udc1= new UserDefinedWithParameterConstructor(100);
		udc1.addition();
		UserDefinedWithParameterConstructor udc2= new UserDefinedWithParameterConstructor(100,200);
        udc2.addition();
        UserDefinedWithParameterConstructor udc3= new UserDefinedWithParameterConstructor(100,200,300);
        udc3.addition();
    	UserDefinedWithParameterConstructor udc4= new UserDefinedWithParameterConstructor();
    	udc4.div();
    	UserDefinedWithParameterConstructor udc5= new UserDefinedWithParameterConstructor(250,2500);
    	udc5.div();
    	
    	  
	}
	public void addition()
	{
		int sum=a+b+c;
		System.out.println("Addition is "+sum);
	}
	public void div()
	{
		int div=b/a;
		System.out.println("The division of a & b is "+div);
	}

}
