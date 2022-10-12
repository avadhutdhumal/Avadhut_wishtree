package program_Library;

public class LibrararyMain {

	public static void main(String[] args) {
		Student s[] = new Student[2];
		Department d1 = new Department(1, "IT");
		Department d2 = new Department(2, "Mechanical");
		Department d3 = new Department(3, "Civil");
		
		Book b[] = new Book[9];
		b[0] = new Book(101, "JAVA", "Mr.Kapoor", 400, 1, d1);
		b[1] = new Book(102, "DATA", "Mr.Mishra", 300, 2, d1);
		b[2] = new Book(103, "HTML", "Mr.Ghosh", 220, 2, d1);
		b[3] = new Book(201, "Design", "Ms.Bishnoi", 360, 2, d2);
		b[4] = new Book(202, "Fluid", "Mr.Sharma", 150, 2, d2);
		b[5] = new Book(203, "Structres", "sharma", 300, 2, d2);
		b[6] = new Book(301, "Concrete", "Mr.Vyas", 400, 2, d3);
		b[7] = new Book(302, "TOS", "Mr.Patil", 310, 2, d3);
		b[8] = new Book(303, "Cement", "Mr.Shukla", 350, 2, d3);
		

		for (int i = 0; i < s.length; i++) 
		{
			StudentInformation si1 = new StudentInformation();
			si1.showing_dep(b);
		}

	}
}
