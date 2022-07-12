package Inheritance;

public class SingleLevelInheritanceMotherSon {

	public static void main(String[] args) 
	{
	Mother m=new Mother();
	m.home();
	m.money();
	m.car();
	System.out.println("=================");
	Son s=new Son();
	s.mobile();
	s.laptop();
	s.money();
	s.home();
	s.car();
	System.out.println("=================");

	}

}
