package assignment_13aug;

class IPL_Team
{
	void play()
	{
		System.out.println("Welcome to IPL");
	}
}

class Csk extends IPL_Team
{
	void show()
	{
		System.out.println("CSK Is Most Succesful Team In IPL");
		System.out.println("CSK Have Won IPL 4 Times");
	}
}

class Rcb extends IPL_Team
{
	void show1()
	{
		System.out.println("RCB Is Succesful Team In IPL");
		System.out.println("RCB Have Not Won Any Trophy");
	}
}


public class IPL_Main{

	public static void main(String[] args) {
		Rcb r =new Rcb();
		r.play();
		r.show1();
		Csk c= new Csk();
		System.out.println();
		c.play();
		c.show();
		

	}

}
