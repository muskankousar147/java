public class TbDamRunner{

public static void main(String args[]){
	TbDam Detail = new TbDam();
    System.out.println(Detail);

String Detail1[] = {"timing","workers"};
String Detail2[] = {"day", "month"};
String Detail3[] = {"present","tomorrow"};
	
	
	TbDam tbDamDetail1 = new TbDam("malli",(short)8, 98765434, 31);
	System.out.println(tbDamDetail1);
	
	TbDam tbDamDetail2 = new TbDam("krishna",(short)9, 2445675, 32);
	System.out.println(tbDamDetail2);
	
	TbDam tbDamDetail3 = new TbDam("john",(short)6, 235432l, 67);
	System.out.println(tbDamDetail3);
	
	
}
}