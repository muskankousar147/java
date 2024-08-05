public class Bed{
public int index = 0;
String bedNames[] = new String[4];
public int getBedDetails(){
	return bedNames.length;
}
//save operation
public String save(String elements){
	if(this.index<this.getBedDetails()){
		System.out.println("length found successfully");
		bedNames[index] = elements;
		index++;
	}else{
		System.out.println("length not found");
	}
	return "successfull";	
}

	//read operation
public String read(){
	for(int index=0; index<getBedDetails(); index++){
		System.out.println("details of the bag found successfully:"+bedNames[index]);
		return "names found";
	}
	return "names not found";
}

//update operation

public String update(String bedNames, String bedName){
	for(int index = 0; index<getBedDetails(); index++){
		if(bedNames == bedName){
			bedNames = bedName;
			return "name is";
			
		}
	}
	
	return "wrong name";
	
}


//delete operation

public String delete(String bedNames){
	for(int index = 0; index<getBedDetails(); index++){
		if(bedNames == bedNames){
			bedNames = null;
			return "deleted successfully";
		}
	}
	
	return "not deleted";
}

//search operation


public String search(String bedNames1){
	for(String name : bedNames){
		if(name== bedNames1){
			return "name found";	
		}
	}
	return "name not found";
	
}


}