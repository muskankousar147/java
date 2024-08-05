public class Shoe{
public int index = 0;
String shoeNames[] = new String[4];
public int getShoeDetails(){
	return shoeNames.length;
}
//save operation
public String save(String elements){
	if(this.index<this.getShoeDetails()){
		System.out.println("length found successfully");
		shoeNames[index] = elements;
		index++;
	}else{
		System.out.println("length not found");
	}
	return "successfull";	
}

	//read operation
public String read(){
	for(int index=0; index<getShoeDetails(); index++){
		System.out.println("details of the shoe Name found successfully:"+shoeNames[index]);
		return "names found";
	}
	return "names not found";
}

//update operation

public String update(String shoeNames, String shoeName){
	for(int index = 0; index<getShoeDetails(); index++){
		if(shoeNames == shoeName){
			shoeNames = shoeName;
			return "name is";
			
		}
	}
	
	return "wrong name";
	
}


//delete operation

public String delete(String shoeNames){
	for(int index = 0; index<getShoeDetails(); index++){
		if(shoeNames == shoeNames){
			shoeNames = null;
			return "deleted successfully";
		}
	}
	
	return "not deleted";
}

//search operation


public String search(String shoeNames1){
	for(String name : shoeNames){
		if(name== shoeNames1){
			return "name found";	
		}
	}
	return "name not found";
	
}


}