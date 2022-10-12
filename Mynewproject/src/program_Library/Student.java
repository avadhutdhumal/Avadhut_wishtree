package program_Library;

import java.util.Arrays;

public class Student {
	private int s_id;
	private String s_name;
	private String mob;
	private Book b[];

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public Book[] getB() {
		return b;
	}

	public void setB(Book[] b) {
		this.b = b;
	}

	public Student(int s_id, String s_name, String mob, Book[] b) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.mob = mob;
		this.b = b;
	}

	@Override
	public String toString() {
		return s_id + " " + s_name + " " + mob + ", b=" + Arrays.toString(b);
	} 

	public Student() {
	}

}
