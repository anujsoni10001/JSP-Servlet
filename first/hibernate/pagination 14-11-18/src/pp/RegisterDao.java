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
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hib1","root","root");
	return con;
}
public ArrayList<Emp> show(int i,int t) throws ClassNotFoundException, SQLException
{
	ArrayList<Emp> al=new ArrayList<Emp>();
	con=getCon();
	String qr="select * from emp limit "+i+","+t+" ";
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(qr);
	while(rs.next())
	{
		Emp e=new Emp();
		e.setId(rs.getInt("id"));
		e.setName(rs.getString("name"));
		al.add(e);
	}
	return al;
}
public int count() throws ClassNotFoundException, SQLException
{
	int i=0;
	con=getCon();
	String qr="select * from emp ";
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(qr);
	while(rs.next())
	{
		i++;
	}

	return i;
}
}
