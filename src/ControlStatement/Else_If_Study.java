package ControlStatement;

public class Else_If_Study {

	public static void main(String[] args) {
		// if marks>=60----> you are in dist
		// if marks>=50---->you are in 1st class
		// if marks>=40----> you are only pass
		int marks=50;
		if(marks>=60) 
		{
			System.out.println("you are in dist");
		}
		else if(marks>=50)
		{
			System.out.println("you are in first class");
		}
		else if(marks>=40)
		{
			System.out.println("you are pass");
		}
		else {
			System.out.println("you are fail");
		}
	}

}
