import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pp.Rating;

/**
 * Servlet implementation class Rate
 */
@WebServlet("/Rate")
public class Rate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Rate() {
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
		String Apoint_id=request.getParameter("Apoint_id");
		String choice=request.getParameter("rate");
		int f=Integer.parseInt(choice);
		pp.RegisteredDao rd=new pp.RegisteredDao();
	    pp.Rating rate=new Rating();
	    rate.setAppointmentId(Apoint_id);
	    rate.setConsultationRating(f);
	    try
	    {
		int i=rd.addPro(rate);
		if(i!=0)
		{
		RequestDispatcher rd1=request.getRequestDispatcher("rating.jsp");
		rd1.include(request,response);	
		pw.println("Rating Done...");
		}
		else
		{
		RequestDispatcher rd1=request.getRequestDispatcher("rating.jsp");
		rd1.include(request,response);	
		pw.println("Rating Not Done...");
		}
	    }
	    catch(Exception e)
	    {
	    pw.println(e);	
	    }
	}

}
