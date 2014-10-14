package lab2;

public class B {
	private String isbn;
	private String title;
	private String authorid;
	private String publisher;
	private String publishdata;
	private String price;
	
	public String getIsbn(){
		return isbn;
	}
	public String getTitle(){
		return title;
	}
	public String getAuthorid(){
		return authorid;
	}
	public String getPublisher(){
		return publisher;
	}
	public String getPublishdata(){
		return publishdata;
	}
	public String getPrice(){
		return price;
	}
	public B(String isbn,String title,String authorid,String publisher,String publishdata,String price){
		this.isbn = isbn;
		this.title = title;
		this.authorid = authorid;
		this.publisher = publisher;
		this.publishdata = publishdata;
		this.price = price;
	}
}
