import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pp.Appointment;
import pp.Doctor;
import pp.PatientAccountBean;
import pp.RegisteredDao;

/**
 * Servlet implementation class UpdateApoint
 */
@WebServlet("/UpdateApoint")
public class UpdateApoint extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateApoint() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String d_id=request.getParameter("t1");
		int did=Integer.parseInt(d_id);
		String date=request.getParameter("bdaytime");
		HttpSession session=request.getSession();
		String email=(String)session.getAttribute("p_id");
		pp.RegisteredDao rd=new RegisteredDao();
		pp.RegisteredDao rd1=new RegisteredDao();
		pp.RegisteredDao rd2=new RegisteredDao();
		String apointment_id=request.getParameter("a_id");
		int apoint_id=Integer.parseInt(apointment_id);
		try{
		java.util.ArrayList<PatientAccountBean> a1=rd.ShowPro(email);
		PatientAccountBean p=a1.get(0);
		int bookedbya_id=p.getAccountId();
		java.util.ArrayList<Doctor> a2=rd1.ShowPro(did);
		Doctor d=a2.get(0);
		String h_id=d.getHospitalId();
		pp.Appointment pa=new Appointment();
		pa.setDoctorId(d_id);
		pa.setHospitalId(h_id);
		pa.setDate(date);
		pa.setBookedbyAccountId(bookedbya_id);
		pa.setAppointmentId(apoint_id);
	    int i=rd2.updateAppoint(pa);
	    if(i!=0)
	    {
	    RequestDispatcher rd8=request.getRequestDispatcher("MyAppointment.jsp");
	    rd8.include(request,response);
	    out.println("Updated...");
	    }
	    else
	    {
	    	
	    }
		}
		catch(Exception e)
		{
		out.println(e);
		}
	}

}
