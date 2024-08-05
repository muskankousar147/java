public class Session{
String name;
String address;


public static void sessionDetails(String name){
System.out.println("details of the session:"+name);
}

public static String session(String name, String address){
	//System.out.println("name :"+name);
    //System.out.println("address :"+address);
	return name+","+address;
	
}

public static String sessionData(){
return "sessionData";
}

public static void sessionInfo(){

}
}