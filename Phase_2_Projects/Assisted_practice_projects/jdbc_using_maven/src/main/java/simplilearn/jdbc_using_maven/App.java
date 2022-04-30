package simplilearn.jdbc_using_maven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
    			Connection conn = DBUtil.getDBConnection();
    			
    			//step3
    		
    			try {
    				
    				//for insert
    				//String insert = "insert into employee values(?,?,current_date,?)"; //? positional parameters and query
    				//PreparedStatement pstmt = conn.prepareStatement(insert);
    				
    				//for update
    				String update = "update employee set ename = ?, salary = ? where eid = ?";
    				PreparedStatement pstmt = conn.prepareStatement(update);
    				
					
					
								/*pstmt.setInt(1, 106);
								pstmt.setString(2, "shiva");
								pstmt.setInt(3, 25000);*/
    				
    				pstmt.setString(1, "vignesh");
    				pstmt.setInt(2, 35000);
    				pstmt.setInt(3, 111);
					
					int count = pstmt.executeUpdate();
					
					System.out.println(count +" "+"records effected...");
					
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    }
}
