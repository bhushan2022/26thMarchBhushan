package Sanket;

public class Palindrom {

	public static void main(String[] args)
	{
		{
     String name="nayan";
     String reverse="";
     int i;
     int leng=name.length();
     for( i=leng-1;i>=0;i--)
     {
    	 reverse=reverse+name.charAt(i);//"nayan"
     }
     if(name.equals(reverse))
     {
    	 System.out.println("palindrom");
     }
     else
     {
    	 System.out.println("not palindrom");
     }
		}
	}
}
     
     
    

