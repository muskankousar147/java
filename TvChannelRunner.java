public class TvChannelRunner{

public static void main(String args[]){
	TvChannel Details = new TvChannel();
    System.out.println(Details);

String Details1[] = {"timing","episode"};
String Details2[] = {"day", "show"};
String Details3[] = {"present","tomorrow"};
	
	
	TvChannel tvchannelDetails1 = new TvChannel("zeetv",(short)2, 234567l, 23);
	System.out.println(Details1);
	
	TvChannel tvchannelDetails2 = new TvChannel("zeecinema",(short)3, 234345l, 24);
	System.out.println(Details2);
	
	TvChannel tvchannelDetails3 = new TvChannel("starplus",(short)4, 235432l, 25);
	System.out.println(Details3);
	
	
}
}