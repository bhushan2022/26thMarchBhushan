package Sanket;

public class AddElementInArray {

	public static void main(String[] args) 
	{
    int a[]= {10,20,30,40,50};
    int index=4;
    int element=100;
    
    for(int i=a.length-1;i>=index-1;i--)
    {
    	a[i]=a[i-1];
    }
    a[index-1]=element;
    for(int i=0;i<a.length;i++)
    {
    	System.out.println(a[i]);
    }
    
    
    
    
	}

}
