package Sanket;

public class Minimum {

	public static void main(String[] args) 
	{
  int a[]= {12,20,30,4,60};
  int min = a[0];
  
  for(int i=1;i<a.length;i++)
  {
	  if(min>a[i])
	  {
		  min=a[i];
	  }
  }
  System.out.println(min);
	}

}
