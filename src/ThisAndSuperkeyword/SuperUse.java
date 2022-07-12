package ThisAndSuperkeyword;

public class SuperUse extends A {
	int p=120; // global variable from super use class

	public static void main(String[] args) 
	{
	SuperUse s=new SuperUse();
	s.test();

	}
	public void test()
	{
		int p=1; // local variable
		System.out.println("local value of p is "+p);
		System.out.println("Global value of p from same class is "+this.p);
		System.out.println("Global value of p from different class is "+super.p);
		System.out.println(super.q);
	}

}
