public class CallRunner{
public static void main(String args[]){
Call call = new Call("jhansi");
System.out.println(call);

Call call1 = new Call("jhansi", "john");
System.out.println(call1);

Call call2 = new Call("jhansi", "john", 24);
System.out.println(call2);

Call call3 = new Call("jhansi", "john", 24, 25);
System.out.println(call3);

Call call4 = new Call("jhansi", "john", 24, 25, 26);
System.out.println(call4);


}
}