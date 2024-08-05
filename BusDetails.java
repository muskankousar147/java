public class BusDetails{
public String name;
public int rating;
public int passengers;
public String drivername;
public int cost;
public String place;

public BusDetails(){
	System.out.println("Train details are");
}


public BusDetails(String name){
	this.name = name;
	System.out.println("name :"+name);	
}
public BusDetails(String name, int rating){
	this.rating = rating;
	System.out.println("ratings:"+rating);
}
public BusDetails(String name, int rating, int passengers){
	this.passengers = passengers;
	System.out.println("passengers:"+passengers);
}
public BusDetails(String name, int rating, int passengers, String drivername){
	this.drivername = drivername;
	System.out.println("drivername:"+drivername);
}
public BusDetails(String name, int rating, int passengers, String drivername, int cost){
	this.cost = cost;
	System.out.println("cost:"+cost);
}
public BusDetails(String name, int rating, int passengers, String drivername, int cost, String place){
	this.place = place;
	System.out.println("cost:"+place);
}


}

