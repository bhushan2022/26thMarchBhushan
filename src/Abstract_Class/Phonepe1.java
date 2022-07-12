package Abstract_Class;

public class Phonepe1 extends Phonepe{

	public static void main(String[] args)
	{
		Phonepe1 p1= new Phonepe1();
		p1.send_money();
		p1.recharge();
		p1.mobile_recharge();

	}

	@Override
	void mobile_recharge() 
	{
	
		System.out.println("This is mobile recharge method in cc ");
	}
  
}
