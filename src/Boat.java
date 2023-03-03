// Boat Class inherits from Vehicle Class
public class Boat extends Vehicle {
    // set up variables
    String material = ""; // has an extra variable, material
    // steel, aluminium, wood, fibre-reinforced plastic (FRP), and polyethylene
    double knots = 0.0; // has an extra variable, knots
    double mpg = 0.0; // has an extra variable, mpg
    boolean paddle = false; // has a modifier, paddle
    boolean sail = false; // has a modifier, sail
    boolean machinery = false; // has a modifier, machinery

    // class constructor - default
    public Boat() {
        super("", 0.0, 0, 0.0);
        this.material = "";
        this.knots = 0.0;
        this.mpg = 0.0;
    }

    // class constructor - alternate
    public Boat(String brand, double speed, int passengers, double cargo,
               String material, double knots, double mpg) {
        super(brand, speed, passengers, cargo); // uses the super constructor
        this.material = material; // also include the extra variable in the Boat constructor
        this.knots = knots; // also include the extra variable in the Boat constructor
        this.mpg = mpg; // also include the extra variable in the Boat constructor
    }

// knots * 1.15 = mph?

}
