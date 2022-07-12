package TypesOfVariable;

public class EmployeInfo {

	public static void main(String[] args) 
	{
	EmployeInfo1 e=new EmployeInfo1();
	e.name="Bhushan Jadhav";
	e.designation="Software Tester";
	e.experience=2.2f;
	e.mobinum=7083360899l;
	e.rating='A';
	e.info();
	
	EmployeInfo1 e1=new EmployeInfo1();
	e1.name="Prasad Yadav";
	e1.designation="Software Tester";
	e1.experience=1.4f;
	e1.mobinum=8376895321l;
	e1.rating='B';
	e1.info();
	System.out.println("============================");
	System.out.println("Name                 :- "+EmployeInfo1.name1);
	System.out.println("Designation          :- "+EmployeInfo1.designation1);
	System.out.println("Experince            :- "+EmployeInfo1.experience1);
    System.out.println("=============================");
	
	
	
	

	}

}
