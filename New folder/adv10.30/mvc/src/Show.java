

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		pp.RegisterDao rd=new pp.RegisterDao();
		try
		{
			ArrayList<Product> al=rd.show();
			if(al.isEmpty())
			{
				out.println("no records found");
			}
			else
			{
				out.println("<table align=center border=1px>");
			for(Product p:al)
			{
				String name=p.getName();
				String price=p.getPrice();
				String cat=p.getCat();
				String cmp=p.getCmp();
				out.println("<tr>");
				out.println("<td>");
				out.println(name);
				out.println("</td>");
				out.println("<td>");
				out.println(price);
				out.println("</td>");
				out.println("<td>");
				out.println(cat);
				out.println("</td>");
				out.println("<td>");
				out.println(cmp);
				out.println("</td>");
				out.println("<td>");
				out.println("<a href=Delete?name="+name+">DELETE</a>");
				out.println("</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			}
		}catch(Exception e)
		{
			out.println(e);
		}
		
	}

}










