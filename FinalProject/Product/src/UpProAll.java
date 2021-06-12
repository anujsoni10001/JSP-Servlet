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
		String Price=request.getParameter("Price");
		String Category=request.getParameter("Category");
		String Company=request.getParameter("Company");
		try 
		{
		int i=0;
	    Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eshop","root","root");
	    String qr="update Product set Name=?,Price=?,Category=?,Company=? where id=?";
	    PreparedStatement ps=con.prepareStatement(qr);
		ps.setString(1,Name);
		ps.setString(2,Price);
		ps.setString(3,Category);
		ps.setString(4,Company);
		ps.setString(5,id);
		i=ps.executeUpdate();
	    if(i!=0)
		{
	    RequestDispatcher rs=request.getRequestDispatcher("ShowPro");
	  	rs.include(request,response);
	  	pw.println("<h5 align=center>"+i+ " Record Updated Sucessfully...</h5>");
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
