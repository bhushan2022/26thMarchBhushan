package interfaceStudy;

public class Myclass1 implements Myinterface2 {

	public static void main(String[] args) 
	{
		Myclass1 m=new Myclass1();
		m.test();
		m.test1();
		m.test3();
		m.test4();
		

	}

	@Override
	public void test() {
	System.out.println("test method is in myintrface but complete in demo class");
		
	}

	@Override
	public void test1() {
		System.out.println("test1 method is in myintrface but complete in demo class");
		
	}

	@Override
	public void test3() {
		System.out.println("test3 method is in myintrface2 but complete in demo class");
		
	}

	@Override
	public void test4() {
		System.out.println("test4 method is in myintrface2 but complete in demo class");
		
	}


		
	}


