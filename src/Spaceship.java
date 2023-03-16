// Spaceship Class inherits from Vehicle Class
public class Spaceship extends Vehicle {
    // set up variables
    String propulsion = ""; // has an extra variable, propulsion
    // jet engine, rocket engine, pump-jet, hall-effect thrusters, ion drive, mass drivers, and nuclear pulse propulsion
    String fuel = ""; // has an extra variable, fuel
    // liquid hydrogen and liquid oxygen
    double fuelConsumption = 0.0; // has an extra variable, fuelConsumption

    // class constructor - default
    public Spaceship() {
        super("", 0.0, 0, 0.0);
        this.propulsion = "";
        this.fuel = "";
        this.fuelConsumption = 0.0;
    }

    // class constructor - alternate
    public Spaceship(String brand, double speed, int passengers, double cargo,
                     String propulsion, String fuel, double fuelConsumption) {
        super(brand, speed, passengers, cargo); // uses the super constructor
        this.propulsion = propulsion; // also include the extra variable in the Spaceship constructor
        this.fuel = fuel; // also include the extra variable in the Spaceship constructor
        this.fuelConsumption = fuelConsumption; // also include the extra variable in the Spaceship constructor
    }

    // set propulsion
    public void setPropulsion(String propulsion) {
        this.propulsion = propulsion;
    }

    // get propulsion
    public String getPropulsion() {
        return this.propulsion;
    }

    // set fuel
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    // get fuel
    public String getFuel() {
        return this.fuel;
    }

    // set fuelConsumption
    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    // get fuelConsumption
    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "Propulsion: \t" + this.getPropulsion() + "\n" +
                                  "Fuel: \t\t\t" + this.getFuel() + "\n" +
                                  "LBMS: \t\t\t" + this.getFuelConsumption() + "\n";
    }
}
