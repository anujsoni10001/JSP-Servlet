import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pp.Creditcard;
import pp.RegisteredDao;

/**
 * Servlet implementation class Pay
 */
@WebServlet("/Pay")
public class Pay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pay() {
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
		String apt_id=request.getParameter("a_id");
		int aptid=Integer.parseInt(apt_id);
		String chargesRM=request.getParameter("charges");
		String CardNo=request.getParameter("card_number");
		String cvv=request.getParameter("cvv");
		String CardType=request.getParameter("card_type");
		String ExpiryDate=request.getParameter("expiry_date");
		System.out.println("card number"+CardNo);
		System.out.println("Security Code"+cvv);
		System.out.println("Card Type"+CardType);
		System.out.println("Expiry Date"+ExpiryDate);
		pp.Creditcard c1=new Creditcard();
		c1.setCardNo(CardNo);
		c1.setExpiryDate(ExpiryDate);
		c1.setCardType(cvv);
		c1.setSecurityCode(CardType);
		pp.RegisteredDao rd=new RegisteredDao();
		try{
		if(rd.VerifyCard(c1))
		{
		pp.Appointment a=new pp.Appointment();
		a.setStatus("Paid");
		a.setAppointmentId(aptid);
		int i=rd.updateAppointStatus(a);
		if(i!=0)
		{
		RequestDispatcher rd5=request.getRequestDispatcher("MyAppointment.jsp");
		rd5.include(request, response);
		pw.println("Paid Succesfully...");
		}
		}
		else
		{
		RequestDispatcher rd5=request.getRequestDispatcher("MyAppointment.jsp");
		rd5.include(request, response);
		pw.println("Not Paid Succesfully...");
		}
	    }
		catch(Exception e)
		{
		pw.println(e);
		}
		}
}