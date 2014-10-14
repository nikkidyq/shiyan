package lab2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class O {
	private Connection dblink;
	public O() {}
	
	public Connection getLink(){
        try {  
            Class.forName("com.mysql.jdbc.Driver");  
            dblink = DriverManager.getConnection("jdbc:mysql://localhost:3306/struts", "root", "");  
            if (!dblink.isClosed()) System.out.println("ConnSuccess");  
            if (dblink == null) System.out.println("ConnFail");  
        } catch (ClassNotFoundException e) {  
            e.printStackTrace();  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
        return dblink;
	}
	
	public void o1(String isbn) throws SQLException{
		Connection dblink=getLink();
		Statement s = dblink.createStatement();
		s.executeUpdate("DELETE FROM book WHERE ISBN='"+isbn+"'");
		try{
			if (s != null) s.close();
			if (dblink != null) dblink.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	public B o2(String isbn) throws SQLException{
		Connection dblink=getLink();
		Statement s = dblink.createStatement();
		ResultSet res = s.executeQuery("SELECT * FROM book WHERE ISBN='" + isbn + "'");
		B ret = null;
		while (res.next())
			ret = new B(isbn,res.getString("Title"),res.getString("AuthorID"),res.getString("Publisher"),res.getString("PublishDate"),res.getString("Price"));
		try{
			if (s != null) s.close();
			if (dblink != null) dblink.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
		return ret;
		
	}
	
	public C o3(String isbn) throws SQLException{
		Connection dblink=getLink();
		Statement s = dblink.createStatement();
		ResultSet res = s.executeQuery("SELECT * FROM author where authorid=(select authorid from book where ISBN='" + isbn + "')");
		C ret = null;
		while (res.next())
			 ret = new C(res.getString("AuthorID"),res.getString("Name"),res.getString("Age"),res.getString("Country"));
		try{
			if (s != null) s.close();
			if (dblink != null) dblink.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
		return ret;
		
	}
	
	public List<B> o4(String name) throws SQLException{
		Connection dblink=getLink();
		Statement s = dblink.createStatement();
		ResultSet res = s.executeQuery("SELECT * FROM book WHERE AuthorID=(SELECT AuthorID FROM author WHERE Name='" + name + "')");
		List<B> ret = new ArrayList<B>();
		while (res.next())
			ret.add(new B(res.getString("ISBN"),res.getString("Title"),res.getString("AuthorID"),res.getString("Publisher"),res.getString("PublishDate"),res.getString("Price")));
		try{
			if (s != null) s.close();
			if (dblink != null) dblink.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
		return ret;
		
	}
	
	public List<B> o5() throws SQLException{
		Connection dblink=getLink();
		Statement s = dblink.createStatement();
		ResultSet res = s.executeQuery("SELECT * FROM book");
		List<B> ret =new ArrayList<B>();
		while (res.next())
			ret.add(new B(res.getString("ISBN"),res.getString("Title"),res.getString("AuthorID"),res.getString("Publisher"),res.getString("PublishDate"),res.getString("Price")));
		try{
			if (s != null) s.close();
			if (dblink != null) dblink.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
		return ret;
	}
}
