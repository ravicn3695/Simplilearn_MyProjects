package simplilearn;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStatementdemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conn = DBUtil.getDBConnection();
		
		try {
			CallableStatement cstmt = conn.prepareCall("{call emp_pro1(?,?,?)}");
			 cstmt.setInt(1, 120);
			 cstmt.setString(2, "kumar");
			 cstmt.setInt(3, 95100);
			 
			 cstmt.execute(); // to execute given procedure		
			 
			 System.out.println("stored peocedure called...");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
