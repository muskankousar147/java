public class Pen{

    public void displayDetails(String type) {
        System.out.println("Type of pen: " + type);
    }

  
    public void displayDetails(String type, double weight) {
        System.out.println("Type of pen: " + type + ", Weight: " + weight + "pieces");
    }


    public void displayDetails(String type, double weight, String color) {
        System.out.println("Type of pen: " + type + ", Weight: " + weight + " pieces, Color: " + color);
    }

    public void displayDetails(String type, int inkLevel) {
        System.out.println("Type of pen: " + type + ", ink Level: " + inkLevel);
    }
}
