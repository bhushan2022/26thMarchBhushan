package Generalization;

public class TestGenerelization {

	public static void main(String[] args) {
		System.out.println("==== JIO======");
		Jio j=new Jio();
		j.call();
		j.data();
		j.msg();
		j.newmethod_jio();
		System.out.println("=====JIO======");
		System.out.println("*********************");
		
		System.out.println("=====Airtel====");
		Airtel a=new Airtel();
		a.call();
		a.data();
		a.msg();
		a.newmethod_airtel();
		System.out.println("====Airtel=====");
		System.out.println("*********************");
		Vi v=new Vi();
		System.out.println("=====Vi======");
		v.call();
		v.data();
		v.msg();
		v.newmethod_vi();
		System.out.println("=====Vi=======");
		System.out.println("*********************");

	}

}
