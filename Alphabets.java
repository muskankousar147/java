public class Alphabets{
public int index = 0;
String alphabets[] = new String[26];
public int getalphabetsDetails(){
	return alphabets.length;
}
public String save(String elements){
	if(this.index<this.getalphabetsDetails()){
		alphabets[index] = elements;
		System.out.println("length found successfully");
		index++;
	}else{
		System.out.println("length not found");
	}
	return "successfull";	
}

	
public String read(){
	for(int index=0; index<getalphabetsDetails(); index++){
		System.out.println("alphabets found successfully ");
		return "found";
	}
	return "not found";
}
}