package mysqlex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BatchEx {
	public static void insert(List<PersonalEntityEx> pers) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase","root","jayesh");
		System.out.println("Database connect suceesfully");//
		String query = "INSERT INTO stu(id, name) VALUES( ?, ?)";
		PreparedStatement preparedStatement = con.prepareStatement(query);
		for (PersonalEntityEx p : pers) {
			preparedStatement.setInt(1, p.getId());
			preparedStatement.setString(2, p.getName());
			preparedStatement.addBatch();
		}
		preparedStatement.executeBatch();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		List<PersonalEntityEx> l=new ArrayList<>();
		l.add(new PersonalEntityEx(1,"ram"));
		l.add(new PersonalEntityEx(2,"laxman"));
		insert(l);
	}

}
