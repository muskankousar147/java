public class SessionRunner{
public static void main(String args[]){
System.out.println("details of the session are:");
Session.sessionDetails("dril");
String sessionOne = Session.session("dril", "x-workz");
System.out.println("sessionOne:"+sessionOne);

Session.sessionData();
String sessionDataOne = Session.sessionData();
System.out.println("sessionDataOne:"+sessionDataOne);

Session.sessionInfo();

}


}