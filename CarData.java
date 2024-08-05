public class CarData{
public String color;
public String model;
public int num;
public String ownerName;
public String companyName;
public int milage;
 
 
 public void CarDetails(String color,String model,int num,String ownerName,String companyName,int milage){
	 this.color = color;
	 this.model = model;
	 this.num = num;
	 this.ownerName = ownerName;
	 this.companyName = companyName;
	 this.milage = milage;
	 
	 System.out.println("car data:" +color+ " " +model+ " " +num+ " " +ownerName+ " " +companyName+ " " +milage);
	 
 }
}