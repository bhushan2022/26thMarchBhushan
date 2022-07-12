package LogicalPattern;

public class E14Butterfly {

	public static void main(String[] args) 
	{
		//*         *
		//**       **
		//***     ***
		//****   ****
		//***** *****
		//****   ****
		//***     ***
		//**       **
		//*         *
		
		int star1=1; //star on 1st row left
		int space1=5;//space on 1st row left
		int star2=1; // star on 1st row right
		int space2=4; // space on 1st row right
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=star1;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=space2;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star2;j++)
			{
				System.out.print("*");
			}
			if(i<5)
			{
				star1++;
				space1--;
				star2++;
				space2--;
				
			}
			else
			{
			star1--;
			space1++;
			star2--;
			space2++;
				
			}
			System.out.println();
		}

	}

}
