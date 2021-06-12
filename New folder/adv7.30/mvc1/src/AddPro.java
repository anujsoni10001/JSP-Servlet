

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pp.Product;
import pp.RegisterDao;

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
		String name=request.getParameter("name");
		String price=request.getParameter("price");
		String cat=request.getParameter("cat");
		String cmp=request.getParameter("cmp");
		Product p=new Product();
		p.setName(name);
		p.setPrice(price);
		p.setCat(cat);
		p.setCmp(cmp);
		RegisterDao rd=new RegisterDao();
		try
		{
		int i=rd.addPro(p);
		if(i>0)
		{
			out.println(i+" added");
		}
		else
		{
			out.println("no record added");
		}
		}catch(Exception e)
		{
			out.println(e);
		}
	}

}
