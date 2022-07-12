package array;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
	int rollnum[]= {6,2,4,1,5,3}; // combine declaration & initialization 
	
	//3.usage
	for(int i=0;i<=rollnum.length-1;i++) 
	{
		
		System.out.println(rollnum[i]); // by using dynamic code
	}
	System.out.println("=====================================");
	
	// how to sort given in array
	// we need to use sort method
	
	Arrays.sort(rollnum); // by use of acending order
	for(int i=0;i<=rollnum.length-1;i++)
	{
		System.out.println(rollnum[i]);
	}
	System.out.println("=====================================");
	 for(int i=rollnum.length-1;i>=0;i--)
	 {
		 System.out.println(rollnum[i]);
	 }
	 System.out.println("====================================");
	 
	 char cs[]=new char[7];
	 cs[0]='b';
	 cs[1]='h';
	 cs[2]='u';
	 cs[3]='s';
	 cs[4]='h';
	 cs[5]='a';
	 cs[6]='n';
	 
	 for(int c=6;c>=0;c--)
	 {
		 System.out.println(cs[c]);
	 }
	 System.out.println("********************");
	 for(int j=cs.length-1;j>=0;j--)
	 {
		 System.out.print(cs[j]);
	 }
	 System.out.println("==========================");
	 
	 char rs[]= {'R','U','D','R','A'};
	 for(int a=4;a>=0;a--)
	 {
		 System.out.print(rs[a]);
	 }
	
	 }
	 
	
}


