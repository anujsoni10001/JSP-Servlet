

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Product;

/**
 * Servlet implementation class AddPro
 */
@WebServlet("/AddPro")
public class AddPro extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddPro() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String i=request.getParameter("id");
		
	int id=Integer.parseInt(i);
	String name=request.getParameter("name");
	String p=request.getParameter("price");
	int price=Integer.parseInt(p);
	String cat=request.getParameter("cat");
	String cmp=request.getParameter("cmp");
	Product p1=new Product();
	p1.setId(id);
	p1.setName(name);
	p1.setCat(cat);
	p1.setCmp(cmp);
	p1.setPrice(price);
	Session session=new Configuration().configure().buildSessionFactory().openSession();
	Transaction tx=session.beginTransaction();
	session.persist(p1);
	tx.commit();
	out.println("added");
	session.close();
	}

}
