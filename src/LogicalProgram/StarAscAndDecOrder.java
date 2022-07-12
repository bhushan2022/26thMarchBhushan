package LogicalProgram;

public class StarAscAndDecOrder {

	public static void main(String[] args) {
		// by using of ascending order
		String a="*";
		for(int i=1;i<=5;i++) // only show for Row
		{
			for(int j=1;j<=i;j++) // only show for column
			{
				System.out.print(a);
			}
			System.out.println();
		}
		System.out.println("================================");
		
		// by using of decnding order
		for(int b=1;b<=5;b++)
		{
			for(int c=5;c>=b;c--)
			{
				System.out.print("*");
			}
		System.out.println();
			
		}
		
	}
}

	


