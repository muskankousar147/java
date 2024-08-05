public class JobApplication{
String name = "abhi";
int age = 24;
String address = "btm-layout";
String companyName = "schenider";
String  date = "dec25";
String day = "thrusday";
String qualification = "degree";
int ageLimit = 30;
String platForm = "naukri";
int mobileNumber = 23452;

public JobApplication(){
	System.out.println(" no argument");
}


public JobApplication(String name){
	this.name = name;
	System.out.println("name of the job applicant :"+name);	
}
public JobApplication(String name, int age){
	this.age = age;
	System.out.println("age of the job applicant:"+age);
}
public JobApplication(String name, int age, String address){
	this.address = address;
	System.out.println("address of the job applicant:"+address);
}
public JobApplication(String name, int age, String address, String companyName){
	this.companyName = companyName;
	System.out.println("company name of the job location:"+companyName);
}
public JobApplication(String name, int age, String address, String companyName, String date){
	this.date = date;
	System.out.println("date of the interview:"+date);
}
public JobApplication(String name, int age, String address, String companyName, String date, String day){
	this.day = day;
	System.out.println("day of the interview:"+day);
}
public JobApplication(String name, int age, String address, String companyName, String date, String day, String qualification){
	this.qualification= qualification;
	System.out.println(" qualification of the applicant:"+qualification);
}
public JobApplication(String name, int age, String address, String companyName, String date, String day, String qualification, int ageLimit){
	this.ageLimit= ageLimit;
	System.out.println("age limit of the applicant:"+ageLimit);
}
public JobApplication(String name, int age, String address, String companyName, String date, String day, String qualification, int ageLimit,String platForm){
	this.platForm = platForm;
	System.out.println("platForm applied by the job applicant:"+platForm);
}
public JobApplication(String name, int age, String address, String companyName, String date, String day, String qualification, int ageLimit,String platForm, int mobileNumber){
	this.mobileNumber = mobileNumber;
	System.out.println("mobile Number of the job applicant:"+mobileNumber);
}


}
