public class DetergentRunner{
	public static void main(String args[]){
		Detergent detergent = new Detergent();
		
		detergent.setdetergentDetail("tide");
		detergent.getdetergentDetail();
		System.out.println("name:"+detergent.getdetergentDetail());
		
		detergent.setdetergent("wheel");
		detergent.getdetergent();
		System.out.println("name:"+detergent.getdetergent());
		
		detergent.setBrandName("naghma");
		detergent.getBrandName();
		System.out.println("brand name:"+detergent.getBrandName());
		
		detergent.setcompanyName("surf");
		detergent.getcompanyName();
		System.out.println("company name:"+detergent.getcompanyName());
		
		detergent.setpockets(12);
		detergent.getpockets();
		System.out.println("pockets:"+detergent.getpockets());
		
		detergent.setfragrance("good");
		detergent.getfragrance();
		System.out.println("fragrance:"+detergent.getfragrance());
		
	    detergent.setratings(5);
		detergent.getratings();
		System.out.println("pockets:"+detergent.getratings());
		
		detergent.setaddress("btm-layout");
		detergent.getaddress();
		System.out.println("address:"+detergent.getaddress());
		
		detergent.setmanufacture("dec23");
		detergent.getmanufacture();
		System.out.println("manufacture:"+detergent.getmanufacture());
		
		detergent.setexpiry("dec28");
		detergent.getexpiry();
		System.out.println("expiry:"+detergent.getexpiry());
		
	}






}