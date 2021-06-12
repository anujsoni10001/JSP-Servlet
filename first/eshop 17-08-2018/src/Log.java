

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Log
 */
@WebServlet("/Log")
public class Log extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Log() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	response.setContentType("text/html");
	String id=request.getParameter("id");
	String pwd=request.getParameter("pwd");
	if(id.equals("programmerspoint")&&pwd.equals("12345"))
	{
		RequestDispatcher rd=request.getRequestDispatcher("HomePage");
	    rd.forward(request, response);
	}
	else
	{
		RequestDispatcher rd=request.getRequestDispatcher("dispatcher.html");
		rd.include(request, response);
		out.println("Invalid id and password");
	}
	}

}









