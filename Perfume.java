public class Perfume{
public int index = 0;
String perfumeNames[] = new String[4];
public int getPerfumeDetails(){
	return perfumeNames.length;
}
//save operation
public String save(String elements){
	if(this.index<this.getPerfumeDetails()){
		System.out.println("length found successfully");
		perfumeNames[index] = elements;
		index++;
	}else{
		System.out.println("length not found");
	}
	return "successfull";	
}

	//read operation
public String read(){
	for(int index=0; index<getPerfumeDetails(); index++){
		System.out.println("details of the perfume found successfully:"+perfumeNames[index]);
		return "names found";
	}
	return "names not found";
}

//update operation

public String update(String perfumeNames, String perfumeName){
	for(int index = 0; index<getPerfumeDetails(); index++){
		if(perfumeNames == perfumeName){
			perfumeNames = perfumeName;
			return "name is";
			
		}
	}
	
	return "wrong name";
	
}


//delete operation

public String delete(String perfumeNames){
	for(int index = 0; index<getPerfumeDetails(); index++){
		if(perfumeNames == perfumeNames){
			perfumeNames = null;
			return "deleted successfully";
		}
	}
	
	return "not deleted";
}

//search operation


public String search(String perfumeNames1){
	for(String name : perfumeNames){
		if(name== perfumeNames1){
			return "name found";	
		}
	}
	return "name not found";
	
}


}