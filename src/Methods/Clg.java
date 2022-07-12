package Methods;

public class Clg {
	
	public void dept() //non static method without parameter
	{
		// student name,count,branch,div,sub
		String name="bhushan";
		int count=60;
		String branch="mech";
		char div='A';
		int sub=5;
		System.out.println("**************************");
		System.out.println("The student name is "+name);
		System.out.println("The total count of student is"+count);
		System.out.println("The branch is "+branch);
		System.out.println("The div is"+div);
		System.out.println("Total su is"+sub);
		System.out.println("***************************");
		}
	public void dept1(String name,int count,String branch,char div,int sub) //non static with parameter
	{
		System.out.println("=================");
		System.out.println("The student name is "+name);
		System.out.println("The total count of student is"+count);
		System.out.println("The branch is "+branch);
		System.out.println("The div is"+div);
		System.out.println("Total su is"+sub);	
		System.out.println("===================");
		}

}
