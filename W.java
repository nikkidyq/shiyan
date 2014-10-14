package lab2;

import java.sql.SQLException;

import lab2.O;

import com.opensymphony.xwork2.ActionSupport;

public class W extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5954302614065188781L;
	private String isbn;
	
	public String getIsbn(){
		return isbn;
	}
	
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
	
	public String execute() throws SQLException{
		O oz = new O();
		oz.o1(isbn);
		return SUCCESS;
	}

}
