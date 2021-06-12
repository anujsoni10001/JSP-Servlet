

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Adminhome
 */
@WebServlet("/Adminhome")
public class Adminhome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adminhome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		HttpSession session=request.getSession();
		String id=(String)session.getAttribute("id");
		pw.println("<h1>Welcome to AdminHome @"+id+"</h1>");
		pw.println("<pre><a href=Addser2.html>AddService</a>");
		pw.println("<a href=delPro2.html>DelService</a>");
		pw.println("<a href=Updser.html>UpdService</a>");
		pw.println("<a href=Showser>ShowService</a>");
		pw.println("<a href=AdminLogout>LogOut</a></pre>");	
	}
}
