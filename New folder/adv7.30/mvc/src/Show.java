

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
		ArrayList<Product> al=rd.showRecord();
		out.println("<table align=center border=1>");
		for(Product p:al)
		{
			out.println("<tr>");
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
			out.println("<a href=Delete?name="+p.getName()+">Delete</a>");
			out.println("</td>");
			out.println("<td>");
			out.println("<a href=UpdatePro?name="+p.getName()+"&price="+p.getPrice()+"&cat="+p.getCat()+"&cmp="+p.getCmp()+">Update</a>");
			out.println("</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		}catch(Exception e)
		{
			out.println(e);
		}
	}

}













