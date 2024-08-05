public class SweetsRunner{
	public static void main(String args[]){
		Sweets sweets = new Sweets();
		
		sweets.setSweetsDetail("laddu");
		sweets.getSweetsDetail();
		System.out.println("name:"+sweets.getSweetsDetail());
		
		sweets.setSweets("jalebi");
		sweets.getSweets();
		System.out.println("name:"+sweets.getSweets());
		
		sweets.setBrandName("mahin");
		sweets.getBrandName();
		System.out.println("brand name:"+sweets.getBrandName());
		
		sweets.setbakeryName("balaji");
		sweets.getbakeryName();
		System.out.println("bakery name:"+sweets.getbakeryName());
		
		sweets.setpockets(12);
		sweets.getpockets();
		System.out.println("pockets:"+sweets.getpockets());
		
		sweets.settaste("good");
		sweets.gettaste();
		System.out.println("taste:"+sweets.gettaste());
		
	    sweets.setratings(5);
		sweets.getratings();
		System.out.println("pockets:"+sweets.getratings());
		
		sweets.setaddress("btm-layout");
		sweets.getaddress();
		System.out.println("address:"+sweets.getaddress());
		
		sweets.setmanufacture("dec23");
		sweets.getmanufacture();
		System.out.println("manufacture:"+sweets.getmanufacture());
		
		sweets.setexpiry("dec28");
		sweets.getexpiry();
		System.out.println("expiry:"+sweets.getexpiry());
		
	}






}