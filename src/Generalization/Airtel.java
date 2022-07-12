package Generalization;

public  class Airtel implements TRAI {

	@Override
	public void call() {
		System.out.println("0.5rs/min");
		
	}

	@Override
	public void msg() {
		System.out.println("150 msg/day");
		
	}

	@Override
	public void data() {
		System.out.println("1.5gb/day");
		
		
	}
	public void newmethod_airtel()
	{
		System.out.println("Airtel new method");
	}

}
