package Sanket;

import java.util.HashSet;

public class DuplicateArray {

	public static void main(String[] args) 
	{
	int a[]= {1,6,4,7,8,4,7,9,3,8};
	
	HashSet uniquenumber = new HashSet<>();
	boolean isDuplicateExist=false;
	
	for(int i=0;i<a.length;i++)
	{
		if(uniquenumber.contains(a[i])) 
		{
			isDuplicateExist=true;
			System.out.println(a[i]);
		}
	
	else {
		uniquenumber.add(a[i]);
	}

	}
	if(!isDuplicateExist)
	{
		System.out.println(-1);
	}

}
}