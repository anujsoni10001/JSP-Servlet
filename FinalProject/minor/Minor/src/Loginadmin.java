

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loginadmin
 */
@WebServlet("/Loginadmin")
public class Loginadmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginadmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String username=request.getParameter("user");
		String pwd=request.getParameter("pwd");
		if(username.equals("admin") && pwd.equals("root"))
		{
	    response.sendRedirect("adminhome.html");
		}
		else
		{
		RequestDispatcher rd=request.getRequestDispatcher("adminlogin.html");
		rd.include(request, response);
		pw.println("Invalid Username or Password..");
		}
	}

}
