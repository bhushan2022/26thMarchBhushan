package ControlStatement;

public class Switchcase {

	public static void main(String[] args)
	{
		//1--> Welcome to 1st year Engg
		//2--> Welcome to 2nd year Engg
		//3--> Welcome to 3rd year Engg
		//4--> Welcome to 4th year Engg
		int year=4;
		
		switch(year)
		{
		case 1: System.out.println("Wc to 1st year Engg");
		break;
		case 2: System.out.println("Wc to 2nd year Engg");
		break;
		case 3: System.out.println("Wc to 3rd year Engg");
		break;
		case 4: System.out.println("Wc to 4th year Engg");
		break;
		default: System.out.println("please enter year between 1-4");
        }
		String days="Thursday";
		switch(days)
		{
		case "monday": System.out.println("monday is the 1st day of week");
		break;
		case "Tuesday": System.out.println("monday is the 2nd day of week");
		break;
		case "wednsday": System.out.println("monday is the 3rd day of week");
		break;
		case "Thursday": System.out.println("monday is the 4th day of week");
		break;
		default : System.out.println("please enter day in betwn monday to thursday ");
		}
		char grade='z';
		switch(grade) 
		{
		case 'A': System.out.println("you got marks>=75 then your grade is "+grade);
		break;
		default : System.out.println("you got marks<35 then you are fail ");
		}
		int count=100;
		
		switch(count)
		{
		case 100: System.out.println("you got above 75 % then u have got in ");
		break;
		case 60: System.out.println("you got above 60 % then u have got in ");
		break;
		case 50: System.out.println("you got above 50 % then u have got in ");
		break;
		default : System.out.println("you got below 35% then u are fail in this year ");
		break;
		}
		
	}

}
