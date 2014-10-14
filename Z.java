package lab2;

import java.sql.SQLException;
import java.util.List;

import lab2.O;

import com.opensymphony.xwork2.ActionSupport;

public class Z extends ActionSupport  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7574287995884417605L;
	private List<B> j;
	
	public List<B> getJ(){
		return j;
	}
	
	
	public String execute() throws SQLException{
		O oz = new O();
		this.j = oz.o5();
		return SUCCESS;
	}
}
//z.java