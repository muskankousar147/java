public class TreeRunner{
public static void main(String args[]){
        // Initialize array variables
        int[] tree = {1, 2, 3, 4, 5};
        double[] weight = {1.1, 2.2, 3.3, 4.4};
        String[] name = {"afrid", "basha"};
        char[] initial = {'A', 'B', 'C'};

        // instance of class
        Tree tree = new Tree(tree, weight, name, initial);

        // Display the arrays
        tree.displaytreeDetails();
    }
}