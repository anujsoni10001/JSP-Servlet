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
 * Servlet implementation class addPro
 */
@WebServlet("/addPro")
public class addPro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addPro() {
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
		String id=request.getParameter("id");
		String productname=request.getParameter("productname");
		String price=request.getParameter("price");
		String cat=request.getParameter("cat");
		String com=request.getParameter("com");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eshop","root","root");
		    String qr="insert into Product values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(qr);
			ps.setString(5,id);
			ps.setString(1,productname);
			ps.setString(2,price);
			ps.setString(3,cat);
			ps.setString(4,com);
			int i=ps.executeUpdate();
		if(i!=0)
		{
		RequestDispatcher rd=request.getRequestDispatcher("ShowPro");
	    rd.include(request,response);
	    pw.println("<h4>Insertion of Id"+id+" Successful.....</h4>");
		}
		else
		{
		RequestDispatcher rd=request.getRequestDispatcher("addPro.html");
		rd.include(request,response);
		pw.println("Insertion Not Succesful");
		}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
	   RequestDispatcher rd=request.getRequestDispatcher("addPro.html");
	   rd.include(request,response);
	   pw.println(e);
		}
		
	}

}
