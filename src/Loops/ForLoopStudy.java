package Loops;

public class ForLoopStudy {

	public static void main(String[] args) {
		// I want to print number 0-10 & increment by 1
		
		for(int a=0;a<=10;a++)//incremental approach
		{
			System.out.println(a); 
		}
		System.out.println("===========================");
		
        // I want to print 2's Table
		
		for(int a=2;a<=20;a=a+2) //incremental approach
		{
		System.out.println(a);	
		}
		System.out.println("============================");
		
		// I want to print number 10-0 & start at 10 decrement by 1
		
		for (int a=10;a>=0;a--) // decremental approach
		{
			System.out.println(a);
		}
		System.out.println("============================");
		// I want to print 5's table in reverse order
		
		for(int b=50;b>=5;b=b-5) // decremental approach
		{
			System.out.println(b);
		}
		System.out.println("=============================");
		// i want to print velocity 5 times
		
		for(int a=1;a<=5;a=a+1) 
		{
		System.out.println("velocity");	
		}
	}

}
