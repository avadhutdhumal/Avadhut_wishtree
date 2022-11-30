package assignment_15Oct;

import java.util.ArrayList;

public class Student {
	int s_id;
	String s_name;
	ArrayList<Test> t;
	public Student(int s_id, String s_name, ArrayList<Test> t) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.t = t;
	}
	@Override
	public String toString() {
		return "Student Id: " + s_id + "     Student Name:" + s_name;
	}

}
