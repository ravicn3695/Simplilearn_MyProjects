package airLine_Booking_Portal;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.*;


/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html"); 
		HttpSession session = request.getSession(true);
		List booklist=new ArrayList();
		Connection con = null;

		String url = "jdbc:mysql://localhost:3306/";
		String db = "ravidb";
		String driver = "com.mysql.jdbc.Driver";
		String user = "root";
		String pass = "user";

		String source_place="";
		String destination_place="";
		source_place=request.getParameter("source_place");
		destination_place=request.getParameter("destination_place");
		String sqlqueary="select * from SpiceJet where source_place='"+source_place+"' AND Destination_place='"+destination_place+"'";
		if(source_place!=null && !(source_place.equals(""))){
		sqlqueary+=" and source_place='"+source_place+"'";
		}
		if(destination_place!=null && !(destination_place.equals("-1"))){
		sqlqueary+=" and Destination_place='"+destination_place+"'";
		}

		try{
		Class.forName(driver);
		con = DriverManager.getConnection(url+db, user, pass);
		try{
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sqlqueary);
		while (rs.next()) {
		List book=new ArrayList();
		book.add(rs.getInt(1));
		book.add(rs.getString(2));
		book.add(rs.getString(3));
		book.add(rs.getString(4));
		book.add(rs.getTime(5));
		book.add(rs.getTime(6));
		book.add(rs.getString(7));
		book.add(rs.getInt(8));
		book.add(rs.getInt(9));
		book.add(rs.getInt(10));
		booklist.add(book);
		}
		}catch (SQLException s){
		System.out.println("SQL statement is not executed!");
		}
		}
		catch (Exception e){
		e.printStackTrace();
		}
		request.setAttribute("booklist",booklist); 
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/searchpage.jsp");
		dispatcher.forward(request, response); 
		
		
	}

}
