public class FreeFire{
public String name;
public short rating;
public long players;
public int members;




public FreeFire(){
	System.out.println("details of the game are");
}


public FreeFire(String name, short rating, long players, int members){
	this.name = name;
	this.rating = rating;
	this.players = players;
	this.members = members;

	
	
	System.out.println("name of the show is:"+name);
	System.out.println("rating of the show is:"+rating);
	System.out.println("viwers of the show is:"+players);
	System.out.println("number of shows per day:"+members);
	for(int index = 0; index<name.length; index++){
		System.out.println(name[index]);
	}
	
}



}
