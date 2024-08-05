public class Sweet{

    public void displayDetails(String type) {
        System.out.println("Type of sweet: " + type);
    }

  
    public void displayDetails(String type, double weight) {
        System.out.println("Type of sweet: " + type + ", Weight: " + weight + " kg");
    }


    public void displayDetails(String type, double weight, String color) {
        System.out.println("Type of sweet: " + type + ", Weight: " + weight + " kg, Color: " + color);
    }

    public void displayDetails(String type, int sweetnessLevel) {
        System.out.println("Type of sweet: " + type + ", Sweetness Level: " + sweetnessLevel);
    }
}
