public class SoapsRunner{
	public static void main(String args[]){
		Soaps soaps = new Soaps();
		
		soaps.setSoapsDetail("lux");
		soaps.getSoapsDetail();
		System.out.println("name:"+soaps.getSoapsDetail());
		
		soaps.setSoap("cinthol");
		soaps.getSoap();
		System.out.println("name:"+soaps.getSoap());
		
		soaps.setBrandName("naghma");
		soaps.getBrandName();
		System.out.println("brand name:"+soaps.getBrandName());
		
		soaps.setcompanyName("godrej");
		soaps.getcompanyName();
		System.out.println("company name:"+soaps.getcompanyName());
		
		soaps.setpockets(12);
		soaps.getpockets();
		System.out.println("pockets:"+soaps.getpockets());
		
		soaps.setfragrance("good");
		soaps.getfragrance();
		System.out.println("fragrance:"+soaps.getfragrance());
		
	    soaps.setratings(5);
		soaps.getratings();
		System.out.println("pockets:"+soaps.getratings());
		
		soaps.setaddress("btm-layout");
		soaps.getaddress();
		System.out.println("address:"+soaps.getaddress());
		
		soaps.setmanufacture("dec23");
		soaps.getmanufacture();
		System.out.println("manufacture:"+soaps.getmanufacture());
		
		soaps.setexpiry("dec28");
		soaps.getexpiry();
		System.out.println("expiry:"+soaps.getexpiry());
		
	}






}