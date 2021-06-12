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
		// TODO Auto-generated method stub
	try
	{
	//Use Try Catch To Handle Null Exceptions 
    String n1=request.getParameter("n1");
	String n2=request.getParameter("n2");
    int b=Integer.parseInt(n2);
    int a=Integer.parseInt(n1);
	String ch=request.getParameter("b");
	PrintWriter pw=response.getWriter();
	response.setContentType("text/html");
	switch(ch)
	{
	case "ADD":pw.println("The Sum is "+ (a+b));
		       break;
	case "SUB":pw.println("The Sub is "+ (a-b));
               break;
	case "MUL":pw.println("The Mul is "+ (a*b));
               break;
	case "DIV":pw.println("The Div  is "+ (a/b));
               break;	 
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
