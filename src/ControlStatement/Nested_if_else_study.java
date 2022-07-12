package ControlStatement;

public class Nested_if_else_study {

	public static void main(String[] args) {
		// if user no is valid--->enter password
		// if password is valid--->login sucess
		//else password is invalid--->incorrect password
		//else user no is invalid---->incorrect user no
		String usernum="velocity1";
		String password="velocity2345";
		if(usernum=="velocity1")//outer loop
		{
			System.out.println("enter password");
			if(password=="velocity234")//inner loop
			{
				System.out.println("login success");
			}
			else 
			{
				System.out.println("incorrect password");
			}
		}
			else
			{
				System.out.println("incorrect user id");
			}
		
	}

}
