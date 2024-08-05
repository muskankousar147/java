public class Drama{
public String name;
public int rating;
public int viewrs;
public int members;
public int cost;

public Drama(){
	System.out.println("argument list");
}


public Drama(String name){
	this.name = name;
	System.out.println("name of the drama :"+name);	
}
public Drama(String name, int rating){
	this.rating = rating;
	System.out.println("ratings of the drama:"+rating);
}
public Drama(String name, int rating, int viewrs){
	this.viewrs = viewrs;
	System.out.println("viewrs of the drama:"+viewrs);
}
public Drama(String name, int rating, int viewrs, int members){
	this.members = members;
	System.out.println("members of drama:"+members);
}
public Drama(String name, int rating, int viewrs, int members, int cost){
	this.cost = cost;
	System.out.println("cost of the drama:"+cost);
}


}

