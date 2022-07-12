package stringClassStudy;

public class StringPractice {

	public static void main(String[] args) {
		String name="BHUShan";
		String name1=new String("RUDra");
		
		// by using length method
		System.out.println(name);
		System.out.println(name.length());
		int a = name.length();
		int a1 = name1.length();
		System.out.println("In name of bhushan character is "+a);
		System.out.println("In name of Rudra character is "+a1);
		System.out.println("*************************");
		
		// by using touppercase() method
		System.out.println("************************");
		System.out.println(name.toUpperCase());
		System.out.println(name1.toUpperCase());
		System.out.println("***********************");
		String b = name.toUpperCase();
		System.out.println("BHUShan is convvert into uppercase is "+b);
		String b1 = name1.toUpperCase();
		System.out.println("RUDra is convert into uppercase is "+b1);
		System.out.println("*************************");
		

	}

}
