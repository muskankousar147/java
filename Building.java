public class Building{
public String address;
public int numOfRooms;
public int floors;

public Building(){
	System.out.println("default constructor");
}
public Building(String address){
	this.address = address;
	System.out.println("address:"+address);
	
}
public Building(String address, int numOfRooms){
	this.address = address;
	this.numOfRooms = numOfRooms;
	System.out.println("address:"+address+ " " +numOfRooms);
	
}
public Building(String address, int numOfRooms, int floors){
	this.address = address;
	this.numOfRooms = numOfRooms;
	this.floors = floors;
	System.out.println("address:"+address+ " " +numOfRooms+ " " +floors);
	
}



}