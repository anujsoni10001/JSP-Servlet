import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Updatehff
 */
@WebServlet("/Updatehff")
public class Updatehff extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Updatehff() {
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
		String Name=request.getParameter("Name");
		String Price=request.getParameter("Price");
		String Category=request.getParameter("Category");
		String Company=request.getParameter("Company");
		String id=request.getParameter("id");
		///Servlet Drawbacks isi liye jsp parege
		pw.println("<form action=UpProAll>");
	    pw.println("<pre>");
	    pw.println("Product Name:  " + Name);
	    //******************///Concept of Hidden Form Fill ***********************
	    pw.println("<input type=hidden name=Name value="+Name+">");
	    //******************///Concept of Hidden Form Fill ***********************
	    pw.println("Enter the Price<input type=text name=Price value="+Price+">");
	    pw.println("Enter the Category<input type=text name=Category value="+Category+">");
	    pw.println("Enter the Company<input type=text name=Company value="+Company+">");
	    pw.println("Enter the Id<input type=text name=id value="+id+">");
	    pw.println("<input type=submit value=UPDATE>");
	    pw.println("</pre>");
		pw.println("</form>");
	}

}
