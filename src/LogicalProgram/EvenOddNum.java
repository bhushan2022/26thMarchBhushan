package LogicalProgram;

public class EvenOddNum {

	public static void main(String[] args) 
	{
		// To findout Even number
		for(int i=2;i<=20;i++)
		{
			if( i%2==0)
			{
				System.out.println(i);
			}
			
		}
		System.out.println("=========================");
		
		// TO findout odd number
		for(int j=1;j<=20;j++)
		{
			if(j%2==1)
			{
				System.out.println(j);
			}
		}
		System.out.println("=========================");
		 
		// To findout even no but decending order
		for(int a=20;a>=2;a--)
		{
			if(a%2==0)
			{
				System.out.println(a);
			}
		}

	}

}
