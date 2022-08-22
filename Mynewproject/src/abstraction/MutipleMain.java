package abstraction;

interface A1
{
	int a=10;
	void show();
}

interface B
{
	int a=20;
	void show();
}


class Multiple implements A1,B
{
	@Override

	public void show() {
		//System.out.println(a);
	System.out.println("show method implemented");
	}

}

public class MutipleMain {

	public static void main(String[] args) {
	B m=new Multiple();
	m.show();

	}

}
