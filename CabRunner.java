public class CabRunner{
public static void main(String args[]){
Cab cab = new Cab("kabir");
System.out.println(cab);

Cab cab1 = new Cab("kabir", 23);
System.out.println(cab1);

Cab cab2 = new Cab("kabir", 23, 24);
System.out.println(cab2);

Cab cab3 = new Cab("kabir", 23, 24, "zishan");
System.out.println(cab3);

Cab cab4 = new Cab("kabir", 23, 24, "zishan", 26);
System.out.println(cab4);

Cab cab5 = new Cab("kabir", 23, 24, "zishan", 26, "bangalore");
System.out.println(cab5);

}
}