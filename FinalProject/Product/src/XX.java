

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class XX
 */
@WebServlet("/adminhome")
public class XX extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XX() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String id=request.getParameter("id");
	    pw.println("<h1 align=center>Welcome to Admin Pannel</h1>");
		pw.println("<h4 align=center>Welcome@"+id+"login</h4>");
		pw.println("<pre><a href=addPro.html>Add Product</a>");
		pw.println("<a href=delPro.html>Delete Product</a>");
		pw.println("<a href=UpPro.html>Update Product</a>");
		pw.println("<a href=ShowPro>Show Product</a></pre>");
		
	}

}
