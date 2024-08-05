public class AirCondition{
public String name;
public String customer;
public String brandname;
public String shopname;
public int rating;
public int number;
public int members;
public long mobilenumber;
public float sales;
public int cost;

public AirCondition(){
	System.out.println("0 argument list");
}


public AirCondition(String name){
	this.name = name;
	System.out.println("1 argument :"+name);	
}
public Cooler.customer = customer;
	System.out.println("2 argument:"+customer);
	this.customer = customer;
}
public AirCondition(String name, String customer, String brandname){
	this.brandname = brandname;
	System.out.println("3 argument:"+brandname);
}
public AirCondition(String name, String customer, String brandname, String shopname){
	this.shopname = shopname;
	System.out.println("4 argument:"+shopname);
}
public AirCondition(String name, String customer, String brandname, String shopname,int rating){
	this.rating = rating;
	System.out.println("5 argument:"+rating);
}
public AirCondition(String name, String customer, String brandname, String shopname,int rating, int number){
	this.number = number;
	System.out.println("6 argument:"+number);
}
	public AirCondition(String name, String customer, String brandname, String shopname,int rating, int number,int members){
	this.members = members;
	System.out.println("7 argument:"+members);	
}
public AirCondition(String name, String customer, String brandname, String shopname,int rating, int number,int members, long mobilenumber){
	this.mobilenumber = mobilenumber;
	System.out.println("8 argument:"+mobilenumber);	
}
public AirCondition(String name, String customer, String brandname, String shopname,int rating, int number,int members,float sales){
	this.mobilenumber = mobilenumber;
	System.out.println("9 argument:"+mobilenumber);	
}
public AirCondition(String name, String customer, String brandname, String shopname,int rating, int number,int members,float sales, int cost){
	this.cost = cost;
	System.out.println("10 argument:"+cost);	
}

}

