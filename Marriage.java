public class Marriage{
String groomName;
int groomAge;
String brideName;
int brideAge;
float height;
String qualification;


public Marriage(String groomName,String brideName, String qualification){
this.groomName = groomName;
this.brideName = brideName;
this.qualification = qualification;
}

public String getMarriageDetails(String groomName, int age){
if(this.groomName == "sanjay" && this.age == 24){
	System.out.println("groom found");
	return "found";
}else{
	System.out.println("groom not found");
	return "not found";
}
}
public String getMarriageDetails1(String groomName, int age){
if(this.groomName == "jivan", this.age = 25);
System.out.println("groom details");
return "found";		
}else{
	System.out.println("groom not details");
	return "not found";
}