public class CityRunner{
public static void main(String args[]){
City city = new City(67);
System.out.println(city);

City city1 = new City (67,"bangalore");
System.out.println(city1);

City city2 = new City (67,"bangalore");
System.out.println(city2);

City city3 = new City (67,"bangalore","india");
System.out.println(city3);

City city4 = new City (67,"bangalore","india","karnataka");
System.out.println(city4);

City city5 = new City (67,"bangalore","india","karnataka","north");
System.out.println(city5);

City city6 = new City (67,"bangalore","india","karnataka","north", 56);
System.out.println(city6);

City city7 = new City (67,"bangalore","india","karnataka","north", 56, 23);
System.out.println(city7);

City city8 = new City (67,"bangalore","india","karnataka","north", 56, 23, 34);
System.out.println(city8);

City city9 = new City (67,"bangalore","india","karnataka","north", 56, 23, 34, 12);
System.out.println(city9);

}

}