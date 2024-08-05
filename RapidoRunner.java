public class RapidoRunner{
public static void main(String args[]){
Rapido rapido = new Rapido("uday");
System.out.println(rapido);

Rapido rapido1 = new Rapido("uday", 23);
System.out.println(rapido1);

Rapido rapido2 = new Rapido("uday", 23, 24);
System.out.println(rapido2);

Rapido rapido3 = new Rapido("uday", 23, 24, "rahul");
System.out.println(rapido3);

Rapido rapido4 = new Rapido("uday", 23, 24, "rahul", 26);
System.out.println(rapido4);

Rapido rapido5 = new Rapido("uday", 23, 24, "rahul", 26, "bangalore");
System.out.println(rapido5);

}
}