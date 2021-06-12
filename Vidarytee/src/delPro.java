

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
		try 
		{
		PrintWriter pw=response.getWriter();
	    response.setContentType("text/html");
	    String Id=request.getParameter("Id");
		String Name=request.getParameter("Name");
		String ch=request.getParameter("b");
		String qr="";
		PreparedStatement ps;
		int i;
	    Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
	    switch(ch)
	    {
	    case "ID":qr="delete from Student where Id=?";
	              ps=con.prepareStatement(qr);
		          ps.setString(1,Id);
		      	  i=ps.executeUpdate();
		    	  if(i!=0)
		    	  {
		    	  pw.println("Deletion By ID Succesful");
		    	  }
		    	  else
		    	  {
		    	  pw.println("Deletion By ID Not Succesful");
		    	  }
	    	      break;
	    case "NAME":qr="delete from Product where Name=?";
	              ps=con.prepareStatement(qr);
                  ps.setString(1,Name);
    	          i=ps.executeUpdate();
  	              if(i!=0)
  	              {
  	              pw.println("Deletion By Name Succesful");
  	              }
  	              else
  	              {
  	              pw.println("Deletion By Name Not Succesful");
  	              }
                  break;
	    }
		
	
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
	}

}
