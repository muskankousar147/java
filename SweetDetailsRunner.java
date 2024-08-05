public class SweetDetailsRunner{
public static void main(String args[]){
SweetDetails sweetdetails = new SweetDetails("gulabjamun");
System.out.println(sweetdetails);

SweetDetails sweetdetails1 = new SweetDetails("gulabjamun", 23);
sweetdetails1.SweetDetails(sweetdetails);

SweetDetails sweetdetails2 = new SweetDetails("gulabjamun", 23, 24);
sweetdetails1.SweetDetails(sweetdetails);


SweetDetails sweetdetails3 = new SweetDetails("gulabjamun", 23, 24, "rasmalai");
sweetdetails2.SweetDetails(sweetdetails);

SweetDetails sweetdetails4 = new SweetDetails("gulabjamun", 23, 24, "rasmalai", 26);
sweetdetails3.SweetDetails(sweetdetails);


SweetDetails sweetdetails5 = new SweetDetails("gulabjamun", 23, 24, "rasmalai", 26, "bikaner");
sweetdetails4.SweetDetails(sweetdetails);

}
}