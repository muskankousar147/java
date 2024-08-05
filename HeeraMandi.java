public class HeeraMandi{
public String name;
public short rating;
public long visitors;
public int episodes;




public HeeraMandi(){
	System.out.println("details of the web series are");
}


public HeeraMandi(String name, short rating, long visitors, int shows){
	this.name = name;
	this.rating = rating;
	this.viwer = visitors;
	this.shows = shows;

	
	
	System.out.println("name of the show is:"+name);
	System.out.println("rating of the show is:"+rating);
	System.out.println("viwers of the show is:"+visitors);
	System.out.println("number of shows per day:"+shows);
	for(int index = 0; index<name.length; index++){
		System.out.println(name[index]);
	}
	
}



}
