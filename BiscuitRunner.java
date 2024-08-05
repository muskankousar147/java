public class BiscuitRunner{
public static void main(String args[]){
System.out.println("details of the Biscuit are:");
Biscuit.biscuitDetails("apple");
String biscuitOne = Biscuit.biscuit("apple", "hamza");
System.out.println("biscuitOne:"+biscuitOne);

Biscuit.biscuitData();
String biscuitDataOne = Biscuit.biscuitData();
System.out.println("biscuit Data One:"+biscuitDataOne);

Biscuit.biscuitInfo();

}


}