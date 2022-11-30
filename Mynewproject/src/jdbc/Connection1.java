package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cc=DriverManager.getConnection("jdbc:mysql://localhost:3306/testcourse","root","Avadhut@2508");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testcourse", "root", "Avadhut@2508");

		System.out.println("connection established");
		Statement st = cc.createStatement();
		ResultSet rs = st.executeQuery("select * from employee");
//		System.out.println("Id\tName\tPercenatge\tDate_of_birth");
		while (rs.next()) {
			System.out.println(rs.getInt(1)+ "\t" + rs.getString(2) + "\t" + rs.getInt(3));
		}

		cc.close();
	}

}
