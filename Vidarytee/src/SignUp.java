

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
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
		String sfname=request.getParameter("sfname");
		String slname=request.getParameter("slname");
		String smobile=request.getParameter("smobile");
		String semail=request.getParameter("semail");
		String sPassword=request.getParameter("spassword");
		String sdob=request.getParameter("sdob");
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
		String qr="insert into SignUp values(?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(qr);
		ps.setString(1,sfname);
		ps.setString(2,slname);
		ps.setString(3,smobile);
		ps.setString(4,semail);
		ps.setString(5,sPassword);
		ps.setString(6,sdob);
		int i=ps.executeUpdate();
		if(i!=0)
		{
		response.sendRedirect("ULogIn.html");
		}
		else
		{
		pw.println("SignUp Failure....!!! Try Again");
		}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
		pw.println(e);
		}
		
		
	}
}
