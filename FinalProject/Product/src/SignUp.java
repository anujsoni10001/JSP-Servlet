

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
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String mobile=request.getParameter("mobile");
		String email=request.getParameter("email");
		String Password=request.getParameter("password");
		String dob=request.getParameter("dob");
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eshop","root","root");
		String qr="insert into SignUp values(?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(qr);
		ps.setString(1,fname);
		ps.setString(2,lname);
		ps.setString(3,mobile);
		ps.setString(4,email);
		ps.setString(5,Password);
		ps.setString(6,dob);
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
