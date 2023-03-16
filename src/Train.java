// Train Class inherits from Vehicle Class
public class Train extends Vehicle {
    // set up variables
    String fuel = ""; // has an extra variable, fuel
    // diesel, gas, electric, steam, and coal
    int railCars = 0; // has an extra variable, railCars
    boolean maglev = false; // has a modifier, maglev

    // class constructor - default
    public Train() {
        super("", 0.0, 0, 0.0);
        this.fuel = "";
        this.railCars = 0;
    }

    // class constructor - alternate
    public Train(String brand, double speed, int passengers, double cargo,
                 String fuel, int railCars) {
        super(brand, speed, passengers, cargo); // uses the super constructor
        this.fuel = fuel; // also include the extra variable in the Train constructor
        this.railCars = railCars; // also include the extra variable in the Train constructor
    }

    // set fuel
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    // get fuel
    public String getFuel() {
        return this.fuel;
    }

    // set railCars
    public void setRailCars(int railCars) {
        this.railCars = railCars;
    }

    // get railCars
    public int getRailCars() {
        return this.railCars;
    }

    // set maglev
    public void setMaglev(boolean maglev) {
        this.maglev = maglev;
    }

    // get maglev
    public boolean getMaglev() {
        return this.maglev;
    }

    // get speed
    // overrides the super getSpeed method
    @Override
    public double getSpeed() {
        if (maglev) {
            return super.getSpeed() * 5;
        } else {
            return super.getSpeed();
        }
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "Fuel: \t\t\t" + this.getFuel() + "\n" +
                                  "Rail Cars: \t\t" + this.getRailCars() + "\n";
    }
}
