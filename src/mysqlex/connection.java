package mysqlex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.xdevapi.Statement;

public class connection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase","root","jayesh");
		System.out.println("Database connect suceesfully");
		System.out.println(con);
		
		java.sql.Statement s;
		s=con.createStatement();      //insert value
//		String query1="INSERT INTO stu values('5','harshu','uk',20)";
//		s.executeUpdate(query1);
//		System.out.println("Record is inserted");
		
		String query="Update stu set age=52 where id=1"; //update 
		s.executeUpdate(query);
		System.out.println("Record is Updated");
		
		String query2="delete from stu where id=5"; //delete operation
		s.executeUpdate(query2);
		System.out.println("Record is Deleted");
		
		
	
		
		
	}

}