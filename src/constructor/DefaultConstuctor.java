package constructor;

public class DefaultConstuctor {
	//public DefaultConstuctor()
	
	{
		
		//default constructor-->created by compiler
		System.out.println("im defaultconstrictor");
	}

	public static void main(String[] args) 
	{
		DefaultConstuctor dc = new DefaultConstuctor();//created object of class 
       dc.name();
	}
public void name()
{
	String name="Bhushan";
	System.out.println("My name is "+name);
}

}
