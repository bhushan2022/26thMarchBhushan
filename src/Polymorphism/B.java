package Polymorphism;
 // here we are using run time polymorphism
public class B extends A
{

	public static void main(String[] args) 
	{
		B b=new B();  // by using run time polymorphism we are calling the both method in main method
		b.Test();
		A a=new A(); // The method name is same so that is why we are using polymorphism
		a.Test();
		
		

	}
   public void Test()
   {
	   System.out.println("Automation Testing");
   }
}
