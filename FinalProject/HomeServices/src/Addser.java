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
 * Servlet implementation class Addser
 */
@WebServlet("/Addser")
public class Addser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		String id=request.getParameter("id");
		String tyservice=request.getParameter("tyservice");
		String Location=request.getParameter("Location");
		String mnumber=request.getParameter("mnumber");
		String t=request.getParameter("t");
		String t1=request.getParameter("t1");
		String a[]=request.getParameterValues("a");
		String b="";
		for(int i=0;i<a.length;i++)
		{
		b=a[i]+b;
		}
		try 
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
		String qr="insert into addser values(?,?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(qr);
		ps.setString(1,id);
		ps.setString(2,tyservice);
		ps.setString(3,Location);
		ps.setString(4,mnumber);
		ps.setString(5,t);
		ps.setString(6,t1);
		ps.setString(7,b);
		int i=ps.executeUpdate();
     	if(i!=0)
	    {
	    RequestDispatcher rd=request.getRequestDispatcher("Addser2.html");
	    rd.include(request,response);
	    pw.println("Insertion Succesful...");
	    }
	    else
	    {
	    RequestDispatcher rd=request.getRequestDispatcher("Addser2.html");
		rd.include(request,response);
	    pw.println("Insertion Not Succesful...");
      	} 
	    }
	    catch (Exception e) 
	    {
        pw.println(e);
	    }
}
}