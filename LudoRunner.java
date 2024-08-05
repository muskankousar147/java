public class LudoRunner{

public static void main(String args[]){
	Ludo Detail = new Ludo();
    System.out.println(Detail);

String Detail1[] = {"timing","game"};
String Detail2[] = {"day", "players"};
String Detail3[] = {"present","tomorrow"};
	
	
	Ludo LudoDetail1 = new Ludo("muskan",(short)2, 234567l, 30);
	System.out.println(Detail1);
	
	Ludo LudoDetail2 = new Ludo("afrid",(short)3, 234345l, 41);
	System.out.println(Detail2);
	
	Ludo LudoDetail3 = new Ludo("dua",(short)4, 235432l, 67);
	System.out.println(Detail3);
	
	
}
}