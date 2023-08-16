package mysqlex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase","root","jayesh");
		System.out.println("Database connect suceesfully");

		String insert="insert into stu values(?,?,?,?)";
		String update="update stu set city=? where id=?";
		
		
		PreparedStatement p=con.prepareStatement(insert);
		PreparedStatement p1=con.prepareStatement(update);
		
		
//		p.setInt(1, 5);				//insert value
//		p.setString(2, "ish");
//		p.setString(3, "Vashi");
//		p.setInt(4, 23);
//		p.execute();
//		System.out.println("Insert Successfully");

		//update value
		
//		PreparedStatement prest = con.prepareStatement("UPDATE student2 SET stname = ? WHERE ssid = ?");
//		prest.setString(1, "isha");
//		prest.setString(2, "1");
//		prest.executeUpdate();
//		System.out.println("Record update");
		
		//delete value
		
		PreparedStatement prest = con.prepareStatement("DELETE FROM stu WHERE id = ?");
		prest.setString(1, "5");
		prest.executeUpdate();
		System.out.println("Deleted");
		
	}

}
