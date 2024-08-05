public class MobileData{
public int number;
public String name;
public String address;
public String simName;

public MobileData(){
	System.out.println("no argument constructor");
}

public MobileData(int number){
System.out.println("number :"+number);
}
public MobileData(int number, String name){
System.out.println("name:"+number+ " "+name);
}
public MobileData(int number, String name, String address){
System.out.println("address:"+number+ " " +name+ " "+address);
}

public MobileData(int number, String name, String address, String simName){
System.out.println("address:"+number+ " " +name+ " "+address+ " "+simName);
}
}