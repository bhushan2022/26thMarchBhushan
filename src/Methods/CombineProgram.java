package Methods;

public class CombineProgram {

	public static void main(String[] args)//main method
	{
		CombineProgram cp=new CombineProgram();
        cp.healthcare();
        tripplan();
		combine1 c1=new combine1();
		c1.school1();
		combine1.school();
		
		
	}
	public void healthcare()//non static method
	{
//patient name,doctor,bill,ward
		String Patient="yogesh";
		String doctor="vijay";
		long bill=123456;
		char ward='A';
		System.out.println("patient name is"+Patient);
		System.out.println("Doctor name is "+doctor);
		System.out.println("patient bill is "+bill);
		System.out.println("Ward is"+ward);
		}
public static void tripplan()//static method
{
//destination,vehicle,budget,members
	String destination="manali";
	String vehicle="bullet";
	long budget=123456;
	int members=10;
	System.out.println("destination is"+destination);
	System.out.println("vehicle is "+vehicle);
	System.out.println("budget is"+budget);
	System.out.println("members are "+members);


}
}
