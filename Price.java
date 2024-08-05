public class Price{
public int index = 0;
int price[] = new int[2];
public int getpriceDetails(){
	return price.length;
}
public String save(int value){
	if(this.index<this.getpriceDetails()){
		price[index] = value;
		System.out.println("length found successfully");
		index++;
	}else{
		System.out.println("length not found");
	}
	return "successfull";	
}

	
public String read(){
	for(int index=0; index<getpriceDetails(); index++){
		System.out.println("details of the price found successfully ");
		return "found";
	}
	return "not found";
}
}