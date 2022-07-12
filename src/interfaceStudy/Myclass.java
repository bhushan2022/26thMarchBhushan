package interfaceStudy;
// interface and class is connected to each other with th help of implements keyword
public class Myclass implements Myinterface {

	public static void main(String[] args) 
	{
      Myclass m=new Myclass();
      m.test();
      m.test1();
	}

	@Override
	public void test() {
	System.out.println("test method is completed in implimentation class");
		
	}

	@Override
	public void test1() {
		System.out.println("test1 method completed in implementation class");
		
	}

	
		
	}


