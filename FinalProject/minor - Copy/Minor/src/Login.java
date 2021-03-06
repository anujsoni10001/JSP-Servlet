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
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		String email=request.getParameter("email");
		String password=request.getParameter("pwd");
		String choice=request.getParameter("cars");
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");
		if(choice.equals("Patient"))
		{
		String qr="select * from accounts where Email=? and Password=?";
		PreparedStatement ps=con.prepareStatement(qr);
		ps.setString(1,email);
		ps.setString(2,password);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
		con.close();
		///Concept of HttpSession Interface
		HttpSession session=request.getSession();
		//UpCasting
		session.setAttribute("p_id",email);
		response.sendRedirect("home.html");
		}
		else
		{
		RequestDispatcher rd=request.getRequestDispatcher("Login.html");
		rd.include(request,response);
		pw.println("Invalid id and Password..");
		con.close();
	    }
        }
		else
		{
		String qr="select * from Staff where Email=? and Password=?";
		PreparedStatement ps=con.prepareStatement(qr);
		ps.setString(1,email);
		ps.setString(2,password);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
		con.close();
		///Concept of HttpSession Interface
		HttpSession session=request.getSession();
		//UpCasting
		session.setAttribute("s_id",email);
		response.sendRedirect("staffhome.html");
		}
		else
		{
		con.close();
		RequestDispatcher rd=request.getRequestDispatcher("Login.html");
		rd.include(request,response);
		pw.println("Invalid id and Password..");
		}
		}
		}
		catch(Exception e)
		{
		pw.println(e);
		}
	}
}