

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
@WebServlet("/ShowStudent")
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
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
			Statement st=con.createStatement();
			String qr="select * from Student";
			ResultSet rs=st.executeQuery(qr);
			if(rs.next())
			{
			pw.println("<table align='center' border=1>");
			pw.println("<th>Id</th><th>Name</th><th>Mobileno</th><th>qua</th><th>workskill</th>");
		    do
			{
			String id=rs.getString("Id");
			String Name=rs.getString("Name");
			String Mobileno=rs.getString("Mobileno");
			String qua=rs.getString("qua");
			String workskill=rs.getString("workskill");
			pw.println("<tr>");
		    pw.println("<td>");
		    pw.println(id);
		    pw.println("</td>");
            pw.println("<td>");
            pw.println(Name);
		    pw.println("</td>");
            pw.println("<td>");
            pw.println(Mobileno);
		    pw.println("</td>");
            pw.println("<td>");
            pw.println(qua);
		    pw.println("</td>");
            pw.println("<td>");
            pw.println(workskill);
		    pw.println("</td>");
		    pw.println("<td>");
            pw.println("<a href=Delete?id="+id+">Delete</a>");
		    pw.println("</td>");
		    pw.println("<td>");
            pw.println("<a href=Updatehff?id="+id+"&Name="+Name+"&Mobileno="+Mobileno+"&qua="+qua+"&workskill="+workskill+">Update</a>");
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
