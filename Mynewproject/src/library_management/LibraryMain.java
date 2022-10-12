package library_management;

public class LibraryMain {

	public static void main(String[] args) {

		Book boook[] = new Book[2];
		boook[0] = new Book(12345, "HTML", "R.Sharma");
		boook[1] = new Book(56789, "PHP", "Bhadari");

		Book boook1[] = new Book[2];
		boook1[0] = new Book(01234, "Java", "B.Khanna");
		boook1[1] = new Book(98521, "Python", "R.Bishnoi");

		Book boook3[] = new Book[2];
		boook3[0] = new Book(74182, "Springboot", "Patel");
		boook3[1] = new Book(74182, "Hadoop", "Patil");

		Student s1 = new Student("Rajesh", 1234, "CS", boook);
		Student s2 = new Student("Vikas", 6846, "ETC", boook1);
		Student s3 = new Student("Shubham", 8947, "IT", boook3);

		System.out.println(s1);
		System.out.println("\n" + s2);
		System.out.println("\n" + s3);

	}

}
