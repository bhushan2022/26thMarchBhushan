package LogicalProgram;

public class RevString {

	public static void main(String[] args) 
	{  
		// Reverse String
		String name="BHUSHAN";
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
        }
		System.out.println(rev);

		
		
		// palindrom
		 int org=253;
		 int rev1=0;
		 int rem;
		 while(org!=0)
		 {
			 rem=org%10;
			 rev1=rev1*10+rem;
			 org=org/10;
		 }
		 System.out.println(rev1);
		

	}

}
