package Written_Test2;

public class Ques18 {

	public static void main(String[] args) {
		Department_18 d1 = new Department_18(101, "HR");
		Department_18 d2 = new Department_18(102, "Developmet");
		Department_18 d3 = new Department_18(103, "Testing");

		Employee_18 e1 = new Employee_18(1111, "Suraj", d1);
		Employee_18 e2 = new Employee_18(2222, "Suhas", d2);
		Employee_18 e3 = new Employee_18(3333, "Sunil", d3);

		Employee_18 arr[] = { e1, e2, e3 };
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i].id+"  "+arr[i].name+"  "+arr[i].d.deptid+"  "+arr[i].d.dname);
		}
	}
}
