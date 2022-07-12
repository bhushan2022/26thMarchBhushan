package ControlStatement;

public class Else_If_Study1 {

	public static void main(String[] args) {
		
		int marks=31;
		if(marks>=60 & marks<100)
		{
			System.out.println("you are in dist");
		}
		else if(marks>=50 & marks<60)
		{
			System.out.println("you are in 1st class");
		}
		else if(marks>=40 & marks<50)
		{
			System.out.println("you are pass");
		}
		else if(marks<40 & marks>30)
		{
			System.out.println("you are fail because your marks range in betwn 30 to 40");
		}
   String name="sury";
   String colour="whit";
   if(name=="surya") 
   {
	   System.out.println("the variable is match then print"); 
   }
   else if(colour=="white")
   {
	 System.out.println("print white"); 
   }
   else
   {
	   System.out.println("invalid input");
   }
	}
}


