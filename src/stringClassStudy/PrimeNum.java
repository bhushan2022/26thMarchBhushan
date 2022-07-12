package stringClassStudy;

public class PrimeNum {

	public static void main(String[] args) {
		
		// how to calculate prime no
		//a whole number greater than 1 whose only factors are 1 and itself.
		for(int no=1;no<=20;no++)
		{
			int temp=0;
			for(int i=2;i<=no-1;i++)
			{
				if(no%i==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(no);
			}
		}

	}

}
