package sqldatabase1;
import java.sql.*;
public class School11 {
	public static void main(String arr[])throws Exception
	{
		Statement st;
		Connection con;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded and registered");
		con=DriverManager.getConnection("jdbc:mysql://localhost/payroll_service","root","Myshvi99@");
		System.out.println("connection is established");
		st=con.createStatement();
		st.execute("create table emplyoyee(id int auto_increment,name varchar(30),salary double,age int,department varchar(20),joining_date date,primary key(id));\r\n"
				+ "");
		System.out.println("table is created successfully");
		st.close();
		con.close();
		}
		
}
