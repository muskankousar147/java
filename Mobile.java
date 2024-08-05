public class Mobile{
	public static void MobileDetails(){
   System.out.println("Charger Details");
  //constactor chaining
  Mobile.mobileDetails("vivo ",20000);
	}
	
	
	public static void mobileDetails(String name, int price){
		System.out.println("mobile name is :"+name);
		System.out.println("mobile price is :"+price);

	}
}