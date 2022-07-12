package stringClassStudy;

public class StringStudy1 {

	public static void main(String[] args) {
		
		String s="velocity";
		//without using keyword constant pool area
		String s1="velocity";
		String s2="vel";
		String s3="Test";
		
		String m= new String("velocity");
		String m1= new String("VELOCITY");
		String m2= new String("");
		String m3= new String("Java class");
		
		System.out.println(s==s1);//true
		System.out.println(s==m);//false
		System.out.println(m1.equals(m));//true

	}

}
