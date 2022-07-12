package Abstract_Class;

public abstract class BikeDetails {
	
	public BikeDetails()
	{
		System.out.println("*******************************");
	}

	public static void main(String[] args)
	{


	}
  public void bikename() // complete method
  {
	  String name="Honda shine";
	  String capacity="119cc";
	  int seat=2;
	  System.out.println("my  bikename is "+name);
	  System.out.println("The bike capacity is "+capacity);
	  System.out.println("seating capacity is "+seat);
  }
  public abstract void colour();// incomplete method
}
// In class if only one method is incomplete so this class is called as abstract class