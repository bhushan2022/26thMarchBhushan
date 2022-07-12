package AccessSpecifiers;

public class velocity {

	public static void main(String[] args)
	{
		velocity v=new velocity();
		v.test1();// calling private method---> (visible only within class)
		v.test2();;// calling default method---> ( visible within package)
		v.test3(); // calling protected method--->(visible only within package--> inheritance will provide out of package
	    v.test4(); // calling public method--->(visible throughout project)
	}
	private void test1()
	{
		System.out.println(" I am private method test 1");
	}
	void test2()
	{
		System.out.println(" I am default method test 2");
	}
	protected void test3()
	{
		System.out.println(" I am protected method test 3");
	}
	public void test4()
	{
		System.out.println(" I am public method test 4");
	}

}
