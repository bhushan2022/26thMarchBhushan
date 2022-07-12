package LogicalProgramClass;

public class FactorialNumber {

	public static void main(String[] args) 
	{
      //4!---->4*3*2*1=24
		
		int a =6;
		int b=1;
		
		for(int i=a;i>=1;i--)
		{
			b=b*i; //6*1=6,6*5=30,4*30=120,3*120=360,2*360=720
		}
		System.out.println("factorial of number is "+b);
	
	
	int c=5;
	int d=1;
	
	for(int j=c;j>=1;j--)
	{
		d=d*j;
	}
	System.out.println("Factorial number is "+d);

}
}
