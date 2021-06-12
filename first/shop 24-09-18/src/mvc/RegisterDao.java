package mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
Connection con;
public Connection getCon() throws ClassNotFoundException, SQLException
{
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc","root","12345");
	return con;
}
public int addProduct(Product p) throws ClassNotFoundException, SQLException
{
	int i=0;
	con=getCon();
	String qr="insert into product values(?,?,?,?) ";
	PreparedStatement ps=con.prepareStatement(qr);
	ps.setString(1, p.getName());
	ps.setString(2, p.getPrice());
	ps.setString(3, p.getCat());
	ps.setString(4, p.getCmp());
	i=ps.executeUpdate();
	return i;
}
}
