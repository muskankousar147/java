public class Call{
public String name;
public String reciever;
public int customers;
public int members;
public int offer;

public Call(){
	System.out.println("call details");
}


public Call(String name){
	this.name = name;
	System.out.println("name of the caller :"+name);	
}
public Call(String name, String reciever){
	this.reciever = reciever;
	System.out.println("reciever name:"+reciever);
}
public Call(String name, String reciever, int customers){
	this.customers = customers;
	System.out.println("customers details:"+customers);
}
public Call(String name, String reciever, int customers, int members){
	this.members = members;
	System.out.println("members of calling center:"+members);
}
public Call(String name, String reciever, int customers, int members, int offer){
	this.offer = offer;
	System.out.println("offers include:"+offer);
}


}

