package mysqlex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class AccessingData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver"); //compulsory take
		Connection c = null;
		c = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase", "root", "jayesh");
		Statement s1 = (Statement) c.createStatement();
		ResultSet rs = null;
		rs = s1.executeQuery("select * from stu");
		System.out.println("No of Records:");
		while (rs.next()) {
			// Display values

			System.out.print("ID: " + rs.getInt("id"));
			System.out.print(", City: " + rs.getString("city"));
			System.out.println(", Name: " + rs.getString("name"));
			System.out.println(", Age: " + rs.getString("age"));

		}

	}
}
