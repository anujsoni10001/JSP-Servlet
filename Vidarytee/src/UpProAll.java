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
 * Servlet implementation class UpProAll
 */
@WebServlet("/UpProAll")
public class UpProAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpProAll() {
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
		String Name=request.getParameter("Name");
		String id=request.getParameter("id");
		String Mobileno=request.getParameter("Mobileno");
		String qua=request.getParameter("qua");
		String workskill=request.getParameter("workskill");
		try 
		{
		int i=0;
	    Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
	    String qr="update Student set Name=?,workskill=?,Mobileno=?,qua=? where id=?";
	    PreparedStatement ps=con.prepareStatement(qr);
		ps.setString(1,Name);
		ps.setString(2,workskill);
		ps.setString(3,Mobileno);
		ps.setString(4,qua);
		ps.setString(5,id);
		i=ps.executeUpdate();
	    if(i!=0)
		{
		response.sendRedirect("ShowStudent");
		}
		else
		{
         pw.println("Updation By ID Not Succesful");
		}
	    ps.close();
	  
    }
	catch (Exception e) 
	{
		// TODO Auto-generated catch block
		pw.println(e);
	}
	}

}
