

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SubmitServalet
 */
@WebServlet("/SubmitServalet")
public class SubmitServalet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubmitServalet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String name=request.getParameter("name");
	    String pwd=request.getParameter("pwd");
	    out.println(name);
	    out.println(pwd);
	    Cookie ck=new Cookie("user",name);//creating cookie object  
	    response.addCookie(ck);
	    Cookie ck1=new Cookie("password",pwd);
	    response.addCookie(ck1);
	    RequestDispatcher rd=request.getRequestDispatcher("getco");
	    rd.forward(request,response);
	}

}
