/*default constructor not called when parameter constructor available */

/*q6)create a class game which contains variable like game_name,county,state
1) create a default constructor initialize the values of variables and print it in  a method

2)create parameterized constructor pass the value as parameter and print it in a method
check whether u can call default constructor if  parameterized constructor is available

3) create another constructor with variable player name pass it as parameter and show constructor chaining using this keyword.
*/
package assignment_6aug;
public class Game {
	String game_name,county,state;
	
	Game()
	{
		this("Cricket","India","Maharashtra");
		
	}
	
	Game(String game_name,String county,String state)
	{
		this("Rohit Sharma");
		this.game_name=game_name;
		this.county=county;
		this.state=state;
	}
		
	Game(String player_name)
	{
		System.out.println(player_name);
	}
	
	void display()
	{
		System.out.println("Game: "+game_name+"  "+ "Country: " +county+"   "+ "State: "+state);
	}
	
	public static void main(String[] args) {
		Game g= new Game();
		g.display();
	}

}
