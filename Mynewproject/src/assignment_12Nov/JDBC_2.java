package assignment_12Nov;

import java.sql.*;

public class JDBC_2 {
	Statement st;
	ResultSet rt;
	Connection cc;

	public void connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/testcourse", "root", "Avadhut@2508");
		System.out.println("Connection Established");
		
	}
	
	void show() throws SQLException
	{
		st=cc.createStatement();
		rt=st.executeQuery("Select * from employee");
		System.out.println("EMP_ID"+"\t"+"EMP_NAME"+"\t"+"D_ID");
		while(rt.next())
		{
			System.out.println(rt.getInt(1)+"\t"+rt.getString(2)+"\t     "+rt.getInt(3));
		}
	}
	
	void insert() throws SQLException
	{
		int r =st.executeUpdate("Insert into employee values(9,'Rahul',3)");
	}
	
	void delete() throws SQLException
	{
		int k=st.executeUpdate("delete from employee where ID=9");
	}
	
	void update() throws SQLException
	{
		int m=st.executeUpdate("Update employee set name='Runal' where ID=2");
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		JDBC_2 jj=new JDBC_2();
		jj.connect();
		System.out.println("-------------------------");
		jj.show();
		System.out.println("-------------------------");
//		jj.insert();
		System.out.println("-------------------------");
//		jj.delete();
//		jj.show();
		System.out.println("-------------------------");
		jj.update();
		jj.show();
		
	}

}
