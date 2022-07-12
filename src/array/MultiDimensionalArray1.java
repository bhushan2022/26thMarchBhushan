package array;

public class MultiDimensionalArray1 {

	public static void main(String[] args) {
	  //int a[]=new int[3]; array declaration
		
		int a[][]=new int [2][2]; //array declaration
		// array asign value
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		
		// usage
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println("===========================");
		
		//usage using for loop
		for(int i=0;i<=1;i++) // for row // 0,1 outer
		{
			for(int j=0;j<=1;j++) // for column //0,1,2//inner
			{
				System.out.print(a[i][j]+" ");//0,0->1//0,1->2//1,0->3//1,->4
			}
			System.out.println();
			
		}
		System.out.println("=================================");
		
		int b[][]= {{10,20,30},{40,50,60}};
		
		for(int c=0;c<=1;c++)
		{
			for(int d=0;d<=2;d++)
			{
				System.out.print(b[c][d]+" ");
			}
			System.out.println();
		}
		System.out.println("=================================");
		
	}

}
