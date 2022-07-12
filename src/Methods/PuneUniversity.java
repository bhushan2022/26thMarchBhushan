package Methods;

public class PuneUniversity {

	public static void main(String[] args) 
	{
		PuneUniversity pu=new PuneUniversity(); //created object of the class
		pu.studentinfo();//caliing method without parameter
		pu.Studentinfo("mahesh","pu123" ,"Engg",3,'A');//calling method with parameter
		Clg c=new Clg();
         c.dept();
         c.dept1("prasad", 90, "diploma", 'c', 5);

	}
	public void studentinfo()//non static method--> without parameter
	{
		//Name;PRN;Course;Year;Grade;
		String name="velocity";
		String PRN="pu1234";
		String Course="Engg";
		int Year=3;
		char Grade='A';
		
		System.out.println("=============");
		System.out.println("student name is "+name);
		System.out.println("student PRN is "+PRN);
		System.out.println("student course is "+Course);
		System.out.println("student year is "+Year);
		System.out.println("student grade is "+Grade);
	   }
		
		public void Studentinfo(String name,String PRN,String course,int year,char Grade)//method with parameter
		{
			System.out.println("===================");
			System.out.println("my name is "+name);
			System.out.println("my PRN is "+PRN);
			System.out.println("my course is "+course);
			System.out.println("my grade is "+Grade);
		} 
		
		
	

}
