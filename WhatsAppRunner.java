public class WhatsAppRunner{
  public static void main(String args[]){
  
  
  WhatsApp whats = new WhatsApp();
  whats.setusername("muskan");
   if(whats.getusername()=="muskan" && whats.getusername()=="muskan"){
   System.out.println("name:"+whats.getusername());
   System.out.println("name is matching");
   }else{
   System.out.println("mis match");
   }
    //System.out.println("name:"+whats.getusername());
	
   whats.setuserId(123543);
   System.out.println("id:"+whats.getuserId());
   
   whats.setnoofUsers(10);
   if(whats.getnoofPost()>25 && whats.getnoofUsers()<50){
   System.out.println("noofPost:"+whats.getnoofUsers());
   System.out.println("no of post are matching");
   }else{
   System.out.println("mis match");
   }
   
   whats.setnoofContacts(120);
   System.out.println("contacts:"+face.getnoofContacts());
   
   whats.setnoofChannel(100);
   System.out.println("channel:"+face.getnoofChannel());
  }

}