package lab2;

import java.sql.SQLException;
import java.util.List;

import lab2.O;

import com.opensymphony.xwork2.ActionSupport;

public class Y extends ActionSupport  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7540676880369930324L; 
	
	private List<B> j;
	private String name;
	
	public List<B> getJ(){
		return j;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String execute() throws SQLException{
		O oz = new O();
		this.j = oz.o4(name);
		return SUCCESS;
	}

}
//y.java