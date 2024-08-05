public class ClothBrands{
public int index = 0;
String clothName[] = new String[4];
public int getClothDetails(){
	return clothName.length;
}
public String save(String elements){
	if(this.index<this.getClothDetails()){
		clothName[index] = elements;
		System.out.println("length found successfully");
		index++;
	}else{
		System.out.println("length not found");
	}
	return "successfull";	
}

	
public String read(){
	for(int index=0; index<getClothDetails(); index++){
		System.out.println("details of the cloth brand found successfully ");
		return "found";
	}
	return "not found";
}
}