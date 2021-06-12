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
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		if(id.equals("admin") && pwd.equals("root"))
		{
        HttpSession hs=request.getSession();
        hs.setAttribute("id",id);
        response.sendRedirect("Adminhome");	
		}
		else
		{
		RequestDispatcher rd=request.getRequestDispatcher("admin.html");
		rd.include(request,response);
		pw.println("Invalid ID or Password...");
		}
	}
}
