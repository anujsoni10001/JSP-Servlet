import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ULogIn
 */
@WebServlet("/ULogIn")
public class ULogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ULogIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eshop","root","root");
		String qr="select * from SignUp where email=? and password=?";
		PreparedStatement ps=con.prepareStatement(qr);
		ps.setString(1,email);
		ps.setString(2,password);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
	    ///Concept of HttpSession Interface
		HttpSession session=request.getSession();
		//UpCasting
		session.setAttribute("id",email);
		response.sendRedirect("Uhome.jsp");	
		}
		else
		{
	    RequestDispatcher rd=request.getRequestDispatcher("ULogIn.html");
	    rd.include(request,response);
	    pw.println("Invalid id and Password..");
		}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			pw.println(e);
		}
		
		
	}

}
