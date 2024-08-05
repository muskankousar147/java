public class TrainInformation{
public String name;
public int rating;
public int passengers;
public int members;
public int cost;

public Train(){
	System.out.println("Train details are");
}


public Train(String name){
	this.name = name;
	System.out.println("name of the train :"+name);	
}
public Train(String name, int rating){
	this.rating = rating;
	System.out.println("ratings of the train:"+rating);
}
public Train(String name, int rating, int passengers){
	this.passengers = passengers;
	System.out.println("passengers of the train:"+passengers);
}
public Train(String name, int rating, int viewrs, int members){
	this.members = members;
	System.out.println("members of traveling:"+members);
}
public Train(String name, int rating, int viewrs, int members, int cost){
	this.cost = cost;
	System.out.println("cost of the ticket:"+cost);
}


}

