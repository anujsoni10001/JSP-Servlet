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
		
	    String id=request.getParameter("id");
	    String Category=request.getParameter("Category");
		String catuval=request.getParameter("catuval");
	    String qr="";
		PreparedStatement ps;
		int i=0;
	    Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eshop","root","root");
	    switch(Category)
	    {
	    case "Name":qr="update Product set Name=? where id=?";
	              ps=con.prepareStatement(qr);
		          ps.setString(1,catuval);
		          ps.setString(2,id);
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
	    case "Price":qr="update Product set Price=? where id=?";
                    ps=con.prepareStatement(qr);
                    ps.setString(1,catuval);
                    ps.setString(2,id);
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
	    case "Category":qr="update Product set Category=? where id=?";
                        ps=con.prepareStatement(qr);
                        ps.setString(1,catuval);
                        ps.setString(2,id);
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
	    case "Company":qr="update Product set Company=? where id=?";
                       ps=con.prepareStatement(qr);
                       ps.setString(1,catuval);
                       ps.setString(2,id);
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
	catch (Exception e) 
	{
		// TODO Auto-generated catch block
		pw.println(e);
	}
	}
}

