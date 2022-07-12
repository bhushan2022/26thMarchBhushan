package Abstract_Class;

public class CC extends Sample {

	public static void main(String[] args)
	{
		CC c=new CC();//create object of concrete class
		//c.test();//method from sample
		c.test1();//method from cc
		c.demo();
		Sample.test();

	}

	@Override
	public void test1() 
	{
     System.out.println("This method is completed in CC class");
		
	}
	public void demo()
	{
		System.out.println("method from demo class");
	}

}
