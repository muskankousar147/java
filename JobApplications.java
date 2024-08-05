public class JobApplications{
public String name;
public int age;
public String qualification;
public String[] skills;
public double sslcPercentage;
public double degreePercentage;
public boolean hasCosmeticSkills;
public boolean hasMouseSkills;

public JobApplications(){
}

public JobApplications(String name, int age, String qualification, String[] skills, double sslcPercentage, double degreePercentage, boolean hasCosmeticSkills, boolean hasMouseSkills){
this.name = name;
this.age = age;
this.qualification = qualification;
this.skills = skills;
this.sslcPercentage = sslcPercentage;
this.degreePercentage = degreePercentage;
this.hasCosmeticSkills = hasCosmeticSkills;
this.hasMouseSkills = hasMouseSkills;
}
public void checkAgeEligiblity(){
	if(age<18){
		System.out.println("not eligible for job");
		
	}
}
public void checkSoftwareJobEligiblity(){
	if(age > 21 && qualification.equals("BE")){
		System.out.println("eligiblefor applying software jobs");
	}	
}
public void checjJavaDeveloperEligiblity(){
	boolean hasJavaSkills = false;
	for(String skill : skills){
		if(skill.equalsIgnoreCase("java")){
			hasJavaSkills = true;
			break;
			
		}
	}
	if(qualification.equals("BE") && hasJavaSkills){
		System.out.println("eligible to apply for java developer position");
	}
}
public double calculatesslcPercentage(){
	return sslcPercentage;
}
public void checkSoftwareDeveloperEligiblity(){
	if(degreePercentage > 50.0 && qualification.equals("BE")){
		
		System.out.println("eligible to apply for software developer role");
	}	
}
public void checkCosmeticSkills(){
	if(hasCosmeticSkills){
		System.out.println("applicant has cosmotic skills");
		}else{
			System.out.println("applicant does not have cosmetic skills");
		}
}
public void checkMouseSkills(){
	if(hasMouseSkills){
		System.out.println("applicant has mouse skills");
	}else{
		System.out.println("applicant does not have mouse skills");
	}
}
}