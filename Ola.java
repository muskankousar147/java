public class Ola{
public String name;
public int rating;
public int passengers;
public String drivername;
public int cost;
public String place;

public Ola(){
	System.out.println("Train details are");
}


public Ola(String name){
	this.name = name;
	System.out.println("name :"+name);	
}
public Ola(String name, int rating){
	this.rating = rating;
	System.out.println("ratings:"+rating);
}
public Ola(String name, int rating, int passengers){
	this.passengers = passengers;
	System.out.println("passengers:"+passengers);
}
public Ola(String name, int rating, int passengers, String drivername){
	this.drivername = drivername;
	System.out.println("drivername:"+drivername);
}
public Ola(String name, int rating, int passengers, String drivername, int cost){
	this.cost = cost;
	System.out.println("cost:"+cost);
}
public Ola(String name, int rating, int passengers, String drivername, int cost, String place){
	this.place = place;
	System.out.println("cost:"+place);
}


}

