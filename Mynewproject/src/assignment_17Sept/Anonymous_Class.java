package assignment_17Sept;


interface Market{
	void buy();
	
}
public class Anonymous_Class {

	public static void main(String[] args) {
		Market m = new Market() {
			
			@Override
			public void buy() {
					System.out.println("I am Buying Shares Of TCS");
			}
		};
		m.buy();
	}

}
