public class FlowerRunner{
public static void main(String args[]){
System.out.println("details of the Flower are:");
Flower.flowerDetails("rose");
String flowerOne = Flower.flower("rose", "mogra");
System.out.println("flowerOne:"+flowerOne);

Flower.flowerData();
String flowerDataOne = Flower.flowerData();
System.out.println("flowerDataOne:"+flowerDataOne);

Flower.flowerInfo();

}


}