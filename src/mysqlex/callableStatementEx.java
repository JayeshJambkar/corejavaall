package mysqlex;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class callableStatementEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase","root","jayesh");
		System.out.println("Database connect suceesfully");

		CallableStatement statement = con.prepareCall("{call college_procedure()}");
		
		statement.execute();
		statement.close();

		System.out.println("Stored procedure called successfully!");
	}

}
