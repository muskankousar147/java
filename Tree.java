public class Tree{
    
    private int[] tree;
    private double[] weight;
    private String[] name;
    private char[] initial;

    // Constructor to initialize the arrays
    public Tree(int[] tree, double[] weight, String[] name, char[] initial) {
        this.tree = tree;
        this.weight = weight;
        this.name = name;
        this.initial = initial;
    }

    // Getter for tree
    public int[] gettree() {
        return tree;
    }

    // Getter for weight
    public double[] getweight() {
        return weight;
    }

    // Getter for name
    public String[] getname() {
        return name;
    }

    // Getter for initial
    public char[] getinitial() {
        return initial;
    }

    // Method to display all arrays
    public void displaytreedetails() {
        System.out.println("tree:");
        for (int total : tree) {
            System.out.print(total + " ");
        }
        System.out.println();

        System.out.println("weight:");
        for (double totalweight : weight) {
            System.out.print(totalweight + " ");
        }
        System.out.println();

        System.out.println("name:");
        for (String data : name) {
            System.out.print(data + " ");
        }
        System.out.println();

        System.out.println("initial:");
        for (char symbol : initial) {
            System.out.print(symbol + " ");
        }
        System.out.println();
    }
}
    