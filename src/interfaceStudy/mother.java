package interfaceStudy;

public interface mother
{
void love(); // method by dfault is public & abstract
 default void money(){
	 System.out.println("money method from mother class");
 }
 default void home()
 {
	 System.out.println("home method from mother class");
 }

}



