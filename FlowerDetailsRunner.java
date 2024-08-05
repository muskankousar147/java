public class FlowerDetailsRunner{
public static void main(String args[]){
FlowerDetails flowerdetails = new FlowerDetails("kamal");
System.out.println(flowerdetails);

FlowerDetails busdetails1 = new FlowerDetails("kamal", 23);
flowerdetails1.FlowerDetails(flowerdetails);

FlowerDetails busdetails2 = new FlowerDetails("kamal", 23, 24);
flowerdetails1.FlowerDetails(flowerdetails);


FlowerDetails busdetails3 = new FlowerDetails("kamal", 23, 24, "sunflower");
flowerdetails2.FlowerDetails(flowerdetails);

FlowerDetails busdetails4 = new FlowerDetails("kamal", 23, 24, "sunflower", 26);
flowerdetails3.FlowerDetails(flowerdetails);


FlowerDetails busdetails5 = new FlowerDetails("kamal", 23, 24, "sunflower", 26, "lalbagh");
flowerdetails4.FlowerDetails(flowerdetails);

}
}