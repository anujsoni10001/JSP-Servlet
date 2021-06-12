

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
 * Servlet implementation class delPro
 */
@WebServlet("/delPro")
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
		try 
		{
		response.setContentType("text/html");
	    String id=request.getParameter("id");
		String tyservice=request.getParameter("tyservice");
		String ch=request.getParameter("b");
		String qr="";
		PreparedStatement ps;
		int i;
	    Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
	    switch(ch)
	    {
	    case "ID":qr="delete from addser where id=?";
	              ps=con.prepareStatement(qr);
		          ps.setString(1,id);
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
	    	      break;
	    case "tyservice":qr="delete from addser where tyservice=?";
	              ps=con.prepareStatement(qr);
                  ps.setString(1,tyservice);
    	          i=ps.executeUpdate();
  	              if(i!=0)
  	              {
  	              RequestDispatcher rd=request.getRequestDispatcher("delPro2.html");
  		    	  rd.include(request, response);
  		    	  pw.println("Deletion By Tyservice Succesful");
  	              }
  	              else
  	              {
  	              RequestDispatcher rd=request.getRequestDispatcher("delPro2.html");
  		    	  rd.include(request, response);
  		    	  pw.println("Deletion By Tyservice Not Succesful");
  	              }
                  break;
	    }
		
	
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block
	 pw.println(e);
	}
	}

}
