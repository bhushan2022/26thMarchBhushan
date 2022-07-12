package LogicalProgramClass;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) 
	{
     // num/2=0 ----> even
	 // num/2=1 -----> odd
		
		//System.out.println(10%2=0);
		//System.out.println(10/2=5);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int a= sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Given number is even number");
		}
		else
		{
			System.out.println("Given number is odd number");
		}

	}

}
