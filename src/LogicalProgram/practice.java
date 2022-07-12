package LogicalProgram;

public class practice {

	public static void main(String[] args) 
	{
		// reverse string
		String name="BHUSHAN";
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		
		// palindrom
		int org=987;
		int rev1=0;
		int rem;
		while(org!=0)
		{
			rem=org%10;
			rev1=rev1*10+rem;
			org=org/10;
		}
		System.out.println(rev1);
		
		// even numbrs
		 for(int j=0;j<=20;j++)
		 {
			 if(j%2==1)
			 {
				 System.out.println(j);
			 }
		 }
		 
		 // ascending order
		 for(int a=0;a<=5;a++)
		 {
			 for(int b=0;b<=a;b++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
