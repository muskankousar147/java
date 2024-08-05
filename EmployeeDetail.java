public class EmployeeDetail{
public String name;
public int id;
public String department;

public EmployeeDetail(){
	System.out.println("default constructor");
}
public EmployeeDetail(String name){
	this.name = name;
	System.out.println("name:"+name);
	
}
public EmployeeDetail(String name, int id){
	this.name = name;
	this.id = id;
	System.out.println("employee details are:"+name+ " " +id);
	
}
public EmployeeDetail(String name, int id, String department){
	this.name = name;
	this.id = id;
	this.department = department;
	System.out.println("employee detials:"+name+ " " +id+ " " +department);
	
}



}