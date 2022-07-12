package Methods;

public class TestAddSub {

	public static void main(String[] args)
	{
		//calling method for same class
	TestAddSub t= new TestAddSub();//created object for same class
	t.addition();//calling non static method from same class
    sub();//callling static method from same class
    TestMulDiv t1 = new TestMulDiv();//created object for different class
    t1.mul();//calling non static method from different class
    TestMulDiv.div();//calling static method from different class
	}

	public void addition()// This is non static regular method
	{
		int x=900;
		int y=500;
		int sum=x+y;
		System.out.println("Addition of X & Y is "+sum);
	}
	public static void sub()//static regular method
	{
		int a=50;
		int b=30;
		int sub=a-b;
		System.out.println("substraction of A & B is "+sub);
		
	}
}
