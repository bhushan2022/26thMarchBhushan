package TypesOfVariable;

public class EmployeInfo1 
{
String name;String designation;float experience;long mobinum;char rating;//global non static variable
static String name1="Saurabh Jadhav";
static String designation1 ="eng";
static float experience1=1.1f;

public void info()
{
	System.out.println("============================");
	System.out.println("Name              :- "+name);
	System.out.println("Dept              :- "+designation);
	System.out.println("Experince         :- "+experience+" year");
	System.out.println("Mobinum           :- "+mobinum);
	System.out.println("Rating            :- "+rating);
	System.out.println("============================");

}
}

