package Written_Test2;

class Pune implements Runnable {

	public Pune() throws InterruptedException {
		Thread t = new Thread(this, "Pune Thread");
		t.start();
		t.join();
	}

	@Override
	public void run() {
//		String s = Thread.currentThread().getName();

//		System.out.println(s + " Is Running   ");
		performing();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void performing() {
		System.out.println("Pune Student Performing");
	}

}

class Mumbai implements Runnable {

	Mumbai() throws InterruptedException {
		Thread t1 = new Thread(this, "Mumbai Thread");
		t1.start();
		t1.join();
	}

	@Override
	public void run() {
//		String s = Thread.currentThread().getName();
//		System.out.println(s + " Is Running   ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		performing();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void performing() {
		System.out.println("Mumbai Student Performing");
	}

}

public class Ques14 {

	public static void main(String[] args) throws InterruptedException {
		String s = Thread.currentThread().getName();
		System.out.println(s + " IS running");
		Pune d = new Pune();
		Mumbai l = new Mumbai();
		Pune d2 = new Pune();
		Mumbai l1 = new Mumbai();
		Pune d3 = new Pune();

	}

}
