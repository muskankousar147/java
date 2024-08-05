public class TrainInformationRunner{
public static void main(String args[]){
TrainInformation traininformation = new TrainInformation("hampiexpress");
System.out.println(traininformation);

TrainInformation traininformation1 = new TrainInformation("hampiexpress", 23);
System.out.println(traininformation1);

TrainInformation traininformation2 = new TrainInformation("hampiexpress", 23, 24);
System.out.println(traininformation2);

TrainInformation traininformation3 = new TrainInformation("hampiexpress", 23, 24, 25);
System.out.println(traininformation3);

TrainInformation traininformation4 = new TrainInformation("hampiexpress", 23, 24, 25, 26);
System.out.println(traininformation4);


}
}