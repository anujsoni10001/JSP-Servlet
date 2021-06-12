import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd=request.getRequestDispatcher("Showser");
		rd.include(request, response);
		PrintWriter pw=response.getWriter();
		String Search=request.getParameter("search");
		try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
		String qr="select * from addser where tyservice=?";
		PreparedStatement ps=con.prepareStatement(qr);
		ps.setString(1,Search);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
		pw.println("<table align='center' border=1>");
		pw.println("<th>id</th><th>tyservice</th><th>Location</th><th>mnumber</th><th>t</th><th>t1</th><th>a</th>");
	    do
		{
		String id=rs.getString("id");
		String tyservice=rs.getString("tyservice");
		String Location=rs.getString("Location");
		String mnumber=rs.getString("mnumber");
		String t=rs.getString("t");
		String t1=rs.getString("t1");
		String a=rs.getString("a");
		pw.println("<tr>");
	    pw.println("<td>");
	    pw.println(id);
	    pw.println("</td>");
        pw.println("<td>");
        pw.println(tyservice);
	    pw.println("</td>");
        pw.println("<td>");
        pw.println(Location);
	    pw.println("</td>");
        pw.println("<td>");
        pw.println(mnumber);
	    pw.println("</td>");
        pw.println("<td>");
        pw.println(t);
	    pw.println("</td>");
	    pw.println("<td>");
        pw.println(t1);
	    pw.println("</td>");
	    pw.println("<td>");
        pw.println(a);
	    pw.println("</td>");
	    pw.println("</tr>");
        }while(rs.next());
	    pw.println("</table>");
		} 
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
		pw.println(e);
		}
		
	}

}
