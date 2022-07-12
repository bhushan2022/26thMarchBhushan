package casting;

public class Son extends Father 
{
public void car()
{
	System.out.println("honda civic");
}
public void bike()
{
	System.out.println("jawa");
}
public void education()
{
	System.out.println("BE");
}
public void money()
{
	double c=55.50;
	int d=(int) c;
	System.out.println("This is explicit ex in son class value c is"+c);
	System.out.println("This is explicit ex in son class value d is"+d);
}
}
