package LogicalProgramClass;

public class ReverseMiddleString {

	public static void main(String[] args) 
	{
		String s="I LOVE MY INDIA";
		
		String ar[]=s.split(" ");
		
		for(int i=0;i<ar.length-1;i++)
		{
			if(i%2!=0)
			{
				String s1=ar[i];
				ar[i]=revstr(s1);
			}
		}
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]+" ");
		}

	}
	public static String revstr(String input)
	{
		String rev="";
		for(int i=input.length()-1;i>=0;i--)
		{
			rev=rev+input.charAt(i);
		}
		return rev;
	}

}
