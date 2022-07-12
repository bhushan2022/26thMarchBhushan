package Sanket;

public class Maximum {

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,80,45};
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
