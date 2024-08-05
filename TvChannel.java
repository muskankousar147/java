public class TvChannel{
public String name;
public short rating;
public long viwer;
public int shows;



public TvChannel(){
	System.out.println("details of the channel are");
}


public TvChannel(String name, short rating, long viwer, int shows){
	this.name = name;
	this.rating = rating;
	this.viwer = viwer;
	this.shows = shows;

	
	
	System.out.println("name of the show is:"+name);
	System.out.println("rating of the show is:"+rating);
	System.out.println("viwers of the show is:"+viwer);
	System.out.println("number of shows per day:"+shows);
	for(int index = 0; index<name.length; index++){
		System.out.println(name[index]);
	}
	
}



}
