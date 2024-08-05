public class FreeFireRunner{

public static void main(String args[]){
	FreeFire Information = new FreeFire();
    System.out.println(Information);

String Data1[] = {"timing","players"};
String Data2[] = {"day", "members"};
String Data3[] = {"present","tomorrow"};
	
	
	FreeFire FreeFireData1 = new FreeFire("xyz",(short)3, 987665l, 65);
	System.out.println(FreeFireData1);
	
	FreeFire FreeFireData2 = new FreeFire("abc",(short)4, 342536, 81);
	System.out.println(FreeFireData2);
	
	FreeFire FreeFireData3 = new FreeFire("cdgf",(short)5, 9876676, 63);
	System.out.println(FreeFireData3);
	
	
}
}