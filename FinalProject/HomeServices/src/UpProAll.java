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
		String id=request.getParameter("id");
		String tyservice=request.getParameter("tyservice");
		String Location=request.getParameter("Location");
		String mnumber=request.getParameter("mnumber");
		String t=request.getParameter("t");
		String t1=request.getParameter("t1");
		String a=request.getParameter("a");
		try 
		{
		int i=0;
	    Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
	    String qr="update addser set id=?,tyservice=?,Location=?,mnumber=?,t=?,t1=?,a=? where id=?";
	    PreparedStatement ps=con.prepareStatement(qr);
		ps.setString(1,id);
		ps.setString(2,tyservice);
		ps.setString(3,Location);
		ps.setString(4,mnumber);
		ps.setString(5,t);
		ps.setString(6,t1);
		ps.setString(7,a);
		ps.setString(8,id);
		i=ps.executeUpdate();
	    if(i!=0)
		{
		response.sendRedirect("UpPro2.html");
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
