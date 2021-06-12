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
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete() {
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
		try 
		{
		String id=request.getParameter("id");
		int i;
	    Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eshop","root","root");
	    String qr="delete from Product where id=?";
	    PreparedStatement ps=con.prepareStatement(qr);
        ps.setString(1,id);
    	i=ps.executeUpdate();
  	    if(i!=0)
  	    {
  	    RequestDispatcher rs=request.getRequestDispatcher("ShowPro");
  	    rs.include(request,response);
  	    pw.println("<h5 align=center>"+i+ " Record Deleted Sucessfully...</h5>");
  	    }
  	    else
  	    {
  	    pw.println("Deletion By id Not Succesful");
  	    }
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block
		pw.println(e);
	}
	}

}
