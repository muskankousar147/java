public class WhatsApp{
 
 private String username;
 private int userId;;
 private int noofUsers;
 private int noofContacts;
 private int noofChannel;
 
 public WhatsApp(){
   System.out.println("no argument constructor");
 }
 
 public WhatsApp(String username,int userId,int noofUsers,int noofContacts,int noofChannel){
  this.username=username;
  this.userId=userId;
  this.noofUsers=noofUsers;
  this.noofContacts=noofContacts;
  this.noofChannel=noofChannel;
 }
 
 public void setusername(String username){
   this.username=username;
 }
 
 public String getusername(){
   return this.username;
 }
 
 public void setuserId(int userId){
   this.userId=userId;
  }
  
  public int getuserId(){
   return this.userId;
  }
  public void setnoofPost(int noofUsers){
   this.noofUsers=noofUsers;
   }
   public int getnoofUsers(){
    return this.noofUsers;
  }
  public void setnoofContacts(int noofContacts){
   this.noofContacts=noofContacts;
   }
   
   public int getnoofContacts(){
     return this.noofContacts;
   }
   public void setnoofChannel(int noofChannel){
   this.noofChannel=noofChannel;
   }
   public int getnoofChannel(){
    return this.noofChannel;
   }
   
   
  

   
}