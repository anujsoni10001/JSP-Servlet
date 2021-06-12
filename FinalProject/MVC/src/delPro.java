

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pp.ProductBean;

/**
 * Servlet implementation class delPro
 */
@WebServlet("/delPro")
public class delPro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public delPro() {
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
		ProductBean pb=new ProductBean();
		pb.setId(id);
		pp.RegisteredDao rd=new pp.RegisteredDao();
		try {
			int i=rd.delete(pb);
			if(i!=0)
			{
			out.println(i+" Deletion Succesful.. ");
			}
			else
			{
			out.println(i+"Deletion Not Succesful.. ");
			}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
		out.println(e);
		} 
	}

}
