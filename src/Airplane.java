// Airplane Class inherits from Vehicle Class
public class Airplane extends Vehicle {
    // set up variables
    String engine = ""; // has an extra variable, engine
    // jet and reciprocating
    int fuelCapacity = 0; // has an extra variable, fuelCapacity
    int wings = 0; // has an extra variable, wings
    int wheels = 0; // has an extra variable, wheels
    boolean propeller = false; // has a modifier, propeller
    boolean spoiler = false; // has a modifier, spoiler

    // class constructor - default
    public Airplane() {
        super("", 0.0, 0, 0.0);
        this.engine = "";
        this.fuelCapacity = 0;
        this.wings = 0;
        this.wheels = 0;
    }

    // class constructor - alternate
    public Airplane(String brand, double speed, int passengers, double cargo,
                    String engine, int fuelCapacity, int wings, int wheels) {
        super(brand, speed, passengers, cargo); // uses the super constructor
        this.engine = engine; // also include the extra variable in the Airplane constructor
        this.fuelCapacity = fuelCapacity; // also include the extra variable in the Airplane constructor
        this.wings = wings; // also include the extra variable in the Airplane constructor
        this.wheels = wheels; // also include the extra variable in the Airplane constructor
    }

    // set engine
    public void setEngine(String engine) {
        this.engine = engine;
    }

    // get engine
    public String getEngine() {
        return this.engine;
    }

    // set fuelCapacity
    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    // get fuelCapacity
    public int getFuelCapacity() {
        return this.fuelCapacity;
    }

    // set wings
    public void setWings(int wings) {
        this.wings = wings;
    }

    // get wings
    public int getWings() {
        return this.wings;
    }

    // set wheels
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    // get wheels
    public int getWheels() {
        return this.wheels;
    }

    // set propeller
    public void setPropeller(boolean propeller) {
        this.propeller = propeller;
    }

    // get propeller
    public boolean getPropeller() {
        return this.propeller;
    }

    // set spoiler
    public void setSpoiler(boolean spoiler) {
        this.spoiler = spoiler;
    }

    // get spoiler
    public boolean getSpoiler() {
        return this.spoiler;
    }

    // get speed
    // overrides the super getSpeed method
    @Override
    public double getSpeed() {
        if (propeller) {
            return super.getSpeed() * 1.2;
        }
        if (spoiler) {
            return super.getSpeed() * 1.8;
        } else {
            return super.getSpeed();
        }
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "Engine: \t\t" + this.getEngine() + "\n" +
                                  "Fuel (L): \t\t" + this.getFuelCapacity() + "\n" +
                                  "Wings: \t\t\t" + this.getWings() + "\n" +
                                  "Wheels: \t\t" + this.getWheels() + "\n";
    }
}
