public class SprayRunner{
	public static void main(String args[]){
		Spray spray = new Spray();
		
		spray.setsprayDetail("fog");
		spray.getsprayDetail();
		System.out.println("name:"+spray.getsprayDetail());
		
		spray.setspray("white-beauty");
		spray.getspray();
		System.out.println("name:"+spray.getspray());
		
		spray.setBrandName("majmuma");
		spray.getBrandName();
		System.out.println("brand name:"+spray.getBrandName());
		
		spray.setcompanyName("surf");
		spray.getcompanyName();
		System.out.println("company name:"+spray.getcompanyName());
		
		spray.setpockets(12);
		spray.getpockets();
		System.out.println("pockets:"+spray.getpockets());
		
		spray.setfragrance("good");
		spray.getfragrance();
		System.out.println("fragrance:"+spray.getfragrance());
		
	    spray.setratings(5);
		spray.getratings();
		System.out.println("pockets:"+spray.getratings());
		
		spray.setaddress("btm-layout");
		spray.getaddress();
		System.out.println("address:"+spray.getaddress());
		
		spray.setmanufacture("dec23");
		spray.getmanufacture();
		System.out.println("manufacture:"+spray.getmanufacture());
		
		spray.setexpiry("dec28");
		spray.getexpiry();
		System.out.println("expiry:"+spray.getexpiry());
		
	}






}