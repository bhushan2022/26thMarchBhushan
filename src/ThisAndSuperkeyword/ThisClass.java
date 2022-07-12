package ThisAndSuperkeyword;

public class ThisClass {
	// this keyword is used to acess global variable for same class
	int a=10; // non static global variable
	static int b=99; // static global variable
	
	public static void main(String[] args) 
	{
		ThisClass t=new ThisClass();
		t.test();

	}
  public void test()
  {
	  int a=100; // local variable
	 System.out.println("loacal value of a is "+a);
	 System.out.println("global value of a is "+this.a);
	 int add1=1+a; // a is local variable
	 System.out.println("value of addition1 is "+add1);
	 int add2=1+this.a;
	 System.out.println("value of addition2 is "+add2);
	 //static int b=8; we can create static method in non static method
	 System.out.println(this.b);
  }
  }

