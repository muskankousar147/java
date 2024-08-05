public class AdevertiseRunner{
	public static void main(String args[]){
		Adevertise adevertise = new Adevertise();
		
		adevertise.setadevertiseDetail("shop");
		adevertise.getadevertiseDetail();
		System.out.println("name:"+adevertise.getadevertiseDetail());
		
		adevertise.setadevertise("white-beauty");
		adevertise.getadevertise();
		System.out.println("name:"+adevertise.getadevertise());
		
		adevertise.setBrandName("majmuma");
		adevertise.getBrandName();
		System.out.println("brand name:"+adevertise.getBrandName());
		
		adevertise.setcompanyName("surf");
		adevertise.getcompanyName();
		System.out.println("company name:"+adevertise.getcompanyName());
		
		adevertise.setproduct(12);
		adevertise.getproduct();
		System.out.println("product:"+adevertise.getproduct());
		
		adevertise.setname("good");
		adevertise.getname();
		System.out.println("name:"+adevertise.getname());
		
	    adevertise.setratings(5);
		adevertise.getratings();
		System.out.println("pockets:"+adevertise.getratings());
		
		adevertise.setaddress("btm-layout");
		adevertise.getaddress();
		System.out.println("address:"+adevertise.getaddress());
		
		adevertise.setchannel("abp");
		adevertise.getchannel();
		System.out.println("channel:"+adevertise.getchannel());
		
		adevertise.setday("thursday");
		adevertise.getday();
		System.out.println("day:"+adevertise.getday());
		
	}






}