public class ShopNamesRunner{
	public static void main(String args[]){
		
		ShopNames shopnames = new ShopNames();
		
		shopnames.getShopNamesDetails();
		
		shopnames.save("zam-zam");
		shopnames.read();
		
		
		
		
	}



}