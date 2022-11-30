package multithreading;

class Documents implements Runnable {

	public Documents() throws InterruptedException {
		Thread t = new Thread(this, "Document Thread");
		t.start();
		t.join();
	}

	@Override
	public void run() {
		String s = Thread.currentThread().getName();

		System.out.println(s + " Is Running   ");
		Documentevaluted();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		verificatin();
	}

	void Documentevaluted() {
		System.out.println("Document Verifing ");
	}

	void verificatin() {
		System.out.println("Document Verfied Successfully");
	}
}

class Licesence implements Runnable {

	Licesence() throws InterruptedException {
		Thread t1 = new Thread(this, "Licence Thread");
		t1.start();
		t1.join();
	}

	@Override
	public void run() {
		String s = Thread.currentThread().getName();
		System.out.println(s + " Is Running   ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		licencevaluted();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verificatin();
	}

	void licencevaluted() {
		System.out.println("License Verifing");
	}

	void verificatin() {
		System.out.println("License Verfied Successfully");
	}
}

public class License {

	public static void main(String[] args) throws InterruptedException {
		String s = Thread.currentThread().getName();
		System.out.println(s + " IS running");
		Documents d = new Documents();
		Licesence l = new Licesence();

	}

}
