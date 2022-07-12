package Methods;

public class IplTeam {

	public static void main(String[] args) {
		IplTeam it=new IplTeam(); 
				it.Teamdetails();
		        it.Teamdetails("Mumbai Indians", "Rohit sharma", 264, 45, "batsman");
		        it.Teamdetails("RCB", "Virat Kohli", 183, 18, "batsman");
		        it.Teamdetails("CSK", "Dhoni", 7, 183, "batsman");
		        it.Teamdetails("SRH","bhuvi", 90, 64, "bowler");
		        it.Teamdetails("KKR", "Shreyash", 80, 9, "batsman");
	}
 public void Teamdetails()//non static method without parameter
{
	//name;numofplayer;batsman;jercynum;
	String name="mumbai Indians";
	String name1="Rohit sharma";
	int highscore=264;
	int jercynum=45;
	String type="batsman";
	System.out.println("The name of Team is "+name);
	System.out.println("The name of player is "+name1);
	System.out.println("The highest individual score is "+highscore);
	System.out.println("The jercynumber is "+jercynum);
	System.out.println("He is Right handed "+type);
	
	}
     public void Teamdetails(String name,String name1,int highscore,int jercynum,String type) //non static method with parameter
     {
    		System.out.println("The name of Team is "+name);
    		System.out.println("The name of player is "+name1);
    		System.out.println("The highest individual score is "+highscore);
    		System.out.println("The jercynumber is "+jercynum);
    		System.out.println("He is Right handed "+type);
    		
}
}
