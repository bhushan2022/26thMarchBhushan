package interfaceStudy;
// multiple inheritance using interface
public interface father
{
 void nature(); // method by dfault is public & abstract
  default void money()
  {
	  System.out.println("money method from father class");
  }
  default void home()
  {
	  System.out.println("home method from father class");
  }
}
 
	 
 

 

