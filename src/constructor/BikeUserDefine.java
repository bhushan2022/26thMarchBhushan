package constructor;

public class BikeUserDefine {
	String name;
	String capacity;
	int seatcapacity;
	String colour;
	
	
	public BikeUserDefine()
	{
	name="activa";
	capacity="110cc";
	seatcapacity=2;
	colour="white";
		}

	public static void main(String[] args) 
	{
	BikeUserDefine bud=new BikeUserDefine();
	bud.activa();

	}
	public void activa() 
	{
		System.out.println("my bike name is "+name);
		System.out.println("Engine of activa is "+capacity);
		System.out.println("on active only"+seatcapacity+"people are seating");
		System.out.println("The colour of activa is "+colour);

		
	}

}
