public class Bobby {
    // encapsulation
    private String name;
    private int age; // primitive data: holdover from C
    private double coolnessFactor; // camelCase

    /*
    primitives from C/C++
    int (short, int, long), double (Float), boolean, char
     */
    private final double PI = 3.141578; //final means the value won't change

    /**
     * Javadoc Comment
     * Constructor -- build an object of this class
     */
    /**
     * Parameterized constructor for class Bobby
     * @param n name
     * @param a age
     * @param c coolness
     */
    public Bobby(String n, int a, double c) {
        name = n;   // Assignment operator - - right-associative
        age = a;
        coolnessFactor = c;
    }
    // Accessor Methods
    public String getName()     {return name;  }
    public int getAge()         {return age;    }

    /**
     * public return of coolnessFactor
     * @return  double representing how cool this Bobby is
     */
    public double getCoolness()     {return coolnessFactor;}

    public String toString()    {
        return name + " is " + age + " years old and is " + (coolnessFactor*100) + "% cool ";
    }

    /**
     * Main method of class Bobby
     * @param args Command line-arguments, if needed
     */
    public static void main(String[] args) {
        Bobby b = new Bobby("Methusalah", 969, .99);
        System.out.println(b.toString());
    }
}
