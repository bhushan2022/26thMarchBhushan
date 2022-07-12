package Loops;

public class DoWhileLoopStudy {

	public static void main(String[] args) {
		// hii Good morning 10 times
		int a=1;
		do
		{
			System.out.println("hii Good morning");
			a++;
		}
		while(a<=10);
		System.out.println("************************");
      
		// i want to print 5 table in reverse order
		int i=50;
		do {
			System.out.println(i);
			i=i-5;
		}
		while(i>=5);
	}

}
