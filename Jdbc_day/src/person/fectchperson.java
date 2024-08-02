package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class fectchperson {

	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			//load and register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish the connection
		Connection connection	=DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb","root", "root");
		
		//create the statement
		Statement statement=connection.createStatement();
		// execute the statement
		ResultSet resultSet=statement.executeQuery("select * from person Where personid=2 ");
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
		System.out.println(resultSet.getString(2));
		System.out.println(resultSet.getInt(3));
		System.out.println(resultSet.getString(4));
		System.out.println(resultSet.getLong(5));
		}
		
		// close the connection
		connection.close();
		System.out.println("sucessfully person inserted into DB");
		}
	
}


