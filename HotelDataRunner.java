public class HotelDataRunner{
	public static void main(String args[]){
		HotelData hoteldata = new HotelData();
		
		hoteldata.sethotelDetail("view-point");
		hoteldata.gethotelDetail();
		System.out.println("name:"+hoteldata.gethotelDetail());
		
		hoteldata.sethotel("picnic");
		hoteldata.gethotel();
		System.out.println("name:"+hoteldata.gethotel());
		
		hoteldata.setresortName("wild-valley");
		hoteldata.getresortName();
		System.out.println("hotel name:"+hoteldata.gethotelName());
		
		hoteldata.setmanagerName("aman");
		hoteldata.getmanagerName();
		System.out.println("manager name:"+hoteldata.getmanagerName());
		
		hoteldata.setpackagedetail(12);
		hoteldata.getpackagedetail();
		System.out.println("package detail:"+hoteldata.getpackagedetail());
		
		hoteldata.setname("mahin");
		hoteldata.getname();
		System.out.println("fragrance:"+hoteldata.getname());
		
	    hoteldata.setratings(5);
		hoteldata.getratings();
		System.out.println("pockets:"+hoteldata.getratings());
		
		hoteldata.setaddress("btm-layout");
		hoteldata.getaddress();
		System.out.println("address:"+hoteldata.getaddress());
		
		hoteldata.setplace("banerghatta");
		hoteldata.getplace();
		System.out.println("manufacture:"+hoteldata.getplace());
		
		hoteldata.setlocation("bangalore");
		hoteldata.getlocation();
		System.out.println("expiry:"+hoteldata.getlocation());
		
	}






}