public class BagRunner{
	public static void main(String args[]){
		
		Bag bag = new Bag();
		
		bag.getBagDetails();
		System.out.println("       save operation       ");
		bag.save("burberry");
		bag.save("baggit");
		bag.save("prada");
		bag.save("skybags");
		
		
		
	    System.out.println("      read operation       ");
		bag.read();
		
		
		
	   System.out.println("       update operation       ");
        String updateResult = bag.update("burberry", "baggit");
		bag.read();
		
		
	   System.out.println("       delete operation       ");
       String deleteResult = bag.delete("skybags");

		bag.read();
		
		System.out.println("         search operation       ");
		String searchResult = bag.search("prada");
		bag.read();
		
	}



}