package ControlStatement;

public class Nested_if_2 {

	public static void main(String[] args) {
	// age=18 & weight=50 then you are eligible for blood donation
	int age=18;
	int weight=40;
	if(age>=18)
	{
		System.out.println("you are eligible");
		if(weight>=50)
		{
			System.out.println("you can donate the blood ");
		}
		else
		{
			System.out.println("you are not eligible for blood ");
		}
		
	}
	   else
	{
		System.out.println("your age must be greater than 18 ");
	}

	}

}
