public class Count{
public static void main(String args[]){
int number[] = {2,3,4,5,6,-9,-7,-6,-0};
for(int i=0; i<=number.length; i++){
if(number[i]>=0){
System.out.println("number is true:"+number[i]);
}else{
System.out.println("number is not positive:"+number[i]);
}
}
}
}