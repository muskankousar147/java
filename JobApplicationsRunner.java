public class JobApplicationsRunner{
public static void main(String args[]){
JobApplications jobapplications = new JobApplications("afrid", 25, "BE", "java", 90.09, 70.67, true, true);
System.out.println(jobapplications);

String details = jobapplications.checkAgeEligiblity(25);
System.out.println(details);
jobapplications.checkAgeEligiblity(25);


String details1 = jobapplications.checkSoftwareJobEligiblity("BE");
System.out.println(details1);
jobapplications.checkAgeEligiblity("BE");

String details2 = jobapplications.calculatesslcPercentage(90.09);
System.out.println(details2);
jobapplications.checkAgeEligiblity(90.09);

String details3 = jobapplications.checkCosmeticSkills("true");
System.out.println(details3);
jobapplications.checkAgeEligiblity("true");

String details4 = jobapplications.checkMouseSkills("true");
System.out.println(details4);
jobapplications.checkAgeEligiblity("true");
}
}