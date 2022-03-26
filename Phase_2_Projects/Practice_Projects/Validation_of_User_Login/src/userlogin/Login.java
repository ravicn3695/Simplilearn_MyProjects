package userlogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// Set the content type
				response.setContentType("text/html");
		// Get the writer
				PrintWriter out = response.getWriter();
		// Get the userName from the request
				String uName = request.getParameter("userName");
				String uPassword = request.getParameter("userPassword");
				
		// Get a reference to the HttpSession object
				HttpSession theSession = request.getSession();
				
		// Validate the user name
				if(uName.trim().equals("Ravichandra") && uPassword.trim().equals("ravi@123")) {
		// Save the user name in the session
				theSession.setAttribute("userName", uName);
				theSession.setAttribute("userPassword", uPassword);
		// Redirect to the Dash board
				response.sendRedirect("Dashboard");
				}
				else 
				{
				out.println("<font color='red'>Invalid username or Password...</font>");
				RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
				dispatcher.include(request, response);
				}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
