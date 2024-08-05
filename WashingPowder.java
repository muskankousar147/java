public class  WashingPowder{
public String name;
public int weight;
public float price;
public boolean isGood;
public WashingPowder(String name){
this((int)30);
this.name = name;
System.out.println("name:"+name);
}
public WashingPowder(int weight){
this(5.5f);
this.weight = weight;
System.out.println("weight:"+weight);
}
public WashingPowder(float price){
this(true);
this.price = price;
System.out.println("price:"+price);
}
public WashingPowder(boolean isGood){
this('S');
this.isGood = isGood;
System.out.println("isGood:"+isGood);
}
public void washingpowder1(String name){
	System.out.println("name:"+name);
	
}
public void washingpowder2(int weight){
	System.out.println("weight:"+weight);
	
}
public void washingpowder3(float price){
	System.out.println("price:"+price);
	
}

}