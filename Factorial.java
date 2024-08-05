public class Factorial{
public static int factorial(int n){
if(n==0||n==1){
return 1;
}else{
return n*factorial(n-1);
}
}
public static int[] factorialOfElements(int[] arr){
int[] result = new int[arr.length];
for(int i=0;i<arr.length;i++){
result[i] = factorial(arr[i]);

}
return result;
 }


}