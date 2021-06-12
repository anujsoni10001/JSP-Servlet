package pp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RegisterDao {
Connection con;
public Connection getCon() throws ClassNotFoundException, SQLException
{
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/archit","root","root");
	return con;
}
public ArrayList<Product> showrecords(int i,int t) throws SQLException, ClassNotFoundException
{
	ArrayList<Product> al=new ArrayList<Product>();
	String qr="select * from product limit "+i+","+t+" ";
	con=getCon();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(qr);
	while(rs.next())
	{
		Product p=new Product();
		p.setName(rs.getString("name"));
		p.setPrice(rs.getString("price"));
		al.add(p);
	}
	return al;
}
public int countRows() throws ClassNotFoundException, SQLException
{
	ArrayList<Product> al=new ArrayList<Product>();
	String qr="select * from product";
	con=getCon();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(qr);
	while(rs.next())
	{
		Product p=new Product();
		p.setName(rs.getString("name"));
		p.setPrice(rs.getString("price"));
		al.add(p);
	}
	return al.size();
}
}
