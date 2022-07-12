package array;

public class Array1 {

	public static void main(String[] args) {
		// we are going to use in character in array
		// A,B,C,D,E
		
		//1.Array declaration
		char grade[]=new char[7];
		
		//2.Array initialization
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		grade[6]='G';
		//grade[7]='G';we have to put above value which is declared on array declaration that time
		//we observed error of boudary value exception
		//3.usage
		System.out.println(grade[0]);
		System.out.println(grade[1]);
		System.out.println(grade[2]);
		System.out.println(grade[3]);
		System.out.println(grade[4]);
		System.out.println(grade[5]);
		System.out.println(grade[6]);
		System.out.println("=========================================");
		
		for(int i=0;i<=6;i++) // This is using static code
		{
			System.out.println(grade[i]);
		}
		System.out.println("**************************************");
		
		for(int i=0;i<=grade.length-1;i++) // dynamic coding accending order
		{
			System.out.println(grade[i]);
		}
		System.out.println("===========================================");
		
		for(int i=grade.length-1;i>=0;i--) // dynamic coding decending order
		{
			System.out.println(grade[i]);
		}
		
		
	}

}
