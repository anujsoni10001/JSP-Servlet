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
		String sid=request.getParameter("sid");
		String sname=request.getParameter("sname");
		String mno=request.getParameter("mno");
		String qua=request.getParameter("qua");
		String c=request.getParameter("c");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
		    String qr="insert into Student values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(qr);
			ps.setString(1,sid);
			ps.setString(2,sname);
			ps.setString(3,mno);
			ps.setString(4,qua);
			ps.setString(5,c);
			int i=ps.executeUpdate();
		if(i!=0)
		{
		pw.println("Insertion Succesful");
		}
		else
		{
		pw.println("Insertion Not Succesful");
		}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
		pw.println(e);
		}
	}

}
