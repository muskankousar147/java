public class PerfumeRunner{
	public static void main(String args[]){
		
		Perfume perfume = new Perfume();
		
		perfume.getPerfumeDetails();
		System.out.println("       save operation       ");
		perfume.save("laura");
		perfume.save("fog");
		perfume.save("mahek");
		perfume.save("gucchi");
		
		
		
	    System.out.println("      read operation       ");
		perfume.read();
		
		
		
	   System.out.println("       update operation       ");
        String updateResult = perfume.update("laura", "fog");
		perfume.read();
		
		
	   System.out.println("       delete operation       ");
       String deleteResult = perfume.delete("laura");

		perfume.read();
		
		System.out.println("         search operation       ");
		String searchResult = perfume.search("mahek");
		perfume.read();
		
	}



}