package sampleTestAS;
import AccessSpecifiers.velocity;


public class AcessTest extends velocity {

	public static void main(String[] args)
	{
    velocity v= new velocity();
 // v.test1(); we cant call private member in another class
 		//v.test2(); // calling default method---> ( visible within package)
         //v.test3(); // calling protected method--->(visible only within package--> inheritance will provide out of package
 	    v.test4(); // calling public method--->(visible throughout project

 	    // object should be created of subclass
 	    AcessTest a=new AcessTest();
 	   a.test3(); // calling protected method--->(visible only within package--> inheritance will provide out of package
	    a.test4(); // calling public method--->(visible throughout project)
 	    
	   
	}

}
