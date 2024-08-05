public class JobApplicationRunner{
public static void main(String args[]){
JobApplication jobapplication = new JobApplication("abhi");
System.out.println(jobapplication);

JobApplication jobapplication1 = new JobApplication("abhi", 23);
System.out.println(jobapplication1);

JobApplication jobapplication2 = new JobApplication("abhi", 23, "btm-layout");
System.out.println(jobapplication2);

JobApplication jobapplication3 = new JobApplication("abhi", 23, "btm-layout", "schenider","dec25");
System.out.println(jobapplication3);

JobApplication jobapplication4 = new JobApplication("abhi", 23, "schenider", "dec25", "thursday");
System.out.println(jobapplication4);

JobApplication jobapplication5 = new JobApplication("abhi", 23, "schenider", "dec25", "thursday", "degree");
System.out.println(jobapplication5);


JobApplication jobapplication6 = new JobApplication("abhi", 23, "schenider", "dec25", "thursday", "degree");
System.out.println(jobapplication6);

JobApplication jobapplication7 = new JobApplication("abhi", 23, "schenider", "dec25", "thursday", "degree", "naukri");
System.out.println(jobapplication7);

JobApplication jobapplication8 = new JobApplication("abhi", 23, "schenider", "dec25", "thursday", "degree", "naukri", 23452);
System.out.println(jobapplication8);


}
}

