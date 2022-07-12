package Methods;

public class TestMulDiv {
	
	public void mul()//non static regular method
	{
		int c=50;
		int d=60;
		int mul=c*d;
		System.out.println("multiplication of C & D is "+mul);
	}
	
	public static void div()//static regular method
	{
		int p=200;
		int q=20;
		int div=p/q;
		System.out.println("division of P & Q is "+div);
	}

}
