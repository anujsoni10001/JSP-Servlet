

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calca
 */
@WebServlet("/Calca")
public class Calca extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calca() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
		//Use Try Catch To Handle Null Exceptions 
	    String n3=request.getParameter("n1");
	    int a=Integer.parseInt(n3);
		String ch=request.getParameter("b");
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		switch(ch)
		{	 
		case "SQRT":pw.println("The Sqrt is "+Math.sqrt(a));
	               break;	
		case "CBRT":pw.println("The Sqrt is "+Math.cbrt(a));
	               break;	
		}
		}
		catch(Exception e)
		{
	    e.printStackTrace();
		}
		}
	}
