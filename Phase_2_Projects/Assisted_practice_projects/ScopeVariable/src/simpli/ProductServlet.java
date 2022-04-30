package simpli;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		PrintWriter out = response.getWriter();
		out.print(" <h1> Welcome to Product Servlet </h1><br> ");
		
		String pname = request.getParameter("pname");
		String price = request.getParameter("price");
		
		//request.setAttribute("price", price);//data can access in next servlet/page but same request obj is present in next servlet
		request.setAttribute("pname", pname);
		
		HttpSession session = request.getSession();
		session.setAttribute("price", price);
		
		
		
		//forward request to billservlet
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/BillServlet");
		
		//requestDispatcher.forward(request, response);//forward request to destination and display only final page
		
		requestDispatcher.include(request, response);//include request will display each page data
		
		//
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
