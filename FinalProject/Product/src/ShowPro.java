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
 * Servlet implementation class ShowPro
 */
@WebServlet("/ShowPro")
public class ShowPro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowPro() {
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
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eshop","root","root");
			Statement st=con.createStatement();
			String qr="select * from Product";
			ResultSet rs=st.executeQuery(qr);
			if(rs.next())
			{
			pw.println("<table align='center' border=1>");
			pw.println("<th>Name</th><th>Price</th><th>Category</th><th>Company</th><th>id</th>");
		    do
			{
			String Name=rs.getString("Name");
			String Price=rs.getString("Price");
			String Category=rs.getString("Category");
			String Company=rs.getString("Company");
			String id=rs.getString("id");
			pw.println("<tr>");
		    pw.println("<td>");
		    pw.println(Name);
		    pw.println("</td>");
            pw.println("<td>");
            pw.println(Price);
		    pw.println("</td>");
            pw.println("<td>");
            pw.println(Category);
		    pw.println("</td>");
            pw.println("<td>");
            pw.println(Company);
		    pw.println("</td>");
            pw.println("<td>");
            pw.println(id);
		    pw.println("</td>");
		    pw.println("<td>");
		    ///CONCEPT OF URL REWRITING 
		    pw.println("<a href=Delete?id="+id+">Delete</a>");
		    //// addPro?id=&productname=&price=&cat=Mobile&com=LG //
		    pw.println("</td>");
		    pw.println("<td>");
		    ///CONCEPT OF URL REWRITING 
		    pw.println("<a href=Updatehff?id="+id+"&Name="+Name+"&Price="+Price+"&Category="+Category+"&Company="+Company+">Update</a>");
		    /// Update?id=id&Name=name&Price=price&Category=category&Company=comapany
		    pw.println("</td>");
		    pw.println("</tr>");
	        }while(rs.next());
		    pw.println("</table>");
			}
			else
			{
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			pw.println(e);
		}
		
	}

}
