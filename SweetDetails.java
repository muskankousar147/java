public class SweetDetails{
public String name;
public int pieces;
public int total;
public String shopname;
public int cost;
public String place;

public SweetDetails(){
	System.out.println("Sweet Detailsare");
}


public SweetDetails(String name){
	this.name = name;
	System.out.println("name :"+name);	
}
public SweetDetails(String name, int pieces){
	this.pieces = pieces;
	System.out.println("ratings:"+pieces);
}
public SweetDetails(String name, int pieces, int total){
	this.total = total;
	System.out.println("total:"+total);
}
public SweetDetails(String name, int pieces, int total, String shopname){
	this.shopname = shopname;
	System.out.println("shop name:"+shopname);
}
public SweetDetails(String name, int pieces, int total, String shopname, int cost){
	this.cost = cost;
	System.out.println("cost:"+cost);
}
public SweetDetails(String name, int pieces, int total, String shopname, int cost, String place){
	this.place = place;
	System.out.println("place:"+place);
}


}

