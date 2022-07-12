package stringClassStudy;

public class ReverseName {

	public static void main(String[] args) 
	{
String name="BHUSHAN";
String rev="";
for(int a=name.length()-1;a>=0;a--)
	 rev=rev+name.charAt(a);
{
	System.out.println(rev);
	System.out.println(name.length());
}
    // 
     for(int i=1;i<=4;i++)
    {
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
      System.out.println();
}
	}

}
