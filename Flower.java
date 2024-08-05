public class Flower{
String name;
String shopName;
String type;


public static void flowerDetails(String name){
System.out.println("details of the flower:"+name);
}

public static String flower(String name, String shopName, String type){
	//System.out.println("name :"+name);
    //System.out.println("shopName :"+shopName);
	return name+","+shopName","+type;
	
}

public static String flowerData(){
return "flowerData";
}

public static void flowerInfo(){

}
}