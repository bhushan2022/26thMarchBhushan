package Polymorphism;

public class TataOverloading {

	public static void main(String[] args) 
	{
		TataOverloading t=new TataOverloading();
		t.tata();
		t.tata("harrier");

	}
   public void tata()
   {
	   System.out.println("tata has many car");
   }
   public void tata(String name)
   {
	   System.out.println("The name of the car is "+name);
   }
}
