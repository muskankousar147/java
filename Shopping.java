public class Shopping{
public static final double gst = 18.00;
public static void Type(String shoppingType){
System.out.println("shopping type:" + shoppingType);
}
public static void price(int price){
double totalprice = (shopping.gst*price)+price;	
System.out.println("total price with gst is:"+totalprice);
}
public static void Details(String itemname, String type){
System.out.println("total number of item names and type is:"+itemname+" , "+shoppingType+");
}
public static void ShoppingDetails(String shoppingType, double totalprice, String itemname){
double gstprice =(totalprice*shopping.gst)+totalprice;
System.out.println("shopping details including shopping type total price item name:"+"shoppingType+"  "+totalprice+" "+gstprice+" "+itemname+");
}
}
