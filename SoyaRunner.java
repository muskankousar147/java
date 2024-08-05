public class SoyaRunner{
	public static void main(String args[]){
		Soya soya = new Soya();
		
		soya.setsoyaDetail("food");
		soya.getsoyaDetail();
		System.out.println("name:"+soya.getsoyaDetail());
		
		soya.setsoya("soya-been");
		soya.getsoya();
		System.out.println("name:"+soya.getsoya());
		
		soya.setBrandName("balaji");
		soya.getBrandName();
		System.out.println("brand name:"+soya.getBrandName());
		
		soya.setcompanyName("soya");
		soya.getcompanyName();
		System.out.println("company name:"+soya.getcompanyName());
		
		soya.setpockets(70);
		soya.getpockets();
		System.out.println("pockets:"+soya.getpockets());
		
		soya.settaste("good");
		soya.gettaste();
		System.out.println("taste:"+soya.gettaste());
		
	    soya.setratings(5);
		soya.getratings();
		System.out.println("pockets:"+soya.getratings());
		
		soya.setaddress("btm-layout");
		soya.getaddress();
		System.out.println("address:"+soya.getaddress());
		
		soya.setmanufacture("dec23");
		soya.getmanufacture();
		System.out.println("manufacture:"+soya.getmanufacture());
		
		soya.setexpiry("dec28");
		soya.getexpiry();
		System.out.println("expiry:"+soya.getexpiry());
		
	}






}