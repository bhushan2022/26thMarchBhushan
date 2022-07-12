package casting;

public class UpCasting {

	public static void main(String[] args) 
	{
		Father f=new Father();
		f.bike();
		f.car();
		f.money();
		System.out.println("========================");
		
		Son s=new Son();
		s.bike();
		s.car();
		s.education();
		s.money();
		System.out.println("========================");
		
		Father f1=new Son();
		f1.bike();
		f1.car();
		f1.money();
		System.out.println("=========================");
		
		

	}

}
