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
 * Servlet implementation class UpdateProduct
 */
@WebServlet("/UpdateProduct")
public class UpdateProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProduct() {
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
	    String re=request.getParameter("request");
	    String update=request.getParameter("updatefield");
	    String qr="";
		PreparedStatement ps;
		int i=0;
	    Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
	    switch(re)
	    {
	    case "tyservice":qr="update addser set tyservice=? where id=?";
	              ps=con.prepareStatement(qr);
		          ps.setString(1,update);
		          ps.setString(2,id);
		      	  i=ps.executeUpdate();
		    	  if(i!=0)
		    	  {
		    	  RequestDispatcher rd=request.getRequestDispatcher("Update.html");
		    	  rd.include(request, response);
		    	  pw.println("Updation By ID Succesful");
		    	  }
		    	  else
		    	  {
		    	  RequestDispatcher rd=request.getRequestDispatcher("Update.html");
			      rd.include(request, response);
		    	  pw.println("Updation By ID Not Succesful");
		    	  }
		    	  ps.close();
	    	      break;
	    case "Location":qr="update addser set Location=? where id=?";
                    ps=con.prepareStatement(qr);
                    ps.setString(1,update);
                    ps.setString(2,id);
    	            i=ps.executeUpdate();
  	                if(i!=0)
  	                {
  	                RequestDispatcher rd=request.getRequestDispatcher("Update.html");  	 			    rd.include(request, response);
  	                pw.println("Updation By ID Succesful");
  	                }
  	                else
  	                {
  	                RequestDispatcher rd=request.getRequestDispatcher("Update.html");
  	 			    rd.include(request, response);
  	                pw.println("Updation By ID Not Succesful");
  	                }
  	                ps.close();
	                break;
	    case "mnumber":qr="update addser set mnumber=? where id=?";
                        ps=con.prepareStatement(qr);
                        ps.setString(1,update);
                        ps.setString(2,id);
                        i=ps.executeUpdate();
                        if(i!=0)
                        {
                        RequestDispatcher rd=request.getRequestDispatcher("Update.html");
           			    rd.include(request, response);
                        pw.println("Updation By ID Succesful");
                        }
                        else
                        {
                        RequestDispatcher rd=request.getRequestDispatcher("Update.html");
           			    rd.include(request, response);
                        pw.println("Updation By ID Not Succesful");
                        }
                        ps.close();
                        break;
	    case "t":qr="update addser set t=? where id=?";
                       ps=con.prepareStatement(qr);
                       ps.setString(1,update);
                       ps.setString(2,id);
                       i=ps.executeUpdate();
                       if(i!=0)
                       {
                       RequestDispatcher rd=request.getRequestDispatcher("Update.html");
         			   rd.include(request, response);
                       pw.println("Updation By ID Succesful");
                       }
                       else 
                       {
                       RequestDispatcher rd=request.getRequestDispatcher("Update.html");
         			   rd.include(request, response);
                       pw.println("Updation By ID Not Succesful");
                       }
                       ps.close();
                       break;
	    case "t1":qr="update addser set t1=? where id=?";
                 ps=con.prepareStatement(qr);
                 ps.setString(1,update);
                 ps.setString(2,id);
                 i=ps.executeUpdate();
                 if(i!=0)
                 {
                 RequestDispatcher rd=request.getRequestDispatcher("Update.html");
   			     rd.include(request, response);
                 pw.println("Updation By ID Succesful");
                 }
                 else 
                 {
                 RequestDispatcher rd=request.getRequestDispatcher("Update.html");
   			     rd.include(request, response);
                 pw.println("Updation By ID Not Succesful");
                 }
                 ps.close();
                 break;
	    case "a":qr="update addser set a=? where id=?";
                 ps=con.prepareStatement(qr);
                 ps.setString(1,update);
                 ps.setString(2,id);
                 i=ps.executeUpdate();
                 if(i!=0)
                 {
                 RequestDispatcher rd=request.getRequestDispatcher("Update.html");
   			     rd.include(request, response);
                 pw.println("Updation By ID Succesful");
                 }
                 else 
                 {
                 RequestDispatcher rd=request.getRequestDispatcher("Update.html");
   			     rd.include(request, response);
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

