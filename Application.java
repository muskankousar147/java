public class Application{
public String name;
public int age;
public String address;
public String companyName;
public String date;
public String day;
public String qualification;
public int ageLimit;
public String platForm;
public int mobileNumber;
}
public Application(){
	this.name = "abhi";
	this.age = 24;
	this.address = "btm-layout";
	this.companyName = "schenider";
	this.date = "dec25";
	this.day = "thursday";
	this.qualification = "degree";
	this.ageLimit = 30;
	this.platForm = "naukri";
	this.mobileNumber = 23452;
}
public Application(String name, int age, String address, String companyName, String date, String day, String qualification, int ageLimit,String platForm,int mobileNumber){
	this.name = name;
	this.age = age;
	this.address = address;
	this.companyName = companyName;
	this.date = date;
	this.day = day;
	this.qualification = qualification;
	this.ageLimit = ageLimit;
	this.platForm = platForm;
	this.mobileNumber = mobileNumber;
}

public String getDetails(){
	System.out.println("details:"+Details);
	return Details;
	
	
}