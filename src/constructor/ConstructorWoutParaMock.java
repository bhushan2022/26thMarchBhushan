package constructor;

public class ConstructorWoutParaMock 
{
	String name;
	float height;
	float percentage;
	long num;
public  ConstructorWoutParaMock()//without parameter method
	{
		name="Bhushan";
	    height=5.10f;
	    percentage=86.8f;
	    
	}
	public ConstructorWoutParaMock(String Student) 
	{
		name=Student;
		}
	public ConstructorWoutParaMock(String Student,float len)
	{
		name=Student;
		height=len;
	}
 
	public ConstructorWoutParaMock(long num1) 
	{
		num=num1;
	}
	public static void main(String[] args) 
	{
		ConstructorWoutParaMock c=new ConstructorWoutParaMock();
		c.info();
		ConstructorWoutParaMock c1=new ConstructorWoutParaMock("pradip");
		c1.info();
		ConstructorWoutParaMock c2=new ConstructorWoutParaMock("vijay", 5.11f);
	     c2.info();
	     ConstructorWoutParaMock c3=new ConstructorWoutParaMock(9890908798l);
	     c3.add();
	     System.out.println(SamplClass.n);//static variable calling from diffrent class
	     SamplClass s= new SamplClass();
	     System.out.println(s.name);
	}
 public void info() //non static regular method
 {
	 System.out.println(name);
	 System.out.println(height);
	System.out.println(percentage);
	System.out.println("=======================");
	 }
 public void add()
 {
	 System.out.println("mobile num is"+num);
 }
}
