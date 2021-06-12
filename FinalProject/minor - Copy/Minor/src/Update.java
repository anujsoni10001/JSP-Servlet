import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String lname=request.getParameter("lname");
		String fname=request.getParameter("fname");
		String telephone=request.getParameter("telephone");
		String address=request.getParameter("address");
		HttpSession session=request.getSession();
		String email=(String)session.getAttribute("p_id");
		pp.PatientAccountBean pb=new pp.PatientAccountBean();
		pb.setLastName(lname);
		pb.setFirstName(fname);
		pb.setTelephone(telephone);
		pb.setAddress(address);
		pb.setEmail(email);
		pp.RegisteredDao rd=new pp.RegisteredDao();
		try {
			int i=rd.update(pb);
			if(i!=0)
			{
			RequestDispatcher rd1=request.getRequestDispatcher("MyAccount.jsp");
			rd1.include(request,response);
			out.println(i+" Upadation Succesful.. ");
			}
			else
			{
		     RequestDispatcher rd1=request.getRequestDispatcher("MyAccount.jsp");
		     rd1.include(request,response);
			 out.println(i+"Updation Not Succesful.. ");
			}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
		out.println(e);
		} 
	}

}
