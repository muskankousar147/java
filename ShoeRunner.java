public class ShoeRunner{
	public static void main(String args[]){
		
		Shoe shoe = new Shoe();
		
		shoe.getShoeDetails();
		System.out.println("       save operation       ");
		shoe.save("puma");
		shoe.save("nike");
		shoe.save("skechers");
		shoe.save("bata");
		
		
		
	    System.out.println("      read operation       ");
		shoe.read();
		
		
		
	   System.out.println("       update operation       ");
        String updateResult = shoe.update("bata", "nike");
		shoe.read();
		
		
	   System.out.println("       delete operation       ");
       String deleteResult = shoe.delete("skechers");

		shoe.read();
		
		System.out.println("         search operation       ");
		String searchResult = shoe.search("puma");
		shoe.read();
		
	}



}