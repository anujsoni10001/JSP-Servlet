import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pp.RegisteredDao;
import pp.Staff;

/**
 * Servlet implementation class RegisterStaff
 */
@WebServlet("/RegisterStaff")
public class RegisterStaff extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterStaff() {
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
		String hname=request.getParameter("hname");
		String position=request.getParameter("pos");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String nric=request.getParameter("nric");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		String email=request.getParameter("email");
		String pwd=request.getParameter("pwd");
		RegisteredDao rd=new RegisteredDao();
		try
		{
		java.util.ArrayList<pp.Hospital> h=rd.ShowHospitalId(hname);
		pp.Hospital hos=h.get(0);
		String hos_id=hos.getHospitalId();
		pp.Staff s=new Staff();
		s.setEmail(email);
		s.setPassword(pwd);
		s.setFirstName(fname);
		s.setLastName(lname);
		s.setICNumber(nric);
		s.setTelephone(phone);
		s.setAddress(address);
        s.setPosition(position);
        s.setHospitalId(hos_id);
        int i=rd.addStaff(s);
        if(i!=0)
        {
        pw.println("done...");	
        }
        else
        {
        	
        }
		}
		catch(Exception e)
		{
		pw.println(e);
		}
		}

}
