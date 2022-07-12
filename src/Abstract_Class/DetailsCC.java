package Abstract_Class;

public class DetailsCC extends BikeDetails {

	public static void main(String[] args) 
	{
		DetailsCC dc=new DetailsCC();
		dc.bikename();
		dc.colour();
		dc.fuel();

	}
 public void fuel() // complete method
 {
	 String fuel="petrol";
	 System.out.println("this bike running on "+fuel);
 }
@Override
public void colour() {
	System.out.println("The colour of bike is black");
	
}
}
