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
 * Servlet implementation class UpProbyname
 */
@WebServlet("/UpProbyname")
public class UpProbyname extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpProbyname() {
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
	    String name=request.getParameter("name");
	    String scat=request.getParameter("scat");
	    String catuval=request.getParameter("catuval");
	    String qr="";
	    PreparedStatement ps1;
	    int i=0;
	    Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
		 switch(scat)
		    {
		    case "Id":qr="update Student set Id=? where Name=?";
		              ps1=con.prepareStatement(qr);
			          ps1.setString(1,catuval);
			          ps1.setString(2,name);
			      	  i=ps1.executeUpdate();
			    	  if(i!=0)
			    	  {
			    	  pw.println("Updation By ID Succesful");
			    	  }
			    	  else
			    	  {
			    	  pw.println("Updation By ID Not Succesful");
			    	  }
			    	  ps1.close();
		    	      break;
		    case "Mobileno":qr="update Student set Mobileno=? where Name=?";
				         ps1=con.prepareStatement(qr);
	                     ps1.setString(1,catuval);
	                     ps1.setString(2,name);
	    	             i=ps1.executeUpdate();
	  	                 if(i!=0)
	  	                 {
	  	                 pw.println("Updation By ID Succesful");
	  	                 }
	  	                 else
	  	                 {
	  	                 pw.println("Updation By ID Not Succesful");
	  	                 }
	  	                 ps1.close();
		                 break;
		    case "qua":qr="update Student set qua=? where Name=?";
	                        ps1=con.prepareStatement(qr);
	                        ps1.setString(1,catuval);
	                        ps1.setString(2,name);
	                        i=ps1.executeUpdate();
	                        if(i!=0)
	                        {
	                        pw.println("Updation By ID Succesful");
	                        }
	                        else
	                        {
	                        pw.println("Updation By ID Not Succesful");
	                        }
	                        ps1.close();
	                        break;
		    case "workskill":qr="update Student set workskill=? where Name=?";
	                       ps1=con.prepareStatement(qr);
	                       ps1.setString(1,catuval);
	                       ps1.setString(2,name);
	                       i=ps1.executeUpdate();
	                       if(i!=0)
	                       {
	                       pw.println("Updation By ID Succesful");
	                       }
	                       else 
	                       {
	                        pw.println("Updation By ID Not Succesful");
	                       }
	                       ps1.close();
	                       break;
		    }	
	    }
	catch (Exception e) {
		// TODO Auto-generated catch block
	pw.println(e);
	}
	}

}
