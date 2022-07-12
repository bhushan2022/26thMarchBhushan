package interfaceStudy;

public class son implements father,mother{

	public static void main(String[] args) 
	{
	son s=new son();
	s.nature();
	s.love();
	s.money();
	s.home();
	}
@Override
	public void love() {
	System.out.println("mother interface method complete in son class");	
	}
    @Override
	public void nature() {
		System.out.println("father interface method complete in son class");
		}
	@Override
	public void money() {
      		mother.super.money();
      		father.super.money();
      }
@Override
	public void home() {
		father.super.home();
		mother.super.home();
		}

}
