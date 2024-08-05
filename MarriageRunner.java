public class MarriageRunner{
public static void main(String args[]){
Marriage marriage = new Marriage("sanjay", "swathi", BE);
System.out.println(marriage);

String details = marriage.getMarriagedetails("sanjay");
System.out.println(details);
Marriage.getMarriagedetails("sanjay");

String details1 = marriage.getMarriagedetails1("jivan", 25);
System.out.println(details1);
Marriage.getMarriagedetails("jivan",25);



}
}