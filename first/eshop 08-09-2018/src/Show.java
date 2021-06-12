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
 * Servlet implementation class Show
 */
@WebServlet("/Show")
public class Show extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Show() {
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
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eshop","root","root");
			String qr="select * from product";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(qr);
			if(rs.next())
			{
				out.println("<table align=center border=1>");
				out.println("<th>NAME</th><th>PRICE</th><th>CAT</th><th>CMP</th>");
				do
				{
					String name=rs.getString("name");
					String price=rs.getString("price");
					String cat=rs.getString("cat");
					String cmp=rs.getString("cmp");
					out.println("<tr>");
					out.println("<td>");
					out.println(name);
					out.println("</td>");
					out.println("<td>");
					out.println(price);
					out.println("</td>");
					out.println("<td>");
					out.println(cat);
					out.println("</td>");
					out.println("<td>");
					out.println(cmp);
					out.println("</td>");
					out.println("<td>");
					out.println("<a href=Delete?name="+name+">Delete</a>");
					out.println("</td>");
					out.println("<td>");
					out.println("<a href=UpdatePro?name="+name+"&price="+price+"&cat="+cat+"&cmp="+cmp+">update</a>");
					out.println("</td>");
					out.println("</tr>");
				}while(rs.next());
				out.println("</table>");
			}else
			{
				out.println("no records found");
			}
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.println(e);
		}
	}

}










