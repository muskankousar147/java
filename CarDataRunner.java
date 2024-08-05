public class CarDataRunner{

public static void main(String args[]){
	System.out.println("details of the car");
	CarData cardata = new CarData("blue");
	 System.out.println(cardata);
	 
	 CarData cardata1 = new CarData("blue", "mercedes");
	 System.out.println(cardata1);
	 
	 
	 CarData cardata2 = new CarData("blue", "mercedes", 34543);
	 System.out.println(cardata2);
	 
	 CarData cardata3 = new CarData("blue", "mercedes", 34543, "afrid");
	 System.out.println(cardata3);
	
	
	CarData cardata4 = new CarData("blue", "mercedes", 34543, "afrid", "tata");
	 System.out.println(cardata4);
	 
	 
	 CarData cardata5 = new CarData("blue", "mercedes", 34543, "afrid", "tata",230);
	 System.out.println(cardata5);
	 
	
	
	
	
	
}




}