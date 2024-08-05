public class SpotRunner{
	public static void main(String args[]){
		Spot spot = new Spot();
		
		spot.setspotDetail("view-point");
		spot.getspotDetail();
		System.out.println("name:"+spot.getspotDetail());
		
		spot.setspot("picnic");
		spot.getspot();
		System.out.println("name:"+spot.getspot());
		
		spot.setspotName("majmuma");
		spot.getspotName();
		System.out.println("brand name:"+spot.getspotName());
		
		spot.setmanagerName("aman");
		spot.getmanagerName();
		System.out.println("manager name:"+spot.getmanagerName());
		
		spot.setpackagedetail(12);
		spot.getpackagedetail();
		System.out.println("package detail:"+spot.getpackagedetail());
		
		spot.setname("mahin");
		spot.getname();
		System.out.println("fragrance:"+spot.getname());
		
	    spot.setratings(5);
		spot.getratings();
		System.out.println("pockets:"+spot.getratings());
		
		spot.setaddress("btm-layout");
		spot.getaddress();
		System.out.println("address:"+spot.getaddress());
		
		spot.setplace("banerghatta");
		spot.getplace();
		System.out.println("manufacture:"+spot.getplace());
		
		spot.setlocation("bangalore");
		spot.getlocation();
		System.out.println("expiry:"+spot.getlocation());
		
	}






}