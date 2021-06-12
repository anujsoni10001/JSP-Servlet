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
import pp.ProductBean;
public class RegisteredDao {
	
	Connection con;
	public Connection getConnect() throws ClassNotFoundException, SQLException 
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eshop","root","root");
	return con;
	}
	public int addPro(ProductBean p) throws ClassNotFoundException, SQLException
	{
	int i=0;
	con=getConnect();
	 ///Remember Query///
    //insert table tablename -XXXX...Wrong//
    //Wrong Syntax Putted...in the Mid-Sam-Exam//
    String qr="insert into Product values(?,?,?,?,?)";
    PreparedStatement ps=con.prepareStatement(qr);
    ps.setString(1,p.getName());
    ps.setString(2,p.getPrice());
    ps.setString(3,p.getCat());
    ps.setString(4,p.getCmp());
    ps.setString(5,p.getId());
    i=ps.executeUpdate();
   return i;
	}
	public int delete(ProductBean p) throws ClassNotFoundException, SQLException
	{
	int i=0;
    con=getConnect();
    ///Remember Query///
    //delete table tablename -XXXX...Wrong//
    //Wrong Syntax Putted...in the Mid-Sam-Exam//
	String qr="delete from Product where id=?";
	PreparedStatement ps=con.prepareStatement(qr);
	ps.setString(1,p.getId());
	i=ps.executeUpdate();
	return i;
	}
	public int update(ProductBean p) throws ClassNotFoundException, SQLException
	{
	int i=0;
    con=getConnect();
    ///Remember Query///
    //update table tablename -XXXX...//
    //Wrong Syntax Putted...in the Mid-Sam-Exam//
	String qr="update Product set Name=?,Price=?,Category=?,Company=? where id=?";
	PreparedStatement ps=con.prepareStatement(qr);
    ps.setString(1,p.getName());
    ps.setString(2,p.getPrice());
    ps.setString(3,p.getCat());
    ps.setString(4,p.getCmp());
    ps.setString(5,p.getId());
	i=ps.executeUpdate();
	return i;
	}
	public java.util.ArrayList<ProductBean> ShowPro() throws ClassNotFoundException, SQLException
	{
    java.util.ArrayList<pp.ProductBean> a1=new java.util.ArrayList<pp.ProductBean>();
    con=getConnect();
    String qr="select * from Product";
    java.sql.Statement ps=con.createStatement();
    ResultSet rs=ps.executeQuery(qr);
    while(rs.next())
    {
    pp.ProductBean p=new pp.ProductBean();
    p.setName(rs.getString("Name"));
    p.setPrice(rs.getString("Price"));
    p.setCat(rs.getString("Category"));
    p.setCmp(rs.getString("Company"));
    p.setId(rs.getString("id"));
    a1.add(p);
    }
    return a1;
	}
}

