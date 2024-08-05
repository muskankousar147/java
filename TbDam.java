public class TbDam{
public String name;
public short rating;
public long visitors;
public int workers;




public Theater(){
	System.out.println("details of the spot are");
}


public Theater(String name, short rating, long visitors, int workers){
	this.name = name;
	this.rating = rating;
	this.viwer = visitors;
	this.workers = workers;

	
	
	System.out.println("name of the show is:"+name);
	System.out.println("rating of the show is:"+rating);
	System.out.println("viwers of the show is:"+visitors);
	System.out.println("number of workers per day:"+workers);
	for(int index = 0; index<name.length; index++){
		System.out.println(name[index]);
	}
	
}



}
