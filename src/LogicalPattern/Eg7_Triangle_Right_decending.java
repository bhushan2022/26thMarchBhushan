package LogicalPattern;

public class Eg7_Triangle_Right_decending {

	public static void main(String[] args) 
	{
		//    *
		//   **
        //  ***
		// ****
		//*****
		// row=5,column=5;star=1;space=4
		int space=4; // space in first row space=4
		int star=1;  // star on first row star=1
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star++;
		}
		
		
		
		
		
		
	}

}
