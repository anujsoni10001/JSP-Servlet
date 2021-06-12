

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdatePro
 */
@WebServlet("/UpdatePro")
public class UpdatePro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePro() {
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
		out.println("<form action=Update>");
		out.println(name);
		out.println("<input type=hidden name=name value="+name+" />");
		out.println("<pre>");
		out.println("PRICE<input type=text name=price value="+price+" />");
		out.println("CAT<input type=text name=cat value="+cat+" />");
		out.println("CMP<input type=text name=cmp value="+cmp+" />");
		out.println("<input type=submit value=Update />");
		out.println("</pre>");
		out.println("</form>");
	}

}














