

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class show
 */
@WebServlet("/show")
public class show extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public show() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","root");
			String qr="select * from product";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(qr);
			out.println("<table border=1px align=center>");
			out.println("<tr>");
			out.println("<td>");
			out.println("ID");
			out.println("</td>");
			out.println("<td>");
			out.println("NAME");
			out.println("</td>");
			out.println("<td>");
			out.println("CAT");
			out.println("</td>");
			out.println("<td>");
			out.println("CMP");
			out.println("</td>");
			out.println("</tr>");
			while(rs.next())
			{
				String id=rs.getString("id");
				String name=rs.getString("name");
				String cat=rs.getString("cat");
				String cmp=rs.getString("cmp");
				out.println("<tr>");
				out.println("<td>");
				out.println(id);
				out.println("</td>");
				out.println("<td>");
				out.println(name);
				out.println("</td>");
				out.println("<td>");
				out.println(cat);
				out.println("</td>");
				out.println("<td>");
				out.println(cmp);
				out.println("</td>");
				out.println("<td>");
				out.println("<a href=delete?id="+id+">Delete</a>");
				out.println("</td>");
				out.println("<td>");
				out.println("<a href=update?id="+id+"&name="+name+"&cat="+cat+"&cmp="+cmp+">Update</a>");
				out.println("</td>");
				out.println("</tr>");
			}
			out.println("</table>");
		} catch (Exception e) {
			
			out.println(e);
		}
	}

}
