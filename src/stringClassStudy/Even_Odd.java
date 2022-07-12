package stringClassStudy;

public class Even_Odd {

	public static void main(String[] args) {
    // how to chck odd and even numbers
		int no=96;
		if (no%2==0)
		{
			System.out.println("=============");
		}
		else
		{
			System.out.println("*************************");
		}
		
		// To print odd & even no upto 20
		System.out.println("Even number");
		for(int a=2;a<=20;a++)
		{
			if(a%2==0)
			{
				System.out.println(a);
			}
			System.out.println("======================");
			System.out.println("odd number");
			for (int b=1;b<=20;b++)
			{
				if(b%2==1)
				{
					System.out.println(b);
				}
			}
		}
		
	}

}
