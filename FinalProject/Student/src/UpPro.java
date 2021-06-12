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
 * Servlet implementation class UpPro
 */
@WebServlet("/UpPro")
public class UpPro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpPro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws NullPointerException,ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
	    response.setContentType("text/html");
		try 
		{
	    String sid=request.getParameter("sid");
	    String scat=request.getParameter("scat");
		String catuval=request.getParameter("catuval");
	    String qr="";
		PreparedStatement ps;
		int i=0;
	    Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
	    switch(scat)
	    {
	    case "Name":qr="update Student set Name=? where Id=?";
	              ps=con.prepareStatement(qr);
		          ps.setString(1,catuval);
		          ps.setString(2,sid);
		      	  i=ps.executeUpdate();
		    	  if(i!=0)
		    	  {
		    	  pw.println("Updation By ID Succesful");
		    	  }
		    	  else
		    	  {
		    	  pw.println("Updation By ID Not Succesful");
		    	  }
		    	  ps.close();
	    	      break;
	    case "Mobileno":qr="update Student set Mobileno=? where Id=?";
                    ps=con.prepareStatement(qr);
                    ps.setString(1,catuval);
                    ps.setString(2,sid);
    	            i=ps.executeUpdate();
  	                if(i!=0)
  	                {
  	                pw.println("Updation By ID Succesful");
  	                }
  	                else
  	                {
  	                pw.println("Updation By ID Not Succesful");
  	                }
  	                ps.close();
	                break;
	    case "qua":qr="update Student set qua=? where Id=?";
                        ps=con.prepareStatement(qr);
                        ps.setString(1,catuval);
                        ps.setString(2,sid);
                        i=ps.executeUpdate();
                        if(i!=0)
                        {
                        pw.println("Updation By ID Succesful");
                        }
                        else
                        {
                        pw.println("Updation By ID Not Succesful");
                        }
                        ps.close();
                        break;
	    case "workskill":qr="update Student set workskill=? where Id=?";
                       ps=con.prepareStatement(qr);
                       ps.setString(1,catuval);
                       ps.setString(2,sid);
                       i=ps.executeUpdate();
                       if(i!=0)
                       {
                       pw.println("Updation By ID Succesful");
                       }
                       else 
                       {
                        pw.println("Updation By ID Not Succesful");
                       }
                       ps.close();
                       break;
	    }	
	    }
	catch (Exception e) {
		// TODO Auto-generated catch block
		pw.println(e);
	}
	}

}
