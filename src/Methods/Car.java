package Methods;

public class Car {

	public static void main(String[] args)
	
	{
		Car cs=new Car();
		cs.cardetails();//calling method without parameter
		cs.cardetails("Kia", "black", 5, 13.2f);//calling mthod with parameter
		cs.cardetails("hyundai venue","white" , 5, 14.4f);

	}
	public void cardetails()//non static method without parameter
	{
		//Name;colour;Seatcapacity;avg;
		String name="hyundai i10";
		String colour="silver";
		int seatcapacity= 5;
		float avg=16.4f;
		
		System.out.println("My car name is "+name);
		System.out.println("My car colour is "+colour);
		System.out.println("In my car seating capacity is "+seatcapacity);
		System.out.println("The avg of my car is "+avg);
		
		}
	
	public void cardetails(String name,String colour,int seatcapacity,float avg)//method with parameter
	{
		
	System.out.println("My car name is "+name);	
	System.out.println("my car colour is "+colour);
	System.out.println("In my car seatingcapacity is "+seatcapacity);
	System.out.println("The avg of my car is"+avg);
	}

}
