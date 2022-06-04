package sqldatabase1;
import java.sql.*;
public class School12 {

	public static void main(String[] arr) throws Exception {
		// TODO Auto-generated method stub
Statement st;
Connection con;
ResultSet rs;
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("driver loaded and registered");
con=DriverManager.getConnection("jdbc:mysql://localhost/payroll_service","root","Myshvi99@");
	System.out.println("connection is established");
st=con.createStatement();
rs=st.executeQuery("select name ,salary from emplyoyee where salary=30000");
rs.next();
int i=rs.getInt(2);
String ss=rs.getString(1);
System.out.println("emplyoyee name is"+ss);
System.out.println("salary is"+i);
rs.close();
st.close();
con.close();
	}

}
