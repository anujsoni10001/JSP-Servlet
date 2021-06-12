
//This is Controller Section of MVC//

//Use of JSP in this page by using <jsp-usebean> concept is easy//
//We Need Not to write the code request.getparameter() again and again//
//java set-property and java-get-property//
//But in Servlet this Concept is Not Available ///
//So we have to write the All code again and again request.getparameter in Servlet//
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pp.ProductBean;

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
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String cat=request.getParameter("cat");
		String cmp=request.getParameter("cmp");
		String price=request.getParameter("price");
		ProductBean pb=new ProductBean();
		pb.setCat(cat);
		pb.setCmp(cmp);
		pb.setId(id);
		pb.setName(name);
		pb.setPrice(price);
		pp.RegisteredDao rd=new pp.RegisteredDao();
		try {
			int i=rd.addPro(pb);
			if(i!=0)
			{
			out.println(i+" Product Addition Succesful.. ");
			}
			else
			{
			out.println(i+" Product Addition Not Succesful.. ");
			}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
		out.println(e);
		} 
	}

}
