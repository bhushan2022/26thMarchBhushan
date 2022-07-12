package constructor;

public class UserDefConstructorWoutPractice {
	
	String name;
    String name1;
	String name2;
	public UserDefConstructorWoutPractice() 
	{
		name="pqr";
		name1="abc";
		name2="xyz";
	}
	
	public UserDefConstructorWoutPractice(String cat) 
	{
	name2=cat;

	}
	public UserDefConstructorWoutPractice(String cat,String mat)
	{
		name=cat;
		name1=mat;
		
	}

	public static void main(String[] args) 
	{
		UserDefConstructorWoutPractice uu=new UserDefConstructorWoutPractice();
		uu.info();
		UserDefConstructorWoutPractice uu1=new UserDefConstructorWoutPractice("abc");
	    uu1.info();
	    UserDefConstructorWoutPractice uu2=new UserDefConstructorWoutPractice("laptop", "pc");
	    uu2.info();

	}

	public void info()
	{
	
	System.out.println(name);
	System.out.println(name1);
	System.out.println(name2);
	System.out.println("=================");
	}
	
		
		
		
		
	
}
