package Abstract_Class;

public abstract class Phonepe extends Phonepay{
 public Phonepe() {
	
}
	public static void main(String[] args) 
	{
		//Phonepe p=new Phonepe();
      //  p.recharge();
       // p.send_money();
	}

	@Override
	void recharge() 
	{
	System.out.println(" This is completed method in cc class");
		
	}
	abstract void mobile_recharge();
  
}
