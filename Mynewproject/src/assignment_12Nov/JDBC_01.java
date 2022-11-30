package assignment_12Nov;
/*6  WAP using JDBC to select and print all Employee table.*/

import java.sql.*;

public class JDBC_01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testcourse", "root", "Avadhut@2508");
		
		
		Statement st = con.createStatement();
		ResultSet rt = st.executeQuery("select * from departments");
		

		System.out.println("Showing Department Details");
		System.out.println("D_ID"+"\t"+"Department_Name"+"\t"+"Manager_ID"+"\t"+"Location_ID");

		while (rt.next()) {
			System.out.println(rt.getInt(1)+"\t"+rt.getString(2) +"\t"+rt.getInt(3) +"\t"+rt.getInt(4));
		}

		System.out.println("\n****************************************");

		ResultSet re = st.executeQuery("select * from departments where department_id=80");
		while (re.next()) {
			System.out.println(re.getInt(1) + "    " + re.getString(2) + "    " + re.getInt(3) + "   " + re.getInt(4));
		}

		con.close();
	}

}
