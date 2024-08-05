public class BookDetail{
public String title;
public String author;
public int price;

public BookDetail(){
	System.out.println("default constructor");
}
public BookDetail(String title){
	this.title = title;
	System.out.println("title:"+title);
	
}
public BookDetail(String title, String author){
	this.title = title;
	this.author = author;
	System.out.println("book details:"+title+ " " +author);
	
}
public BookDetail(String title, String author, int price){
	this. title = title;
	this. author = author;
	this.price = price;
	System.out.println("address:"+title+ " " +author+ " " +price);
	
}



}