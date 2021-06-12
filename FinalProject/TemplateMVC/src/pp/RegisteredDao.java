package pp;
//In MVC Make Bean Class and RegisteredDao Class in different but in same pacakage//
//This is the DAO Class known as the Direct Access Object//
//This is Model of MVC//
//##Drawbacks of Java Advanced Covered Server-heavy-Weight//
//Here Connection is established only 1 time//
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class RegisteredDao {
	
	Connection con;
	public Connection getConnect() throws ClassNotFoundException, SQLException 
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
	return con;
	}
	public int addUser(UserSignUp u) throws ClassNotFoundException, SQLException
	{
	int i=0;
	con=getConnect();
	 ///Remember Query///
    //insert table tablename -XXXX...Wrong//
    //Wrong Syntax Putted...in the Mid-Sam-Exam//
    String qr="insert into user(email,pwd,name) values(?,?,?)";
    PreparedStatement ps=con.prepareStatement(qr);
    ps.setString(3,u.getName());
    ps.setString(1,u.getEmail());
    ps.setString(2,u.getPwd());
    i=ps.executeUpdate();
   return i;
	}
	public java.util.ArrayList<UserSignUp> ShowUser() throws ClassNotFoundException, SQLException
	{
    java.util.ArrayList<pp.UserSignUp> a1=new java.util.ArrayList<pp.UserSignUp>();
    con=getConnect();
    String qr="select * from user";
    java.sql.Statement ps=con.createStatement();
    ResultSet rs=ps.executeQuery(qr);
    while(rs.next())
    {
    pp.UserSignUp p=new pp.UserSignUp();
    p.setEmail(rs.getString("email"));
    p.setName(rs.getString("name"));
    p.setPwd(rs.getString("pwd"));
    a1.add(p);
    }
    return a1;
	}
	///Login direct bhi kr skte hai jo code baar baar use hota hai us ke liye 
	///method banate hai...
	public Boolean Login(UserSignUp u) throws ClassNotFoundException,SQLException
	{
	Boolean i=false;
	con=getConnect();
    String qr="select * from user where email=? and pwd=?";
    PreparedStatement ps=con.prepareStatement(qr);
    ps.setString(1,u.getEmail());
    ps.setString(2,u.getPwd());
    ResultSet rs=ps.executeQuery();
	if(rs.next())
	{
	i=true;
	}
	return i;
	}
	public java.util.ArrayList<addser> ShowService() throws ClassNotFoundException, SQLException
	{
    java.util.ArrayList<pp.addser> a1=new java.util.ArrayList<pp.addser>();
    con=getConnect();
    String qr="select * from addser";
    java.sql.Statement ps=con.createStatement();
    ResultSet rs=ps.executeQuery(qr);
    while(rs.next())
    {
    pp.addser as=new pp.addser();
    as.setId(rs.getString("id"));
    as.setTyservice(rs.getString("tyservice"));
    as.setLocation(rs.getString("Location"));
    as.setMnumber(rs.getString("mnumber"));
    as.setT(rs.getString("t"));
    as.setT1(rs.getString("t1"));
    as.setA(rs.getString("a"));
    as.setSid(rs.getString("sid"));
    as.setDate(rs.getString("date"));
    as.setRemarks(rs.getString("remarks"));
    a1.add(as);
    }
    return a1;
	}
	public int addapoint(apoint ap) throws ClassNotFoundException, SQLException
	{
	int i=0;
	con=getConnect();
	 ///Remember Query///
    //insert table tablename -XXXX...Wrong//
    //Wrong Syntax Putted...in the Mid-Sam-Exam//
	String qr="insert into apoint(id,email,date,time,sid) values(?,?,?,?,?)";
    PreparedStatement ps=con.prepareStatement(qr);
    ps.setString(1,ap.getId());
    ps.setString(2,ap.getEmail());
    ps.setString(3,ap.getDate());
    ps.setString(4,ap.getTime());
    ps.setString(5,ap.getSid());
    i=ps.executeUpdate();
   return i;
	}
	public java.util.ArrayList<apoint> Showapoint(String id) throws ClassNotFoundException, SQLException
	{
    java.util.ArrayList<pp.apoint> a1=new java.util.ArrayList<pp.apoint>();
    con=getConnect();
    String qr="select status,date,time from apoint where id=?"; 
    java.sql.PreparedStatement ps=con.prepareStatement(qr);
    ps.setString(1,id);
    ResultSet rs=ps.executeQuery();
    while(rs.next())
    {
    pp.apoint ap=new pp.apoint();
    ap.setStatus(rs.getString("status"));
    ap.setDate(rs.getString("date"));
    ap.setTime(rs.getString("time"));
    a1.add(ap);
    }
    return a1;
	}
}

