

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calc")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String n1=request.getParameter("n1");
		String n2=request.getParameter("n2");
		String ch=request.getParameter("b");
		int a=Integer.parseInt(n1);
		int b=Integer.parseInt(n2);
		switch(ch)
		{
		case "ADD":
			out.println("add is "+(a+b));
			break;
		case "SUB":
			out.println("sub is "+(a-b));
			break;
		case "MUL":
			out.println("mul is "+(a*b));
			break;
		case "DIV":
			out.println("div id "+(a/b));
			break;
		}
	}

}







