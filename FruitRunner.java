public class FruitRunner{
public static void main(String args[]){
System.out.println("details of the Friend are:");
Fruit.fruitDetails("a");
String fruitOne = Fruit.fruit("apple", "hamza");
System.out.println("fruitOne:"+fruitOne);

Fruit.fruitData();
String fruitDataOne = Fruit.fruitData();
System.out.println("friendDataOne:"+fruitDataOne);

Fruit.fruitInfo();

}


}