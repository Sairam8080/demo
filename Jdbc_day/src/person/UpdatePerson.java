package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatePerson {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// load and register the Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Establish the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb", "root", "root");

		// create the statement
		
		Statement statement = connection.createStatement();
		
		
		// execute the statement
		
		statement.execute("update person set ");
		
		
		// close the connection
		
		connection.close();
		
		System.out.println("sucessfully person inserted into DB");

	}

}
