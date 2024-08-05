public class City{
static int number;
static String name;
static String country;
static String statename;
static String location;
public int numberOfHospitals;
public int numberOfSchools;
public int numberOfBusstands;
public int population;

public void City(int number){
	this.number = number;
	System.out.println("number:"+number);
}
public void City(int number,String name){
	this.name = name;
	System.out.println("name:"+name);
}
public void City(int number,String name,String country){
	System.out.println(country);
	this.country = country;
	System.out.println("country:"+country);
}
public void City(int number,String name,String country,String statename){
	this.statename = statename;
	System.out.println("statename:"+statename);
}
public void City(int number,String name,String country,String statename,String location){
	this.location = location;
	System.out.println("location:"+location);
}
public void City(int number,String name,String country,String statename,String location,int numberOfHospitals){
	this.numberOfHospitals = numberOfHospitals;
	System.out.println("numberOfHospitals:"+numberOfHospitals);
}
public void City(int number,String name,String country,String statename,String location,int numberOfHospitals,int numberOfSchools){
	this.numberOfSchools = numberOfSchools;
	System.out.println("static variables are:"+numberOfSchools);
}
public void City(int number,String name,String country,String statename,String location,int numberOfHospitals,int numberOfSchools,int numberOfBusstands){
	this.numberOfBusstands = numberOfBusstands;
	System.out.println("numberOfBusstands:"+numberOfBusstands);
	
}
public void City(int number,String name,String country,String statename,String location,int numberOfHospitals,int numberOfSchools,int numberOfBusstands,int population){
	this.population = population;
	System.out.println("population:"+population);

}

}
