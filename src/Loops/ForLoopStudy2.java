package Loops;

public class ForLoopStudy2 {

	public static void main(String[] args)
	{
		ForLoopStudy2 f = new ForLoopStudy2();
		f.name();
		f.table();
		f.table1();
		name1();
		//f.mul();
		//f.div();
	}


public void name()
{
	String name="Rudra";
	 for (int a=1;a<=5;a++)
	{
		System.out.println(name);
	}
	 
}
public void table()//13's table in incremental approach
{
	for(int p=13;p<=130;p=p+13)
	{
		System.out.println(p);
	}
}
public void table1()
{
	for(int b=140;b>=14;b=b-14 )
	{
		System.out.println(b);
	}
}
public static void name1()
{
	String name="anvi";
	for(int c=1;c<=5;c++)
	{
		System.out.println(name);
	}
}
//public void mul()
//{
//	for(int x=30;x<=60;x=x*0)
//	{
//		System.out.println(x);
//	}
//
//}
//public void div()
//{
//	for(int y=40;y<=40;y=y/2)
//	{
//		System.out.println(y);
//	}
//}




}