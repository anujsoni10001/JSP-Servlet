

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
		mvc.Product p=new mvc.Product();
		p.setName(name);
		p.setPrice(price);
		p.setCat(cat);
		p.setCmp(cmp);
		mvc.RegisterDao rd=new mvc.RegisterDao();
		try {
			int i=rd.addProduct(p);
			RequestDispatcher rd1=request.getRequestDispatcher("index.html");
			rd1.include(request, response);
			out.println(name+" added");
		} catch (Exception e) {
			out.println(e);
		}
		
	}

}









