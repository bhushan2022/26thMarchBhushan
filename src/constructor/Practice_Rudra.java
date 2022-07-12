package constructor;

public class Practice_Rudra 
{ String name;int age;float height;float weight;

public Practice_Rudra() // constructor declare
{
	name="Rudra satre";
	age=11;
	height=4.10f;
	weight=45.4f;
}

	public static void main(String[] args) 
	{
		Practice_Rudra p=new Practice_Rudra();
		p.info();

	}
	public void info()
	{
		System.out.println("my name is "+name);
		System.out.println("my age is "+age+" year");
		System.out.println("my height is "+height+" inch");
		System.out.println("my weight is "+weight+" kg");
	}

}
