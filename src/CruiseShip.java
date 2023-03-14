// CruiseShip Class inherits from Boat Class
public class CruiseShip extends Boat {
    // set up variables
    String destination = ""; // has an extra variable, destination
    int rating = 0; // has an extra variable, rating
    boolean cafeteria = false; // has a modifier, cafeteria
    boolean pool = false; // has a modifier, pool

    // class constructor - default
    public CruiseShip() {
        super("", 0.0, 0, 0.0, "", 0.0);
        this.destination = "";
        this.rating = 0;
    }

    // class constructor - alternate
    public CruiseShip(String brand, double speed, int passengers, double cargo,
                      String material, double nmpg,
                      String destination) {
        super(brand, speed, passengers, cargo, material, nmpg); // uses the super constructor
        this.destination = destination; // also include the extra variable in the CruiseShip constructor
        this.rating = 0; // also include the extra variable in the CruiseShip constructor
    }

    // set destination
    public void setDestination(String destination) {
        this.destination = destination;
    }

    // get destination
    public String getDestination() {
        return this.destination;
    }

    // set rating
    public void setRating(int rating) {
        this.rating = rating;
    }

    // get rating
    public int getRating() {
        if (cafeteria) {
            return this.rating + 3;
        }
        if (pool) {
            return this.rating + 2;
        } else {
            return this.rating;
        }
    }

    // set cafeteria
    public void setCafeteria(boolean cafeteria) {
        this.cafeteria = cafeteria;
    }

    // get cafeteria
    public boolean getCafeteria() {
        return this.cafeteria;
    }

    // set pool
    public void setPool(boolean pool) {
        this.pool = pool;
    }

    // get pool
    public boolean getPool() {
        return this.pool;
    }

    // get knots
    // overrides the super getKnots method
    @Override
    public double getKnots() {
        if (cafeteria) {
            return super.getKnots() - 1;
        }
        if (pool) {
            return super.getKnots() - 0.5;
        } else {
            return super.getKnots();
        }
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "Destination: \t" + this.getDestination() + "\n" +
                                  "Rating: \t\t" + this.getRating() + "\n";
    }
}
