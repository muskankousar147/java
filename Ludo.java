public class Ludo{
public String name;
public short rating;
public long players;
public int number;




public Ludo(){
	System.out.println("details of the game are");
}


public Ludo(String name, short rating, long players, int number){
	this.name = name;
	this.rating = rating;
	this.players = players;
	this.number = number;

	
	
	System.out.println("name of the show is:"+name);
	System.out.println("rating of the show is:"+rating);
	System.out.println("viwers of the show is:"+visitors);
	System.out.println("number:"+number);
	for(int index = 0; index<name.length; index++){
		System.out.println(name[index]);
	}
	
}



}
