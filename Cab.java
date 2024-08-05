public class Cab{
public String name;
public int rating;
public int passengers;
public String drivername;
public int cost;
public String place;

public Cab(){
	System.out.println("Train details are");
}


public Cab(String name){
	this.name = name;
	System.out.println("name :"+name);	
}
public Cab(String name, int rating){
	this.rating = rating;
	System.out.println("ratings:"+rating);
}
public Cab(String name, int rating, int passengers){
	this.passengers = passengers;
	System.out.println("passengers:"+passengers);
}
public Cab(String name, int rating, int passengers, String drivername){
	this.drivername = drivername;
	System.out.println("drivername:"+drivername);
}
public Cab(String name, int rating, int passengers, String drivername, int cost){
	this.cost = cost;
	System.out.println("cost:"+cost);
}
public Cab(String name, int rating, int passengers, String drivername, int cost, String place){
	this.place = place;
	System.out.println("cost:"+place);
}


}

