public class BedRunner{
	public static void main(String args[]){
		
		Bed bed = new Bed();
		
		bed.getBedDetails();
		System.out.println("       save operation       ");
		bed.save("bunkbeds");
		bed.save("platform");
		bed.save("futon");
		bed.save("round");
		
		
		
	    System.out.println("      read operation       ");
		bed.read();
		
		
		
	   System.out.println("       update operation       ");
        String updateResult = bed.update("round", "futon");
		bed.read();
		
		
	   System.out.println("       delete operation       ");
       String deleteResult = bed.delete("futon");

		bed.read();
		
		System.out.println("         search operation       ");
		String searchResult = bed.search("platform");
		bed.read();
		
	}



}