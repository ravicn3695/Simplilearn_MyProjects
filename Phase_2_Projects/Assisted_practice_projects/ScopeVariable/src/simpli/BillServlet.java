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
 * Servlet implementation class BillServlet
 */
@WebServlet("/BillServlet")
public class BillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BillServlet() {
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
		out.print(" <h1> Welcome to Billing Servlet </h1> ");
		
		String pname =(String) request.getAttribute("pname");//data accessing from first/product servlet
		out.print(" Product prchased "+pname);
		
		
		HttpSession session = request.getSession();
		String price =(String) session.getAttribute("price");
		
		ServletContext context = request.getServletContext();
		context.setAttribute("price", price);
		
		//String pname = request.getParameter("pname");
		//String price = request.getParameter("price");
	//out.print("Product Name is: "+ pname);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/PaymentServlet");
		requestDispatcher.include(request, response);//include request will display each page data
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
