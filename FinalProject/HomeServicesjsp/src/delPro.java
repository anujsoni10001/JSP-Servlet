

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
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class delPro
 */
@WebServlet("/abc")
public class delPro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public delPro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		HttpSession newSession = request.getSession();
        String sid=(String)newSession.getAttribute("sid");
		try 
		{
		response.setContentType("text/html");
	    String id=request.getParameter("id");
	    PreparedStatement ps;
		int i;
	    Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
	    String qr="delete from addser where id=? and sid=?";
	              ps=con.prepareStatement(qr);
		          ps.setString(1,id);
		          ps.setString(2,sid);
		      	  i=ps.executeUpdate();
		    	  if(i!=0)
		    	  {
		    	  RequestDispatcher rd=request.getRequestDispatcher("delPro2.html");
		    	  rd.include(request, response);
		    	  pw.println("Deletion By ID Succesful");
		    	  }
		    	  else
		    	  {
		    	  RequestDispatcher rd=request.getRequestDispatcher("delPro2.html");
			      rd.include(request, response);
			      pw.println("Deletion By ID Not Succesful");
		    	  }
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block
	 pw.println(e);
	}
	}
}
