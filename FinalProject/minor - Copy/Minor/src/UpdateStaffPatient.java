

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pp.PatientAccountBean;
import pp.RegisteredDao;

/**
 * Servlet implementation class UpdateStaffPatient
 */
@WebServlet("/UpdateStaffPatient")
public class UpdateStaffPatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStaffPatient() {
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
		String a_id=request.getParameter("a_id");
		int accountid=Integer.parseInt(a_id);
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String telephone=request.getParameter("telephone");
		String address=request.getParameter("address");
		pp.PatientAccountBean p=new PatientAccountBean();
		p.setAccountId(accountid);
		p.setFirstName(fname);
		p.setLastName(lname);
		p.setEmail(email);
		p.setTelephone(telephone);
		p.setAddress(address);
		pp.RegisteredDao r=new RegisteredDao();
		try
		{
		int i=r.updateStaffPatient(p);
		if(i!=0)
		{
		RequestDispatcher rd=request.getRequestDispatcher("patientrecord.jsp");
		rd.include(request, response);
		pw.println("done..");
		}
		else
		{
		RequestDispatcher rd=request.getRequestDispatcher("patientrecord.jsp");
		rd.include(request, response);
		pw.println("Not done..");	
		}
	    }
		catch(Exception e)
		{
		pw.println(e);
		}
	}

}
