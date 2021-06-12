

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class update
 */
@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String cat=request.getParameter("cat");
		String cmp=request.getParameter("cmp");
		
		out.println("<form action=update1>");
		out.println("<input type=hidden name=id value="+id+"><br>");
		out.println("NAME<input type=text name=name value="+name+"><br>");
		out.println("CAT<input type=text name=cat value="+cat+"><br>");
		out.println("CMP<input type=text name=cmp value="+cmp+"><br>");
		out.println("<input type=submit value=Update>");
		out.println("</form>");
	}

}
