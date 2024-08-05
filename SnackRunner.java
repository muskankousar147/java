public class SnackRunner{
	public static void main(String args[]){
		Snack snack = new Snack();
		
		snack.setSnackDetail("sev");
		snack.getSnackDetail();
		System.out.println("name:"+snack.getSnackDetail());
		
		snack.setSnack("kurkure");
		snack.getSnack();
		System.out.println("name:"+snack.getSnack());
		
		snack.setBrandName("everest");
		snack.getBrandName();
		System.out.println("brand name:"+snack.getBrandName());
		
		snack.setCompanyName("balaji");
		snack.getCompanyName();
		System.out.println("company name:"+snack.getCompanyName());
		
		snack.setpockets(12);
		snack.getpockets();
		System.out.println("pockets:"+snack.getpockets());
		
		snack.settaste("good");
		snack.gettaste();
		System.out.println("taste:"+snack.gettaste());
		
	    snack.setratings(5);
		snack.getratings();
		System.out.println("pockets:"+snack.getratings());
		
		snack.setaddress("btm-layout");
		snack.getaddress();
		System.out.println("address:"+snack.getaddress());
		
		snack.setmanufacture("dec23");
		snack.getmanufacture();
		System.out.println("manufacture:"+snack.getmanufacture());
		
		snack.setexpiry("jan27");
		snack.getexpiry();
		System.out.println("expiry:"+snack.getexpiry());
		
	}






}