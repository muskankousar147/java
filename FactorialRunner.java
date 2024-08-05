public class FactorialRunner{
public static void main(String args[]){
int[] arr = {2,3,5,7};
int[] factorials = factorialOfElements(arr);
System.out.println("factorialOfElements in the array");
for(int i=0; i<arr.length; i++){
System.out.println("factorial of elements:" +factorials);
}
}

}