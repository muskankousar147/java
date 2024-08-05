public class Bag{
public int index = 0;
String bagNames[] = new String[4];
public int getBagDetails(){
	return bagNames.length;
}
//save operation
public String save(String elements){
	if(this.index<this.getBagDetails()){
		System.out.println("length found successfully");
		bagNames[index] = elements;
		index++;
	}else{
		System.out.println("length not found");
	}
	return "successfull";	
}

	//read operation
public String read(){
	for(int index=0; index<getBagDetails(); index++){
		System.out.println("details of the bag found successfully:"+bagNames[index]);
		return "names found";
	}
	return "names not found";
}

//update operation

public String update(String bagNames, String bagName){
	for(int index = 0; index<getBagDetails(); index++){
		if(bagNames == bagName){
			bagNames = bagName;
			return "name is";
			
		}
	}
	
	return "wrong name";
	
}


//delete operation

public String delete(String bagNames){
	for(int index = 0; index<getBagDetails(); index++){
		if(bagNames == bagNames){
			bagNames = null;
			return "deleted successfully";
		}
	}
	
	return "not deleted";
}

//search operation


public String search(String bagNames1){
	for(String name : bagNames){
		if(name== bagNames1){
			return "name found";	
		}
	}
	return "name not found";
	
}


}