

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddPro
 */
@WebServlet("/AddPro")
public class AddPro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String price=request.getParameter("price");
		String cat=request.getParameter("cat");
		String cmp=request.getParameter("cmp");
		pp.Product p=new pp.Product();
		p.setName(name);
		p.setPrice(price);
		p.setCat(cat);
		p.setCmp(cmp);
		
		pp.RegisterDao rd=new pp.RegisterDao();
		try
		{
		int i=rd.addProduct(p);
		RequestDispatcher rd1=request.getRequestDispatcher("addpro.html");
		if(i>0)
		{
		rd1.include(request, response);
		out.println("added successfully");
		}
		else{
			rd1.include(request, response);
			out.println("not added successfully");
		}
		}catch(Exception e)
		{
			out.println(e);
		}
	}

}














