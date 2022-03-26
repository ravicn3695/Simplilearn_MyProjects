package Product_Details;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Display
 */
@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Display() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String p_id = request.getParameter("productID");
		String p_name = request.getParameter("productName");
		String p_bill = request.getParameter("Productprice");
		//String p_date = request.getParameter("date_added");
		
		HttpSession theSession = request.getSession();
		
		theSession.setAttribute("Pid", p_id);
		theSession.setAttribute("Pname", p_name);
		theSession.setAttribute("Pprice", p_bill);
		//theSession.setAttribute("date_added", p_date);
		
		
		response.sendRedirect("SecondProduct.jsp");
		
		/*PrintWriter out = response.getWriter();
		
		out.print("<h1> **Welcome to Servlet** </h1>");*/
		

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
