public class ResortRunner{
	public static void main(String args[]){
		Resort resort = new Resort();
		
		resort.setresortDetail("view-point");
		resort.getresortDetail();
		System.out.println("name:"+resort.getresortDetail());
		
		resort.setresort("picnic");
		resort.getresort();
		System.out.println("name:"+resort.getresort());
		
		resort.setresortName("wild-valley");
		resort.getresortName();
		System.out.println("brand name:"+resort.getresortName());
		
		resort.setmanagerName("aman");
		resort.getmanagerName();
		System.out.println("manager name:"+resort.getmanagerName());
		
		resort.setpackagedetail(12);
		resort.getpackagedetail();
		System.out.println("package detail:"+resort.getpackagedetail());
		
		resort.setname("mahin");
		resort.getname();
		System.out.println("fragrance:"+resort.getname());
		
	    resort.setratings(5);
		resort.getratings();
		System.out.println("pockets:"+resort.getratings());
		
		resort.setaddress("btm-layout");
		resort.getaddress();
		System.out.println("address:"+resort.getaddress());
		
		resort.setplace("banerghatta");
		resort.getplace();
		System.out.println("manufacture:"+resort.getplace());
		
		resort.setlocation("bangalore");
		resort.getlocation();
		System.out.println("expiry:"+resort.getlocation());
		
	}






}