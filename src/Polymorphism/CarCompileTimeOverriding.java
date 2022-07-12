package Polymorphism;

public class CarCompileTimeOverriding {

	public static void main(String[] args)
	{
	CarMaruti M= new CarMaruti();
	M.tyre();
	M.tyre("4 seat", 5);
	CarTata T=new CarTata();
	T.tyre();
	T.tyre(10);

	}

}
