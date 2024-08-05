public class DramaRunner{
public static void main(String args[]){
Drama drama = new Drama("jaannisar");
System.out.println(drama);

Drama drama1 = new Drama("jaannisar", 23);
System.out.println(drama1);

Drama drama2 = new Drama("jaannisar", 23, 24);
System.out.println(drama2);

Drama drama3 = new Drama("jaannisar", 23, 24, 25);
System.out.println(drama3);

Drama drama4 = new Drama("jaannisar", 23, 24, 25, 26);
System.out.println(drama4);


}
}