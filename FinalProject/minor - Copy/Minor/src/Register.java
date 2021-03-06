import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Register() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String email=request.getParameter("email");
		String Password=request.getParameter("pwd");
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");
		String qr="insert into accounts(Email,Password) values(?,?)";
		PreparedStatement ps=con.prepareStatement(qr);
		ps.setString(1,email);
		ps.setString(2,Password);
		int i=ps.executeUpdate();
		if(i!=0)
		{
		con.close();
		response.sendRedirect("Login.html");
		}
		else
		{
		RequestDispatcher rd=request.getRequestDispatcher("register.html");
		rd.include(request, response);
		out.println("SignUp Failure....!!! Try Again");
		con.close();
		}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
		out.println(e);
		}
	}

}
