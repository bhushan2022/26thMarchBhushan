package TypesOfVariable;

public class GlobalAndLocalvariable {
	 int a=100;//global non static variable
	 static int b=200;//global static variable

	public static void main(String[] args) 
	{
		int a=10;//local non static variable
		System.out.println(a);
		GlobalAndLocalvariable gac=new GlobalAndLocalvariable();//create object of class
		System.out.println("the value of a is "+gac.a);//calling non static global variale from same class
		System.out.println("the value of b is "+b);//calling static variable from same class
		System.out.println("value of static global variale from another class "+Test.y);
		// calling static global variable from another class
		Test t=new Test();
		System.out.println("value of non static global variable from another class "+t.x);
		//calling non static global variale from another class
		
		int mul=b*gac.a;//calling method from same class
		int div=b/Test.y; // calling method from another class
		int addition=gac.a+t.x; // calling both static method from different class
			System.out.println(mul);
			System.out.println(div);
			System.out.println(addition);
			
			gac.addition();
			gac.sub();
	
		
  
	}
public void addition() //non static regular method
{
	int p=10; // local variale
	int sum=p+10;// p is local variable known to addtion method only
	System.out.println(sum);
	int sum1=a+500; // a is global variable known to whole class
	System.out.println("the value of addition mthod is "+sum1);
	}
public void sub()
{
	int q=20;
	System.out.println("===============");
	System.out.println(q);
	//int sub1=p-q;//p is local variable for another method
	int sub1=a-20;//a is global variable known as whole class
	System.out.println("*****************");
	System.out.println(sub1);
	
}
}
