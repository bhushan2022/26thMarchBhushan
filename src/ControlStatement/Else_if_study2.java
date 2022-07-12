package ControlStatement;

public class Else_if_study2 {
	
	static int math;
	static int eng;
	static int sci;
	static String name;

  public static void main(String[] args) 
	{Else_if_study2 e=new Else_if_study2();
	e.mohan();
	Rudra();
	}
  
  public void mohan()
  {
	  name="rajesh";
	  math=90;
	  eng=80;
	  sci=80;
	  int avg=(math+eng+sci)/3;
	  
	  if(avg>=75 & avg<100)
	  {
		  System.out.println("===========================");
		  System.out.println("congratulation "+name +" you are passed with dist & aggregate is "+avg+"%");
		  System.out.println("===========================");
	  }
	  else if(avg>=60 & avg<75)
	  {
		  System.out.println("===========================");
		  System.out.println("congratulation "+name +" you are passed with first class & aggregate is "+avg+"%");
		  System.out.println("===========================");
	  }
	  else if(avg>=35 & avg<60)
	  {
		  System.out.println("===========================");
		  System.out.println("congratulation "+name +" you are passed & aggregate is "+avg+"%");
		  System.out.println("===========================");  
	  }
	  else
	  {
		  System.out.println("===========================");
		  System.out.println("sorry "+name +" you are failed & aggregate is "+avg+"%");
		  System.out.println("better luck next time");
		  System.out.println("===========================");  
	  }
	 
	  }
  public static void Rudra()
  {
	  name="Rudra";
	  math=80;
	  eng=81;
	  sci=50;
	  int avg=(math+eng+sci)/3;
	  if(avg>=75 & avg<100)
	  {
		  System.out.println("================================");
		  System.out.println("congratulation "+name+"you are passd with dist"+avg+"%");
		  System.out.println("================================");
	  }
	  else if(avg>=60 & avg<75)
	  {
		  System.out.println("================================");
		  System.out.println("congratulation "+name+"you are passd with 1st class"+avg+"%");
		  System.out.println("================================");
		    }
	  else if (avg>=40 & avg<60)
	  {
      System.out.println("================================");
	  System.out.println("congratulation "+name+"you are passd with 2nd class"+avg+"%");
	  System.out.println("================================");
      }
	  else 
	  {
		  System.out.println("================================");
		  System.out.println("sorry "+name+"you are fail better luck next time "+avg+"%");
		  System.out.println("================================");
	  }
	 
  }

}
