package lab2;

public class C {
	private String authorid;
	private String name;
	private String age;
	private String country;
	
	public String getAuthorid(){
		return this.authorid;
	}
	public String getName(){
		return this.name;
	}
	public String getAge(){
		return this.age;
	}
	public String getCountry(){
		return this.country;
	}
	public C(String authorid,String name,String age,String country){
		this.authorid = authorid;
		this.name = name;
		this.age = age;
		this.country = country;
	}
}
