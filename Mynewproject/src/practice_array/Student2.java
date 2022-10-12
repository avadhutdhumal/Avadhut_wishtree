package practice_array;

import java.util.Scanner;
//Create array of students, student has (roll, name, age, marks). Print only
//Those students who have marks more than 60 and age is less than 15.

class Students {

	private int roll;
	private String name;
	private int marks;
	private int age;

	public void setDetails(int roll, String name, int marks, int age) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}

	public void show() {
		System.out.println("Roll: " +roll);
		System.out.println("Name: " + name);
		System.out.println("Marks: " + marks);
		System.out.println("Age: " + age);
	}
}

public class Student2 {

		    @SuppressWarnings("resource")
			public static void main(String[] args) {
		        Students[] s = new Students[5];

		        Scanner sc = new Scanner(System.in);

		        for (int i = 0; i < 5; i++) {
		        	System.out.println("Enter Roll Number");
		            int roll=sc.nextInt();
		            System.out.println("Enter name");
		            String name = sc.next();
		            System.out.println("Enter marks");
		            int marks = sc.nextInt();
		            System.out.println("Enter Age");
		            int age = sc.nextInt();
		        

		            s[i] = new Students();
		            s[i].setDetails(roll, name, age, marks);
		        }

		        for (int i = 0; i < 5; i++) {
		            s[i].show();
		        }
		    }
		}
