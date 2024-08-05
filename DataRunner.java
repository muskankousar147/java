public class DataRunner{
	public static void main(String args[]){
		Data data = new Data();
		
		data.setgbDetail(2);
		data.getgbDetail();
		System.out.println("name:"+data.getgbDetail());
		
		data.setname("muskan");
		data.getname();
		System.out.println("name:"+data.getname());
		
		data.setaddress("btm");
		data.getaddress();
		System.out.println("address:"+data.getaddress());
		
		data.setsimName("jio");
		data.getsimName();
		System.out.println("sim name:"+data.getsimName());
		
		
	}
}