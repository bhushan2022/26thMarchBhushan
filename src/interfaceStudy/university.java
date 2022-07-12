package interfaceStudy;

public class university implements Puneuniversity,Shivajiuniversity {

	public static void main(String[] args) {
		university u=new university();
		u.dept();
		u.clg();
		u.course();

	}

	@Override
	public void clg() {
	System.out.println("The clg method is in shivajiuniversity");
		
	}

	@Override
	public void course() {
	Shivajiuniversity.super.course();
	Puneuniversity.super.course();
		
	}

	@Override
	public void dept() {
		System.out.println("The dept method is in puneuniversity");
	}

}
