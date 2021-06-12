

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		mvc.Product p=new mvc.Product();
		p.setName(name);
		mvc.RegisterDao rd=new mvc.RegisterDao();
		try {
			int i=rd.delRecord(p);
			RequestDispatcher rd1=request.getRequestDispatcher("delete.html");
			if(i>0)
			{
				rd1.include(request, response);
				out.println(name+" deleted");
			}
			else
			{
				rd1.include(request, response);
				out.println(name+" not deleted");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.println(e);
		}
		
	}

}









