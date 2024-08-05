public class BusDetailsRunner{
public static void main(String args[]){
BusDetails busdetails = new BusDetails("kabir");
System.out.println(busdetails);

BusDetails busdetails1 = new BusDetails("kabir", 23);
busdetails1.BusDetails(busdetails);

BusDetails busdetails2 = new BusDetails("kabir", 23, 24);
busdetails1.BusDetails(busdetails);


BusDetails busdetails3 = new BusDetails("kabir", 23, 24, "zishan");
busdetails2.BusDetails(busdetails);

BusDetails busdetails4 = new BusDetails("kabir", 23, 24, "zishan", 26);
busdetails3.BusDetails(busdetails);


BusDetails busdetails5 = new BusDetails("kabir", 23, 24, "zishan", 26, "bangalore");
busdetails4.BusDetails(busdetails);

}
}