import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class upPro
 */
@WebServlet("/upPro")
public class upPro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public upPro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String cat=request.getParameter("cat");
		String cmp=request.getParameter("cmp");
		String price=request.getParameter("price");
		pp.ProductBean pb=new pp.ProductBean();
		pb.setCat(cat);
		pb.setCmp(cmp);
		pb.setId(id);
		pb.setName(name);
		pb.setPrice(price);
		pp.RegisteredDao rd=new pp.RegisteredDao();
		try {
			int i=rd.update(pb);
			if(i!=0)
			{
			out.println(i+" Upadation Succesful.. ");
			}
			else
			{
			out.println(i+"Updation Not Succesful.. ");
			}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
		out.println(e);
		} 
	}

	}
