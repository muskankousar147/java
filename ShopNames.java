public class ShopNames{
public int index = 0;
String shopName[] = new String[3];
public int getShopNamesDetails(){
	return shopName.length;
}
public String save(String elements){
	if(this.index<this.getShopNamesDetails()){
		shopName[index] = elements;
		System.out.println("length found successfully");
		index++;
	}else{
		System.out.println("length not found");
	}
	return "successfull";	
}

	
public String read(){
	for(int index=0; index<getShopNamesDetails(); index++){
		System.out.println("details of the shop names found successfully ");
		return "found";
	}
	return "not found";
}
}