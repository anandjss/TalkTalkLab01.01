/**
 * Class Widget represents a simple product for testing
 * @version 09/15/22
 * @author 24jayashankar
 */
public class Widget {
    private String name;
    private int ID;
    private double cost;

    /**
     * Default constructor for class Widget
     */
    public Widget() {
        name = new String();
        ID = 0;
        cost = 0.;

    }

    /**
     * Parameterized constructor for class widget
     * @param n A string for the name value
     * @param i An int for the ID value
     * @param c A double for the cost value
     */
    public Widget(String n, int i, double c)       {
        name = n;
        ID = i;
        cost = c;
    }

    public String toString()    {
        return name + "\t" + ID + "\t$" + cost;
    }

    /**
     * Main Method for the class Widget
     * @param args Command-line arguments, if needed
     */
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++)  // i++ implies i will increase by 1 each time
            System.out.println(args[i]);
        Widget w = new Widget("waffle", 123, .75);
        Widget myBad = new Widget(); // null means no memory address
        System.out.println(w);
        System.out.println(myBad);

    }
}
