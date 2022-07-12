package array;

public class MultiDimensionalArray2 {

	public static void main(String[] args) {
		
		String name[][]= {{"velocity","corporate","Traning"},{"centre","katraj","pune"}};
		
		for(int i=0;i<=1;i++)// for row
		{
			for(int j=0;j<=2;j++)// for column
			{
				System.out.print(name[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("==============================");
		String name1[][]= {{"bhushan","Ramdas","Jadhav"},{"rudra","sandip","satre"},{"anvi","sandip","satre"}};
   
		for(int a=0;a<=2;a++)
    {
    	for (int b=0;b<=2;b++)
    	{
    		System.out.print(name1[a][b]+" ");
    	}
    	System.out.println();
    }
    System.out.println("=======================================");
	}

}
