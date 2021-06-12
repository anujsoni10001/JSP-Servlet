

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pp.Product;

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
		Product p=new Product();
		p.setName(name);
		pp.RegisterDao rd=new pp.RegisterDao();
		try
		{
		int i=rd.delete(p);
		RequestDispatcher rd1=request.getRequestDispatcher("Show");
		if(i>0)
		{
			rd1.include(request, response);
			out.println(p.getName()+" record deleted");
		}else
		{
			rd1.include(request, response);
			out.println("no record deleted");
		}
		}catch(Exception e)
		{
			out.println(e);
		}
	}
}














