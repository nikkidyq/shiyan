package lab2;

import java.sql.SQLException;

import lab2.O;

import com.opensymphony.xwork2.ActionSupport;

public class X extends ActionSupport  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8380697398127447246L;
	private B j1;
	private C j2;
	private String isbn;
	
	public String getIsbn(){
		return isbn;
	}
	
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
	public B getJ1(){
		return j1;
	}
	
	public C getJ2(){
		return j2;
	}
	
	public String execute() throws SQLException{
		O oz = new O();
		j1 = oz.o2(isbn);
		j2 = oz.o3(isbn);
		return SUCCESS;
	}

}
//x.java