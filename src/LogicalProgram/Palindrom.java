package LogicalProgram;

public class Palindrom {

	public static void main(String[] args) {
         int rev=0;
         int num=1234;
         int palindrom;
         int no=0;
         while(num!=0)
         {
        	 palindrom=rev*no+num%10;
        	 num=num/10;
        	 System.out.print(palindrom);
         }
         System.out.println();
         
         
         
	}

}
