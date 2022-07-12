package Methods;

public class CompanyDept {

	public static void main(String[] args) 
	{
	CompanyDept cd= new CompanyDept();
	cd.mechanical();
	production();

	}
	public void mechanical()//non static method
	{
		String name="Genset assemly";
		int count=18;
		String dept="QA & elect";
		int days=26;
		System.out.println("The name of our dept is"+name);
		System.out.println("The total people working in our dept "+count);
		System.out.println("In Company field supportive dept is "+dept);
		System.out.println("Total working days in company is "+days);
	}
    public static void production()//static method
    {
    	String name="engine";
    	int count=12;
    	String dept="painting";
    	float pf=0.8f;
    	System.out.println("The name of our production dept is "+name);
    	System.out.println("Engine production in one day is"+count);
    	System.out.println("The supportive departmnt of Engine is "+dept);
    	System.out.println("The performance of engine calculated in power factor is "+pf);
    	
    	
    }
}
