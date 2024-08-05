public class Books{
public String title;
public String authorName;
public int price;

public Books(String title, String authorName){
	System.out.println("book:" +title+ " " +authorName);	
}
public Books(String title, String authorName, int price){
	
this.title = title;
this.authorName = authorName;
this.price = price;
System.out.println("books:" +title+ " " +authorName+ " " +price);

	}
}