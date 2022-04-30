package simplilearn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public static Connection getDBConnection() throws SQLException {
		
		//step1 Register driver
		
		Connection conn = null;
		try {
			//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//step2 Get database connection
		
	try {
		 conn =	DriverManager.getConnection("jdbc:mysql://localhost:3306/mphasis", "root", "user");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	return conn;
	
	}
	

}
