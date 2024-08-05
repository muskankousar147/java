public class FriendRunner{
public static void main(String args[]){
System.out.println("details of the Friend are:");
Friend.friendDetails("afrid");
String friendOne = Friend.friend("afrid", "btm");
System.out.println("friendOne:"+friendOne);

Friend.friendData();
String friendDataOne = Friend.friendData();
System.out.println("friendDataOne:"+friendDataOne);

Friend.friendInfo();

}


}