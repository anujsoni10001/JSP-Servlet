package pp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public int addPro(Product p) throws ClassNotFoundException, SQLException
{
	con=getCon();
	String qr="insert into product values(?,?,?,?)";
	PreparedStatement ps=con.prepareStatement(qr);
	ps.setString(1, p.getName());
	ps.setString(2, p.getPrice());
	ps.setString(3, p.getCat());
	ps.setString(4, p.getCmp());
	int i=ps.executeUpdate();
	return i;
}
public int delete(Product p) throws ClassNotFoundException, SQLException
{
	con=getCon();
	String qr="delete from product where name=?";
	PreparedStatement ps=con.prepareStatement(qr);
	ps.setString(1, p.getName());
	int i=ps.executeUpdate();
	return i;
}
public int update(Product p) throws ClassNotFoundException, SQLException
{
	con=getCon();
	String qr="update product set price=?,cat=?,cmp=? where name=?";
	PreparedStatement ps=con.prepareStatement(qr);
	ps.setString(4, p.getName());
	ps.setString(1, p.getPrice());
	ps.setString(2, p.getCat());
	ps.setString(3, p.getCmp());
	int i=ps.executeUpdate();
	return i;
}
public ArrayList<Product> showRecords() throws ClassNotFoundException, SQLException
{
	ArrayList<Product> al=new ArrayList<Product>();
	con=getCon();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from product");
	while(rs.next())
	{
		Product p=new Product();
		p.setName(rs.getString("name"));
		p.setPrice(rs.getString("price"));
		p.setCat(rs.getString("cat"));
		p.setCmp(rs.getString("cmp"));
		al.add(p);
	}
	return al;
}
}
