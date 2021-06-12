

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import pp.Product;

/**
 * Servlet implementation class Show
 */
@WebServlet("/Show")
public class Show extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Show() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		Session session=new Configuration().configure().buildSessionFactory().openSession();
                HQL :-> Hibernate Query Language
		// USE OF HQL //
                Query qr=session.createQuery("from Product");
		List<Product> al=qr.list();
		out.println("<table align=center border=1>");
		for(Product p:al)
		{
			out.println("<tr>");
			out.println("<td>");
			out.println(p.getId());
			out.println("</td>");
			out.println("<td>");
			out.println(p.getName());
			out.println("</td>");
			
			out.println("<td>");
			out.println(p.getPrice());
			out.println("</td>");

			out.println("<td>");
			out.println(p.getCat());
			out.println("</td>");

			out.println("<td>");
			out.println(p.getCmp());
			out.println("</td>");
			out.println("<td>");
			out.println("<a href=Delete?id="+p.getId()+">Delete</a>");
			out.println("</td>");
			
			out.println("</tr>");
		}
		out.println("</table>");
		session.close();
	}

}












