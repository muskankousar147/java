public class TheaterRunner{

public static void main(String args[]){
	Theater Information = new Theater();
    System.out.println(Information);

String Information1[] = {"timing","episode"};
String Information2[] = {"day", "show"};
String Information3[] = {"present","tomorrow"};
	
	
	Theater TheaterInformation1 = new Theater("sripati",(short)2, 234567l, 30);
	System.out.println(TheaterInformation1);
	
	Theater TheaterInformation2 = new Theater("bala",(short)3, 234345l, 41);
	System.out.println(TheaterInformation2);
	
	Theater TheaterInformation3 = new Theater("meer-aalam",(short)4, 235432l, 67);
	System.out.println(TheaterInformation3);
	
	
}
}