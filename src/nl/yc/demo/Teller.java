package nl.yc.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Teller
 */
@WebServlet("/Teller")
public class Teller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static int teller;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Teller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		teller++;
		response.getWriter().print("<a href='http://localhost:8080/Servlet2/Reset'>reset</a>" + teller);
	
	}


}
