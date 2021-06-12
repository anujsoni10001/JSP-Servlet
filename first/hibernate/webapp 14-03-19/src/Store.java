

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Student;
import pp.Trianer;

/**
 * Servlet implementation class Store
 */
@WebServlet("/Store")
public class Store extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Store() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		String tid=request.getParameter("id");
		int id=Integer.parseInt(tid);
		String name=request.getParameter("name");
		String t1=request.getParameter("t1");
		int l=Integer.parseInt(t1);
		Trianer t=new Trianer();
		t.setId(id);
		t.setName(name);
		HashSet<Student> hs=new HashSet<Student>();
		for(int i=1;i<=l;i++)
		{
			String sids=request.getParameter("sid"+i+"");
			String stname=request.getParameter("stname"+i+"");
			String course=request.getParameter("course"+i+"");
			int sid=Integer.parseInt(sids);
			Student s1=new Student();
			s1.setSid(sid);
			s1.setStname(stname);
			s1.setCourse(course);
			hs.add(s1);
		}
		t.setSname(hs);
		session.save(t);
		tx.commit();
		session.close();
		RequestDispatcher rd=request.getRequestDispatcher("index.html");
	rd.include(request, response);
	out.println("<script>window.alert('successfully added');</script>");
	
	}

}
